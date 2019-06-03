package br.com.impacta.estacionamento.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.com.impacta.estacionamento.model.Movimentacao;
import br.com.impacta.estacionamento.model.Vaga;
import br.com.impacta.estacionamento.model.Veiculo;

public class DAOMovimentacao {

	public void registrar(Movimentacao movimentacao) {

		String sql1 = "insert into tb_movimentacoes (placa, marca, modelo, cor, data_entrada) "
				+ " values (?,?,?,?,?)";

		String sql2 = "update tb_status set vagas_ocupadas = ?";

		Connection con = getConnection();

		try {
			con.setAutoCommit(false); // avisa quando devo fazer o commit.

			PreparedStatement psInsert = con.prepareStatement(sql1);
			PreparedStatement psUpdateVagas = con.prepareStatement(sql2);

			psInsert.setString(1, movimentacao.getVeiculo().getPlaca());
			psInsert.setString(2, movimentacao.getVeiculo().getMarca());
			psInsert.setString(3, movimentacao.getVeiculo().getModelo());
			psInsert.setString(4, movimentacao.getVeiculo().getCor());
			psInsert.setString(5, movimentacao.getDataHoraEntrada().toString());

			psInsert.execute();

			psUpdateVagas.setInt(1, Vaga.getVagasOcupadas() + 1);

			psUpdateVagas.execute();

			con.commit();

		} catch (SQLException e) {
			try {
				con.commit();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new RuntimeException(e);

		} finally {
			closeConnection(con);
		}

	}

	public Movimentacao buscarMovimentacaoAberta(String placa) {
		Movimentacao movimentacao = null;

		String sql = "select placa, marca, modelo, cor, data_entrada from tb_movimentacoes "
				+ " where placa = ? and data_saida is null";

		Connection con = getConnection();

		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, placa);
			ResultSet result = ps.executeQuery();

			if (result.next()) {
				String rplaca = result.getString("placa");
				String rmarca = result.getString("marca");
				String rmodelo = result.getString("modelo");
				String rcor = result.getString("cor");
				String rDataEntrada = result.getString("data_entrada");
				LocalDateTime dataEntrada = parse(rDataEntrada);

				Veiculo veiculo = new Veiculo(rplaca, rmarca, rmodelo, rcor);
				movimentacao = new Movimentacao(veiculo, dataEntrada);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return movimentacao;

	}

	public void atualizar(Movimentacao movimentacao) {
		String sql1 = "update tb_movimentacoes"
				+ " set data_saida = ?, valor = ? "
				+ " where placa  = ? and data_saida is null ";

		String sql2 = "update tb_status set vagas_ocupadas = ?";
		Connection con = getConnection();

		try {
			PreparedStatement pUpdate = con.prepareStatement(sql1);
			PreparedStatement pUpdateVaga = con.prepareStatement(sql2);

			con.setAutoCommit(false);
			pUpdate.setString(1, movimentacao.getDataHoraSaida().toString());
			pUpdate.setDouble(2, movimentacao.getValor());
			pUpdate.setString(3, movimentacao.getVeiculo().getPlaca());

			pUpdate.execute();

			pUpdateVaga.setInt(1, Vaga.getVagasOcupadas() - 1);
			pUpdateVaga.execute();
			con.commit();

		} catch (SQLException e) {
			e.printStackTrace();

			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new RuntimeException(e);
		} finally {
			closeConnection(con);
		}

	}

	public Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/estacionamento";
		String usuario = "edson";
		String senha = "";

		try {
			Connection conexao = DriverManager.getConnection(url, usuario,
					senha);
			return conexao;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

	private LocalDateTime parse(String dataString) {

		String formatoMySql = "yyyy-MM-dd HH:mm:ss.S";
		return LocalDateTime.parse(dataString,
				DateTimeFormatter.ofPattern(formatoMySql));

	}

	public int getVagasOcupadas() {
		String sql = "select vagas_ocupadas from tb_status where id = 1";
		Connection con = getConnection();

		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet result = ps.executeQuery();
			result.next();
			return result.getInt("vagas_ocupadas");

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} finally {
			closeConnection(con);
		}

	}

}

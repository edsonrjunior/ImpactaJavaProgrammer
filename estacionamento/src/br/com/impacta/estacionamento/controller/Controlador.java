package br.com.impacta.estacionamento.controller;

import java.time.LocalDateTime;

import br.com.impacta.estacionamento.model.Movimentacao;
import br.com.impacta.estacionamento.model.Vaga;
import br.com.impacta.estacionamento.model.Veiculo;
import br.com.impacta.estacionamento.model.exceptions.MovimentacaoException;
import br.com.impacta.estacionamento.model.exceptions.VagaException;
import br.com.impacta.estacionamento.model.exceptions.VeiculoException;
import br.com.impacta.estacionamento.persistencia.DAOMovimentacao;
import br.com.impacta.estacionamento.util.Utilitario;

public class Controlador {

	public void registraEntrada(String placa, String marca, String modelo, String cor)
			throws VagaException, VeiculoException {

		if (Vaga.lotado()) {
			VagaException e = new VagaException("Estacionamento LO-TA-DO!");
			throw e;
		}

		if (!Utilitario.ehPlacaValida(placa)) {
			VeiculoException e = new VeiculoException(String.format("Placa %s inválida! \n", placa));

			throw e;
		}

		Veiculo veiculo = new Veiculo(placa, marca, modelo, cor);
		Movimentacao movimentacao = new Movimentacao(veiculo, LocalDateTime.now());

		DAOMovimentacao dao = new DAOMovimentacao();
		dao.registrar(movimentacao);

		Vaga.entrou();

	}

	public Movimentacao efetivarSaida(String placa) throws VagaException, VeiculoException, MovimentacaoException {

		Movimentacao movimentacao = null;

		if (Vaga.vazio()) {
			VagaException e = new VagaException("Estacionamento VAZIO!");
			throw e;
		}

		if (!Utilitario.ehPlacaValida(placa)) {
			VeiculoException e = new VeiculoException(String.format("Placa %s inválida! \n", placa));

			throw e;
		}

		DAOMovimentacao dao = new DAOMovimentacao();
		movimentacao = dao.buscarMovimentacaoAberta(placa);

		if (movimentacao == null) {
			MovimentacaoException e = new MovimentacaoException(
					String.format("Veiculo com a placa %s " + "não está estacionado aqui! \n", placa));

			throw e;
		}

		movimentacao.setDataHoraSaida(LocalDateTime.now());
		double valorAPagar = Utilitario.calcularValorAPagar(movimentacao.getDataHoraEntrada(),
				movimentacao.getDataHoraSaida());

		movimentacao.setValor(valorAPagar);

		dao.atualizar(movimentacao);

		Vaga.saiu();

		return movimentacao;
	}

}

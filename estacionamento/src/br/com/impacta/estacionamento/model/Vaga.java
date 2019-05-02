package br.com.impacta.estacionamento.model;

import br.com.impacta.estacionamento.persistencia.DAOMovimentacao;

/**
 * Disponibiliza a informa��o de total de vagas dispon�veis no estacionamento e
 * a quantidade de vagas que est�o ocupadas
 */
public class Vaga {

	public static final int TOTAL_DE_VAGAS = 100; // constante
	private static int vagasOcupadas = inicializar(); // de 0 a TOTAL_DE_VAGAS

	public Vaga() {
	}

	private static int inicializar() {
		DAOMovimentacao dao = new DAOMovimentacao();
		int vagasInicial = dao.getVagasOcupadas();
		return vagasInicial;
	}

	public static int getVagasOcupadas() {
		return vagasOcupadas;
	}

	/**
	 * Define um valor correspondente a quantas vagas est�o ocupadas no
	 * estacionamento
	 * 
	 * Este n�mero deve ser maior que zero e n�o superior ao total de vagas
	 * 
	 * @param vagasOcupadas vagas ocupadas num determinado instante
	 */
	public static void setVagasOcupadas(int vagasOcupadas) {
		if (vagasOcupadas > 0 && vagasOcupadas <= TOTAL_DE_VAGAS) {
			Vaga.vagasOcupadas = vagasOcupadas;
		}
	}

	public static void entrou() {
		Vaga.vagasOcupadas++;
	}

	public static boolean lotado() {
		return Vaga.vagasOcupadas == Vaga.TOTAL_DE_VAGAS;
	}

	public static boolean vazio() {
		return Vaga.vagasOcupadas == 0;
	}

	public static void saiu() {
		Vaga.vagasOcupadas--;
	}

}

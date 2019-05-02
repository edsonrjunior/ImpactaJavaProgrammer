package br.com.impacta.estacionamento.model;

/**
 * Representa todas as informações sobre as tarifas vigentes no estacionamento
 * 
 * Pode ser entendida como uma abstração da "tabuleta" de entrada do
 * estacionamento.
 * 
 */
public class Tarifario {

	private static double valorPrimeiraHora = 15; // maior que zero
	private static int incrementoEmMinutos = 15; // maior que zero menor 60
	private static double valorIncremental = 2; // maior que zero

	private Tarifario() {
	}

	public static double getValorPrimeiraHora() {
		return valorPrimeiraHora;
	}

	public static void setValorPrimeiraHora(double valorPrimeiraHora) {
		if (valorPrimeiraHora > 0) {
			Tarifario.valorPrimeiraHora = valorPrimeiraHora;
		}
	}

	public static int getIncrementoEmMinutos() {
		return incrementoEmMinutos;
	}

	/**
	 * Determina a fração de tempo em minutos que abre um novo incremento no valor a
	 * ser cobrado @see valorIncremental
	 * 
	 * @param incrementoEmMinutos Fração de tempo em minutos. Deve estar entre 0 e
	 *                            60 minutos
	 */
	public static void setIncrementoEmMinutos(int incrementoEmMinutos) {
		if (incrementoEmMinutos > 0 && incrementoEmMinutos < 60) {
			Tarifario.incrementoEmMinutos = incrementoEmMinutos;
		}
	}

	public static double getValorIncremental() {
		return valorIncremental;
	}

	public static void setValorIncremental(double valorIncremental) {
		if (valorIncremental > 0) {
			Tarifario.valorIncremental = valorIncremental;
		}
	}

}

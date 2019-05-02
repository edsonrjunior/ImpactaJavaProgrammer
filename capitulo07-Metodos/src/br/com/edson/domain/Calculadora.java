package br.com.edson.domain;

public class Calculadora {

	public Calculadora() {

	}

	public double somar(long... numeros) {
		long soma = 0;

		for (long num : numeros) {
			soma += num;
		}

		return soma;
	}

	public double somar(double v1, double v2) {
		double soma = v1 + v2;
		return soma;
	}

	public double somar(double v1, int v2) {
		double soma = v1 + v2;
		return soma;
	}

	public double somar(int v1, double v2) {
		double soma = v1 + v2;
		return soma;
	}

	public double somar(int v1, int v2) {
		double soma = v1 + v2;
		return soma;
	}

	public int multiplicar(int v1, int v2) {
		return v1 * v2;
	}

	public int dividir(int v1, int v2) {
		if (v2 == 0) {
			throw new ArithmeticException("Divis�o por zero");
		}
		return v1 / v2;
	}

	public int subtrair(int v1, int v2) {
		System.out.println("executando com par�metros (int,int)");
		return v1 - v2;
	}

	public double subtrair(double v1, double v2) {
		System.out.println("executando com par�metros (double,double)");
		return v1 - v2;
	}

	public double subtrair(int v1, double v2) {
		System.out.println("executando com par�metros (int,double)");
		return v1 - v2;
	}

	public double subtrair(double v1, int v2) {
		System.out.println("executando com par�metros (double,int)");
		return v1 - v2;
	}

}

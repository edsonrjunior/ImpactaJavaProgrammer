package br.com.deise.model;

public class Estado {

	private String nomeEstado;
	private double pib;

	public Estado() {
	}

	public Estado(String nomeEstado, double pib) {
		this.nomeEstado = nomeEstado;
		this.pib = pib;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public double getPib() {
		return pib;
	}

	public void setPib(double pib) {
		this.pib = pib;
	}

}

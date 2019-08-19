package br.com.deise.model;

public class Pib {

	private String estado;
	private Double pib;

	public Pib() {

	}

	public Pib(String estado, Double pib) {
		this.estado = estado;
		this.pib = pib;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getPib() {
		return pib;
	}

	public void setPib(Double pib) {
		this.pib = pib;
	}
	
    public double totalpib(double pib) {
        double soma = 0;
        return soma + pib;
    }

    public double porcentagem(double soma) {
        return (pib / soma) * 100;
    }

}

package br.com.impacta.estacionamento.model;

/**
 * Classe que representa o veículo que faz uso do estacionamento Possui
 * caracteristicas mínimas para sua identificação visual, se necessário.
 * 
 */
public class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private String cor;

	public Veiculo(String placa) {
		this.setPlaca(placa);
	}

	public Veiculo(String placa, String marca, String modelo, String cor) {
		this(placa);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setCor(cor);
	}

	public String getPlaca() {
		return placa;
	}

	/**
	 * Atribui um número de placa brasileira ao veículo Deve seguir o formato
	 * conforme legislação corrente.
	 * 
	 * @param placa Placa no formato LLL-NNNN (L=Letra e N=Número)
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}

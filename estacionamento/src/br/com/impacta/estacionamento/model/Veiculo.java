package br.com.impacta.estacionamento.model;

/**
 * Classe que representa o ve�culo que faz uso do estacionamento Possui
 * caracteristicas m�nimas para sua identifica��o visual, se necess�rio.
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
	 * Atribui um n�mero de placa brasileira ao ve�culo Deve seguir o formato
	 * conforme legisla��o corrente.
	 * 
	 * @param placa Placa no formato LLL-NNNN (L=Letra e N=N�mero)
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

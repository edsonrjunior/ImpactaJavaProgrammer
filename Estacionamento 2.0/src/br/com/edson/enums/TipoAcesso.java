package br.com.edson.enums;

public enum TipoAcesso {

	COMUM(1, "comum"), ADMINSTRADOR(2, "administrador");

	private int cod;
	private String descricao;

	private TipoAcesso(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getcod() {
		return cod;
	}

	public void setcod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static TipoAcesso toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoAcesso x : TipoAcesso.values()) {
			if (cod.equals(x.getcod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("cod inválido: " + cod);
	}

}

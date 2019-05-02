package br.com.edson.model;

public class Cliente {

	private String codAcao; // CACR001 - 7 bytes
	private String cpfCnpj; // 14 bytes
	private String dataGeracao; // ddmmaaaa 8 bytes
	private String areaNegocio; // 2 bytes
	private String tipoDePessoa; // 1 byte
	private String nome; // 50 bytes
	private String endereco; // bytes
	private int    numero; // 4 bytes
	private String cidade; // 30 bytes
	private String estado; // 2 bytes

	public Cliente(String codAcao, String cpfCnpj, String dataGeracao, String areaNegocio, String tipoDePessoa,
			String nome, String endereco, int numero, String cidade, String estado) {
		this.codAcao = codAcao;
		this.cpfCnpj = cpfCnpj;
		this.dataGeracao = dataGeracao;
		this.areaNegocio = areaNegocio;
		this.tipoDePessoa = tipoDePessoa;
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getCodAcao() {
		return codAcao;
	}

	public void setCodAcao(String codAcao) {
		this.codAcao = codAcao;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getDataGeracao() {
		return dataGeracao;
	}

	public void setDataGeracao(String dataGeracao) {
		this.dataGeracao = dataGeracao;
	}

	public String getAreaNegocio() {
		return areaNegocio;
	}

	public void setAreaNegocio(String areaNegocio) {
		this.areaNegocio = areaNegocio;
	}

	public String getTipoDePessoa() {
		return tipoDePessoa;
	}

	public void setTipoDePessoa(String tipoDePessoa) {
		this.tipoDePessoa = tipoDePessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;

	}

	
//	public String chaveCliente(String) {
//		
//	} 
//	
	@Override
	public String toString() {
		return "Cliente [codAcao=" + codAcao + ", cpfCnpj=" + cpfCnpj + ", dataGeracao=" + dataGeracao
				+ ", areaNegocio=" + areaNegocio + ", tipoDePessoa=" + tipoDePessoa + ", nome=" + nome + ", endereco="
				+ endereco + ", numero=" + numero + ", cidade=" + cidade + ", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaNegocio == null) ? 0 : areaNegocio.hashCode());
		result = prime * result + ((codAcao == null) ? 0 : codAcao.hashCode());
		result = prime * result + ((cpfCnpj == null) ? 0 : cpfCnpj.hashCode());
		result = prime * result + ((dataGeracao == null) ? 0 : dataGeracao.hashCode());
		result = prime * result + ((tipoDePessoa == null) ? 0 : tipoDePessoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (areaNegocio == null) {
			if (other.areaNegocio != null)
				return false;
		} else if (!areaNegocio.equals(other.areaNegocio))
			return false;
		if (codAcao == null) {
			if (other.codAcao != null)
				return false;
		} else if (!codAcao.equals(other.codAcao))
			return false;
		if (cpfCnpj == null) {
			if (other.cpfCnpj != null)
				return false;
		} else if (!cpfCnpj.equals(other.cpfCnpj))
			return false;
		if (dataGeracao == null) {
			if (other.dataGeracao != null)
				return false;
		} else if (!dataGeracao.equals(other.dataGeracao))
			return false;
		if (tipoDePessoa == null) {
			if (other.tipoDePessoa != null)
				return false;
		} else if (!tipoDePessoa.equals(other.tipoDePessoa))
			return false;
		return true;
	}
	
	
	
	

}

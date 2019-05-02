package br.com.edson.model;


public class Boleto {

	private String codAcao; // CACR001 - 7 bytes
	private String cpfCnpj; // 14 bytes
	private String dataGeracao; // ddmmaaaa 8 bytes
	private String areaNegocio; // 2 bytes
	private String tipoDePessoa; // 1 byte
	private String dataDeVencimento; // ddmmaaaa 8 bytes
	private String codDeBarra; // 52 bytes 12390.00005 00000.00006 00000.00007 8 56760000015075

	
	
	public Boleto(String codAcao, String cpfCnpj, String dataGeracao, String areaNegocio, String tipoDePessoa,
			String dataDeVencimento, String codDeBarra) {
		super();
		this.codAcao = codAcao;
		this.cpfCnpj = cpfCnpj;
		this.dataGeracao = dataGeracao;
		this.areaNegocio = areaNegocio;
		this.tipoDePessoa = tipoDePessoa;
		this.dataDeVencimento = dataDeVencimento;
		this.codDeBarra = codDeBarra;
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

	public String getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(String dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	public String getCodDeBarra() {
		return codDeBarra;
	}

	public void setCodDeBarra(String codDeBarra) {
		this.codDeBarra = codDeBarra;
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
		Boleto other = (Boleto) obj;
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

package br.com.edson.model;

public class Contrato {

	private String codAcao; // CACR001 - 7 bytes
	private String cpfCnpj; // 14 bytes
	private String dataGeracao; // ddmmaaaa 8 bytes
	private String areaNegocio; // 2 bytes
	private String tipoDePessoa; // 1 byte
	private int codDoProduto; // 5 bytes
	private String numeroDoContrato; // 10 bytes
	private String nomeDoProduto; // 20 bytes
	private float valorOriginal; // 15 bytes 9999999999999.99
	private float valorDaDivida; // 15 bytes 9999999999999.99
	private float valorPagamentoMinimo; // 15 bytes 9999999999999.99
	private int quantidadeParcelas; // 4 bytes

	
	
	public Contrato(String codAcao, String cpfCnpj, String dataGeracao, String areaNegocio, String tipoDePessoa,
			int codDoProduto, String numeroDoContrato, String nomeDoProduto, float valorOriginal, float valorDaDivida,
			float valorPagamentoMinimo, int quantidadeParcelas) {
		super();
		this.codAcao = codAcao;
		this.cpfCnpj = cpfCnpj;
		this.dataGeracao = dataGeracao;
		this.areaNegocio = areaNegocio;
		this.tipoDePessoa = tipoDePessoa;
		this.codDoProduto = codDoProduto;
		this.numeroDoContrato = numeroDoContrato;
		this.nomeDoProduto = nomeDoProduto;
		this.valorOriginal = valorOriginal;
		this.valorDaDivida = valorDaDivida;
		this.valorPagamentoMinimo = valorPagamentoMinimo;
		this.quantidadeParcelas = quantidadeParcelas;
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

	public int getCodDoProduto() {
		return codDoProduto;
	}

	public void setCodDoProduto(int codDoProduto) {
		this.codDoProduto = codDoProduto;
	}

	public String getNumeroDoContrato() {
		return numeroDoContrato;
	}

	public void setNumeroDoContrato(String numeroDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public float getValorOriginal() {
		return valorOriginal;
	}

	public void setValorOriginal(float valorOriginal) {
		this.valorOriginal = valorOriginal;
	}

	public float getValorDaDivida() {
		return valorDaDivida;
	}

	public void setValorDaDivida(float valorDaDivida) {
		this.valorDaDivida = valorDaDivida;
	}

	public float getValorPagamentoMinimo() {
		return valorPagamentoMinimo;
	}

	public void setValorPagamentoMinimo(float valorPagamentoMinimo) {
		this.valorPagamentoMinimo = valorPagamentoMinimo;
	}

	public int getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(int quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
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
		Contrato other = (Contrato) obj;
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

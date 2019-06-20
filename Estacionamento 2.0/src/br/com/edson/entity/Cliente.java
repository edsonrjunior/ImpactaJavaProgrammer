package br.com.edson.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "TELEFONE")
	private String telefone;

	@Column(name = "ENDERECO")
	private String endereco;

	@Column(name = "TIPO_DE_CLIENTE")
	private Integer tipoCliente;

	@Column(name = "DIA_VENCIMENTO")
	private Integer diaVencimento;

	@Column(name = "QUANTIDADE_DE_VAGAS")
	private Integer quantidadeDeVagas;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cliente")
	private Set<Carro> carros = new HashSet<>();

	public Cliente() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(Integer tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public Integer getDiaVencimento() {
		return diaVencimento;
	}

	public void setDiaVencimento(Integer diaVencimento) {
		this.diaVencimento = diaVencimento;
	}

	public Integer getQuantidadeDeVagas() {
		return quantidadeDeVagas;
	}

	public void setQuantidadeDeVagas(Integer quantidadeDeVagas) {
		this.quantidadeDeVagas = quantidadeDeVagas;
	}

	public Set<Carro> getCarros() {
		return carros;
	}

	public void setCarros(Set<Carro> carros) {
		this.carros = carros;
	}

}

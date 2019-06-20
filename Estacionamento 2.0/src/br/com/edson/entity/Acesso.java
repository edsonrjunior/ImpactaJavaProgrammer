package br.com.edson.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACESSOS")
public class Acesso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Column(name = "FUNCIONAL")
	private String funcional;

	@Column(name = "SENHA")
	private String senha;

	/* Administrador ou Comum */
	@Column(name = "TIPO_DE_ACESSO")
	private String tipodeAcesso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFuncional() {
		return funcional;
	}

	public void setFuncional(String funcional) {
		this.funcional = funcional;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipodeAcesso() {
		return tipodeAcesso;
	}

	public void setTipodeAcesso(String tipodeAcesso) {
		this.tipodeAcesso = tipodeAcesso;
	}

}

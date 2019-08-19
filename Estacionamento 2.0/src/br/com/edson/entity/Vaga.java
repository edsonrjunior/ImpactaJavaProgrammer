package br.com.edson.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VAGAS")
public class Vaga implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "QUANTIDADE_DE_VAGAS")
	private static final Integer quantidadeDeVagas = 200;

	public Vaga() {
		this.id = null;
		this.getQuantidadedevagas();
	}

	public static Integer getQuantidadedevagas() {
		return quantidadeDeVagas;
	}

}

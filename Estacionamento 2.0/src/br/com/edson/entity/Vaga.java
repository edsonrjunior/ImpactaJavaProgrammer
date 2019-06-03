package br.com.edson.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VAGAS")
public class Vaga implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "QUANTIDADE_DE_VAGAS")
	private static final Integer quantidadeDeVagas = 200;

	public static Integer getQuantidadedevagas() {
		return quantidadeDeVagas;
	}

}

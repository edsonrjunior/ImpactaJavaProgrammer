package br.com.edson.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.edson.entity.Carro;
import br.com.edson.entity.Cliente;
import br.com.edson.entity.Movimentacao;

public class EstacionamentoTest {

	public static void main(String[] args) throws ParseException {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("estacionamento-2.0");
		EntityManager em = emf.createEntityManager();
		
		// Criando o cliente
		Cliente cliente1 = new Cliente();
		cliente1.setId(null);
		cliente1.setNome("Edson");
		cliente1.setTelefone("948341617");
		cliente1.setEndereco("Rua dos Pinhais, 123");
		cliente1.setTipoCliente(1);
		cliente1.setDiaVencimento(28);
		cliente1.setQuantidadeDeVagas(1);

		// Criando o carro
		Carro carro1 = new Carro();
		carro1.setId(null);
		carro1.setPlaca("FBI-8003");
		carro1.setMarca("Honda");
		carro1.setModelo("Civic");
		carro1.setCor("Cinza");
		carro1.setCliente(cliente1);

		// Criando set de Carros
		Set<Carro> carros1 = new HashSet<Carro>();

		// Add carro ao set e adicionando ao cliente
		carros1.add(carro1);
		cliente1.setCarros(carros1);

		Movimentacao movimentacao = new Movimentacao();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		Date entrada1 = sdf.parse("09/06/2019 09:00:00");
		Date saida1 = sdf.parse("09/06/2019 18:30:00");

		movimentacao.setId(null);
		movimentacao.setCarro(carro1);
		movimentacao.setEntrada(entrada1);
		movimentacao.setSaida(saida1);



		em.getTransaction().begin();

		em.persist(cliente1);
		em.persist(carro1);

		System.out.println("PRONTO");

		em.getTransaction().commit();
		em.close();

	}
}

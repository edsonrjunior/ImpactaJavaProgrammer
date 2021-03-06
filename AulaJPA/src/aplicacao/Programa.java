package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Edson Raimundo Jr", "edsonkjr@gmail.com");
		Pessoa p2 = new Pessoa(null, "Thais Maria Raimundo", "thais@gmail.com");
		Pessoa p3 = new Pessoa(null, "Felipe", "felipe@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();

		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
	
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}

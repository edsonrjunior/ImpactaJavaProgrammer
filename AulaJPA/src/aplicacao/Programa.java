package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1,"Edson Raimundo Jr","edsonkjr@gmail.com");
		Pessoa p2 = new Pessoa(2,"Thais Maria Raimundo","thais@gmail.com");
		Pessoa p3 = new Pessoa(3,"Felipe","felipe@gmail.com");
		
		p1.toString();
		p2.toString();
		p3.toString();
	}

}

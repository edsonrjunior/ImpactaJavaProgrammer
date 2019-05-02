package capitulo08;

public class Cap8_Lab1 {
	
	public static void main(String[] args) {
		Cadastro cad1 = new Cadastro();
		Cadastro cad2 = new Cadastro("Claudio","Abreu");
		Cadastro cad3 = new Cadastro("Lourdes","Souza",40);
		
		cad1.mostrar();
		System.out.println();
		cad2.mostrar();
		System.out.println();
		cad3.mostrar();
		
	}

}

package locadora;

public class TesteFilme {
	
	public static void main(String[] args) {
		
		Midia f1 = new Midia();
		f1.mostrarDados();
				
		System.out.println("------------------");
		
		Midia f2 = new Midia("Corra");
		f2.mostrarDados();

		System.out.println("-----------------------");
		
		Midia f3 = new Midia("Post","Drama");
		f3.mostrarDados();
		
		System.out.println("-----------------------");
		
		Midia f4 = new Midia("Up","Animacao",7.76);
		f4.mostrarDados();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

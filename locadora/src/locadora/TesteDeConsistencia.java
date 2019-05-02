package locadora;

public class TesteDeConsistencia {
	
	public static void main(String[] args) {
		
		Midia f1 = new Midia();
		
		f1.setTitulo("AAAAAAAAAAAAAAAAAAAA");
		f1.setGenero("dad2323wqdasdsadxcsaasd");
		f1.setPrecoDoAluguel(-2456.89);
		
		f1.mostrarDados();
		
		System.out.println("------------------");
		
		f1.setTitulo("BBBBBBB");
		f1.setGenero("ACAO");
		f1.setPrecoDoAluguel(56.89);
		
		f1.mostrarDados();
		
	}
	

}

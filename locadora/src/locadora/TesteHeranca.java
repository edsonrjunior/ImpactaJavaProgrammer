package locadora;

public class TesteHeranca {
	
	public static void main(String[] args) {
		
		System.out.println("---- Musica ----");
		Musica mus = new Musica("Sucessos dos anos 90");
		mus.mostrarDados();
		
		System.out.println("---- Jogo ----");
		Jogo jog = new Jogo();
		jog.mostrarDados();
		
		System.out.println("---- Filme ----");
		Filme fil = new Filme();
		fil.mostrarDados();
		
		System.out.println("---- Midia ----");
		Midia m1 = new Midia();
		m1.mostrarDados();
		
		Midia mid1 = new Jogo();
		Midia mid2 = new Musica();
		Midia mid3 = new Filme();
		Midia mid4 = new Midia();
		
		
		System.out.println("--------------");
		
		mid1.mostrarDados();
		System.out.println("--------------");
		mid2.mostrarDados();
		System.out.println("--------------");
		mid3.mostrarDados();
		System.out.println("--------------");
		mid4.mostrarDados();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

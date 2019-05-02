package locadora;

public class GeradorDoCatalogo {
	
	public static void main(String[] args) {
		
		Filme fil1 = new Filme("Matrix","Ficcao",5.4,"Filme Otimo!");
		Musica mus1 = new Musica("Sucessos","MPB",12.3,"BMG");
		Jogo jog1 = new Jogo("Super Mario","Arcade",23.6,"XBox");
		
		Filme fil2 = new Filme("Corra","Aventura",7.7,"Filme corrido!");
		Musica mus2 = new Musica("Clássicos","Classico",15.2,"Globo");
		Jogo jog2 = new Jogo("Fifa 18","Esportes",31.5,"PS 4");
		
		CatalogoDeMidias.gerar(fil1,mus1,jog1,fil2,mus2,jog2);
		
		
	}

}

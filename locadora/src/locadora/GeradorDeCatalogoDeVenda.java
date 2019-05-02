package locadora;

public class GeradorDeCatalogoDeVenda {
	
	public static void main(String[] args) {
		
		Filme fil1 = new Filme("Matrix","Ficcao",5.4,"Filme Otimo!");
		Jogo jog1 = new Jogo("Super Mario","Arcade",23.6,"XBox");
		Filme fil2 = new Filme("Corra","Aventura",7.7,"Filme corrido!");
		Jogo jog2 = new Jogo("Fifa 18","Esportes",31.5,"PS 4");
		Sorvete sorv1 = new Sorvete("Nestle","Chocolate");
		Sorvete sorv2 = new Sorvete("Kibon","Morango");
		
		CatalogoVenda.gerar(sorv1,fil1,fil2,jog1,jog2,sorv2);
		
	}

}

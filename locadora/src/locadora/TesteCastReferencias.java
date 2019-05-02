package locadora;

public class TesteCastReferencias {
	
	public static void main(String[] args) {
		
		Midia mid1 = new Jogo();
		Midia mid2 = new Musica();
		Midia mid3 = new Filme();
		Midia mid4 = new Midia();
		
		//nao existe na classe Midia mid3.setSinopse("Bom!!!");
		Filme film1 = (Filme) mid3;
		
		film1.setSinopse("Bom!!!");
		film1.mostrarDados();
		
		if(mid3 instanceof Musica ){
			Musica mus1 = (Musica) mid3;
		}
		
	}
	
	
	
	
	
	
	
	

}

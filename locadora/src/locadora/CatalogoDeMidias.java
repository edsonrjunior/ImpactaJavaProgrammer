package locadora;

public class CatalogoDeMidias {
	
	public static void gerar(Midia ... midias){
		
		System.out.println("-- CAT�LOGO DE M�DIAS --");
		for(Midia m : midias){
			System.out.println();
			m.mostrarDados();
			System.out.println("--------------------");
		}
		
	}

}

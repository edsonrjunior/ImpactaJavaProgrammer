package locadora;

public class CatalogoDeMidias {
	
	public static void gerar(Midia ... midias){
		
		System.out.println("-- CATÁLOGO DE MÍDIAS --");
		for(Midia m : midias){
			System.out.println();
			m.mostrarDados();
			System.out.println("--------------------");
		}
		
	}

}

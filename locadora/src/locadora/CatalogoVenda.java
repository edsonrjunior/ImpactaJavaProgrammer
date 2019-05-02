package locadora;

public class CatalogoVenda {
	
	public static void gerar(Negociavel ... produtos){
		System.out.println("*** CATÁLOGO VENDA DE PRODUTOS ***");
		for(Negociavel produto : produtos){
			System.out.println(produto);
			System.out.printf("Preço de Venda.... R$ %.2f\n\n", 
					produto.calculaPrecoVenda());
		}
	}
	
}

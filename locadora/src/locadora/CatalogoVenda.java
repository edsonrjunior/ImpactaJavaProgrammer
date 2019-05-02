package locadora;

public class CatalogoVenda {
	
	public static void gerar(Negociavel ... produtos){
		System.out.println("*** CAT�LOGO VENDA DE PRODUTOS ***");
		for(Negociavel produto : produtos){
			System.out.println(produto);
			System.out.printf("Pre�o de Venda.... R$ %.2f\n\n", 
					produto.calculaPrecoVenda());
		}
	}
	
}

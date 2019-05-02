package carro;

public class Funilaria {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.setMarca("Palio");
		carro1.setCor("Amarelo");
		
		Garagem g = new Garagem();
		
		System.out.println("----Carro antes----");
		System.out.println("Cor: "+carro1.getCor());

		g.pintar(carro1, "Branco");

		System.out.println("----Carro depois----");
		System.out.println("Cor: "+carro1.getCor());
		
		
		
	}
}

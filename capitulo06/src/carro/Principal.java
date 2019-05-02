package carro;

public class Principal {
	
	public static void main(String[] args){
		
		Garagem g = new Garagem();
		
		g.setCarroPasseio(new Carro());
		g.getCarroPasseio().setMarca("VW Jetta");
		g.getCarroPasseio().setPotencia(2.3);
		g.getCarroPasseio().setCor("vermelho");
		
		g.setCarroUtilitario(new Carro());
		g.getCarroUtilitario().setMarca("Renault Boxer");
		g.getCarroUtilitario().setPotencia(3.8);
		g.getCarroUtilitario().setCor("branco");
		
		System.out.println("Carro de Passeio:");
		System.out.println("Cor:"+g.getCarroPasseio().getCor());
		System.out.println("Modelo:"+g.getCarroPasseio().getMarca());
		System.out.println("Potência:"+g.getCarroPasseio().getPotencia());
		
		System.out.println("-----------------------------");
		
		System.out.println("Carro Utilitário:");
		System.out.println("Cor:"+g.getCarroUtilitario().getCor());
		System.out.println("Modelo:"+g.getCarroUtilitario().getMarca());
		System.out.println("Potência:"+g.getCarroUtilitario().getPotencia());
		
	}


}

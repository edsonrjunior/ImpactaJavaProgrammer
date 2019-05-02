package br.com.edson.domain;
public class TesteRecursivo {
	
	public static void main(String[] args) {
		
		System.out.println("Chamando metodo recursivo...");
		double fat = TesteRecursivo.fatorial(4);
		
		System.out.println("Fatorial = "+ fat);
	}
	
	private static double fatorial(int numero) {
		
		if(numero == 0 || numero == 1 ){
			return 1;
		}
		
		return numero * fatorial(numero-1);
		
	}

}

package capitulo12;

import java.util.Scanner;

public class ExemploExcecao {
	
	public static void main(String[] args) {
		
		System.out.println("Extraindo a raiz quadrada...");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		double numero = scan.nextDouble();
		
		double resultado = 0;
		try {
			resultado = raiz(numero);
			System.out.printf("A raiz de %.2f � %.2f \n",numero,resultado);
		} catch (RaizInvalidaException e1) {
			System.out.println(e1.getMessage());
		}
		
		
//		try{
//			int num = Integer.parseInt("Java");	
//			String arg = args[10];
//			String s = null;
//			s.toString();
//			int divisao = dividir(100,0);
//			System.out.printf
//					("A divis�o de %.2f por %.2f � %.2f ",100,0,divisao);
//		}catch(NumberFormatException | NullPointerException e){
//			System.out.println("Invalid input " + e.getMessage());
//		}catch(Exception e){
//			System.out.println("Excecao de tratamento gen�rico !");
//		}finally{
//			System.out.println("Eu sempre executo!!!");
//		}
//		
//		
//		
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Indice do array inv�lido : " + e.getMessage());
//			System.out.println("Veja a pilha de execu��o");
//		}catch(NullPointerException e){
//			System.out.println("Favor inicializar a vari�vel!");
//		}catch(ArithmeticException e){
//			System.out.println("Divis�o por zero, tente novamente!");
//		}
		
		System.out.println("Ufa! Fim do m�todo main() !");
	}

	private static double raiz(double numero) throws RaizInvalidaException {
		if(numero < 0){
			RaizInvalidaException rie = 
					new RaizInvalidaException("Raiz Inv�lida : "+numero);
			throw rie;
		}
		double result = Math.sqrt(numero);
		return result;
	}
	
	private static int dividir(int num1, int num2){
		int result = num1/num2;
		return result;
	}
	
	

}

package capitulo12;

import java.util.Scanner;

public class ExemploExcecao {
	
	public static void main(String[] args) {
		
		System.out.println("Extraindo a raiz quadrada...");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número:");
		double numero = scan.nextDouble();
		
		double resultado = 0;
		try {
			resultado = raiz(numero);
			System.out.printf("A raiz de %.2f é %.2f \n",numero,resultado);
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
//					("A divisão de %.2f por %.2f é %.2f ",100,0,divisao);
//		}catch(NumberFormatException | NullPointerException e){
//			System.out.println("Invalid input " + e.getMessage());
//		}catch(Exception e){
//			System.out.println("Excecao de tratamento genérico !");
//		}finally{
//			System.out.println("Eu sempre executo!!!");
//		}
//		
//		
//		
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Indice do array inválido : " + e.getMessage());
//			System.out.println("Veja a pilha de execução");
//		}catch(NullPointerException e){
//			System.out.println("Favor inicializar a variável!");
//		}catch(ArithmeticException e){
//			System.out.println("Divisão por zero, tente novamente!");
//		}
		
		System.out.println("Ufa! Fim do método main() !");
	}

	private static double raiz(double numero) throws RaizInvalidaException {
		if(numero < 0){
			RaizInvalidaException rie = 
					new RaizInvalidaException("Raiz Inválida : "+numero);
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

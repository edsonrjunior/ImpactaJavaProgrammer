package capitulo03;

public class Somador {
	
	public static void main(String[] args) {
		
		//------ Capturando o numero digitado no console
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int numero1 = scan.nextInt();
		//---------------------------------------------
		
		System.out.println("Digite o segundo número:");
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.printf("%d + %d = %d \n",numero1,numero2,resultado);
		
	}

}

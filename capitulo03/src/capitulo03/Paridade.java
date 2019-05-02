package capitulo03;

public class Paridade {
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Digite o número:");
		int num = scan.nextInt();
		
		//Par ou ímpar ?
		//Se o resto da divisao de num por 2 é 0 então é par senao impar
		String paridade = (num % 2 == 0) ? "Par" : "Impar";
		
		System.out.printf("Número %d é %s ! \n",num,paridade);
		

		
	}

}

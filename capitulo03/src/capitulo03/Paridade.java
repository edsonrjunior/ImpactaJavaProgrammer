package capitulo03;

public class Paridade {
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Digite o n�mero:");
		int num = scan.nextInt();
		
		//Par ou �mpar ?
		//Se o resto da divisao de num por 2 � 0 ent�o � par senao impar
		String paridade = (num % 2 == 0) ? "Par" : "Impar";
		
		System.out.printf("N�mero %d � %s ! \n",num,paridade);
		

		
	}

}

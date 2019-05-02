package capitulo11;

public class Cap11_Lab1 {
	
	public static void main(String[] args) {
		int[] valores = {10,1,2,45,-30,-3,-1,56,99,13,75,14};
		
		System.out.println("---Numeros informados---");
		for (int v : valores) {
			System.out.print(v+" ");
		}
		System.out.println("\n-------------\n");

		int ehOMaior = maiorNumero(valores);
		int ehOMenor = menorNumero(valores);
		
		System.out.println("O maior elemento é : "+ ehOMaior);
		System.out.println("O menor elemento é : "+ ehOMenor);
		
	}
	
		
	
	private static int menorNumero(int[] numeros) {
		int menor = numeros[0];
		for(int numero : numeros){
			menor = (numero < menor) ? numero : menor;
		}
		return menor;
	}

	public static int maiorNumero(int[] numeros){
		int maior = numeros[0];
		for(int numero : numeros){
			maior = (numero > maior) ? numero : maior;
		}
		return maior;
	}
	
	

}

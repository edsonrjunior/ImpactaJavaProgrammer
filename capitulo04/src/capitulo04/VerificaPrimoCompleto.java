package capitulo04;

public class VerificaPrimoCompleto {
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int numero = 0;
		boolean reexecutar = true;
		
		//Teste se entrada é válida !
		while(reexecutar){
			System.out.println("Digite o número:");
			numero = scan.nextInt();
			if(numero > 0){
				break;
			}
			System.out.println("Informe um número positivo!");
		}
				
		//contar numero de divisores do numero informado
		int divisores = 0;
		for(int divisor=1;divisor<=numero;divisor++){
			if(numero % divisor == 0){
				divisores++;
			}
		}
		
		//É numero primo se o numero de divisores forem 2 apenas
		if(divisores == 2){
			System.out.printf("Número %d é primo!",numero);
		}else{
			System.out.printf("Número %d NÃO É primo!",numero);
		}
		
		
	}

}

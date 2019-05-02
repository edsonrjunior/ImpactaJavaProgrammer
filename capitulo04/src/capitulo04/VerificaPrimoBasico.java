package capitulo04;

public class VerificaPrimoBasico {
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Digite o n�mero:");
		int numero = scan.nextInt();
				
		//contar numero de divisores do numero informado
		int divisores = 0;
		for(int divisor=1;divisor<=numero;divisor++){
			if(numero % divisor == 0){
				divisores++;
			}
		}
		
		//� numero primo se o numero de divisores forem 2 apenas
		if(divisores == 2){
			System.out.printf("N�mero %d � primo!",numero);
		}else{
			System.out.printf("N�mero %d N�O � primo!",numero);
		}
		
		
	}

}

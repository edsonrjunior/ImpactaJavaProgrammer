package capitulo12;

import java.time.Year;
import java.util.Scanner;

public class ExercicioIdade {

	public static void main(String[] args) {
		boolean ok = false;
		
		while(!ok){
			try{
				System.out.println("Digite seu ano de nascimento: ");
				Scanner scan = new Scanner(System.in);	
				String anoAsStr = scan.nextLine();
				int anoCorrente = Year.now().getValue();
				int anoNascimento = Integer.parseInt(anoAsStr);
				int idade = anoCorrente - anoNascimento;
				System.out.println("Sua idade é: "+ idade);
				ok = true;
			}catch(NumberFormatException e){
				System.out.println("Valor digitado inválido!");
				System.out.println("Tente novamente.");
			}
		}
	}

}

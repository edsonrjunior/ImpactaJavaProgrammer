package capitulo12;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {
	
	public static void main(String[] args) {
		
			try{
				System.out.println("Digite uma frase qualquer: ");
				Scanner scan = new Scanner(System.in);	
				String texto = scan.nextLine();
				PrintWriter writer = new PrintWriter("C:\\doc1.txt");
				writer.println(texto);
				writer.close();
			}catch(IOException e){
				System.out.println("Falha ao gravar informações digitadas!");
			}
	}

}

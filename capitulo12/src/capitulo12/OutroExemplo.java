package capitulo12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class OutroExemplo {
	
	public static void main(String[] args) {
		
		String numAsString1 = "100";
		String numAsString2 = "10";
		
		double result = dividir(numAsString1,numAsString2);
		System.out.println("Resultado: " + result);

		try {
			abrirArquivo("teste.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

	private static void abrirArquivo(String file) throws FileNotFoundException {
		InputStream input = new FileInputStream(file);
		
	}

	private static double dividir(String numAsString1, String numAsString2) {
		int num1 = Integer.parseInt(numAsString1);
		int num2 = Integer.parseInt(numAsString2);

		return num1/num2;
	}
	
	

}

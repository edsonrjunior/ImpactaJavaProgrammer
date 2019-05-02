package capitulo15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LeituraComScanner {
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(new FileInputStream("teste.txt"));
				PrintStream printer = 
				  new PrintStream(new FileOutputStream("saida.txt"));)
		{
			while(scan.hasNextLine()){
				printer.println(scan.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}

package capitulo15;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscrevendoDados {
	
	public static void main(String[] args) {
		
		try (
				OutputStream out = new FileOutputStream("saida.txt");
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
			) 
		{
			
			bw.write("Primeira Linha");
			bw.newLine();
			bw.write("Segunda Linha");
			bw.newLine();
			bw.write("Terceira Linha");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

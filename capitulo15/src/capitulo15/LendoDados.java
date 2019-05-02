package capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LendoDados {

	public static void main(String[] args) {

		try (InputStream in = new FileInputStream("teste.txt");
		     InputStreamReader isr = new InputStreamReader(in);
			 BufferedReader br = new BufferedReader(isr);)

		{
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

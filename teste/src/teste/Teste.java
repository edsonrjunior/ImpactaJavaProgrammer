package teste;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		String nome[] = new String[10];

		Scanner scan = new Scanner(System.in);

		String x;

		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite um nome: ");
			x = scan.nextLine();

			if (nome[i] != null) {
				nome[i] = x;
			}
		}
		System.exit(0);
	}
}

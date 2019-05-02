package br.com.edson.testes;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {

		ArrayList<Object> clientes = new ArrayList<>();

		if (clientes == null || clientes.isEmpty()) {
			try {
				Scanner scan = new Scanner(Testes.class.getResourceAsStream("/resource/boletos.csv"));

				while (scan.hasNext()) {
					String valores = scan.nextLine();
					clientes.add(valores);

				}

				scan.close();
			} catch (Exception e) {
				System.out.println(e.getStackTrace());
			}
		}

		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i).toString());
		}

	}

}

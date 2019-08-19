package br.com.deise.application;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.deise.model.Pib;
import br.com.deise.model.Regiao;

public class Program {

	public static void main(String[] args) throws IOException {

		List<Pib> pibs = new ArrayList<>();
		List<Regiao> regioes = new ArrayList<>();

		
	

		//Ler o arquivo e criar objetos de Pibs
		
		// Se a lista de pibs não existir ou estiver vazia.
		if (pibs == null || pibs.isEmpty()) {
			try {
				// Pega onde está o arquivo de Pibs para ler via Scanner.
				Scanner scan = new Scanner(Program.class.getResourceAsStream("/br//com//deise//resources//pib.txt"));
				while (scan.hasNextLine()) {
					String linhaPib = scan.nextLine();

					if (linhaPib == " ") {
						scan.nextLine();
					} else {

						String[] atributos = linhaPib.split(";");
						String estado = atributos[0];
						double pib = Double.parseDouble(atributos[1]);

						// Cria um objeto do tipo Pib;
						Pib novoPib = new Pib(estado, pib);

						// Add o Pib no ArrayList
						pibs.add(novoPib);
					}
				}
				scan.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		//Somar todos dos Pibs
		double totalPib = 0;
		
		for (Pib pib : pibs) {
			totalPib += pib.getPib();
		}
		
		System.out.println("Pib total: " + totalPib);
		
		//Pular linha
		System.out.println();
		
		// Percentual do Pib por regiao
		for (Pib pib : pibs) {
			System.out.println(pib.getEstado() + " - " + pib.getPib() * 100 / totalPib + " %");
		}
		
		System.out.println();

		if (regioes == null || regioes.isEmpty()) {
			try {
				// Pega onde está o arquivo de Pibs para ler via Scanner.
				Scanner scan = new Scanner(
						Program.class.getResourceAsStream("/br//com//deise//resources//regioes.txt"));
				while (scan.hasNextLine()) {
					String linhaRegiao = scan.nextLine();

					if (linhaRegiao.isEmpty()) {
						scan.nextLine();
					} else {
						if (
							linhaRegiao.equals("Norte") || 
							linhaRegiao.equals("Sudeste") || 
							linhaRegiao.equals("Nordeste") || 
							linhaRegiao.equals("Sul") || 
							linhaRegiao.equals("Centro-Oeste")) {
							scan.nextLine();
						} else {
							Regiao novaRegiao = new Regiao(linhaRegiao);
							regioes.add(novaRegiao);
						}

					}

				}
				scan.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		//Somar Pib por região
		
		double norte = 0.0;
		double nordeste = 0.0;
		double sudeste = 0.0;
		double sul = 0.0;
		double centroOeste = 0.0;
		
		
			
			for (Pib pib : pibs) {
				
				switch (pib.getEstado()) {
				//Norte
				case "Rondonia": norte += pib.getPib(); break;
				case "Acre": norte += pib.getPib(); break;
				case "Amazonas": norte += pib.getPib(); break;
				case "Roraima": norte += pib.getPib(); break;
				case "Para": norte += pib.getPib(); break;
				case "Amapa": norte += pib.getPib(); break;
				case "Tocantins": norte += pib.getPib(); break;
				//Nordeste
				case "Maranhao": nordeste += pib.getPib(); break;
				case "Piaui": nordeste += pib.getPib(); break;
				case "Ceara": nordeste += pib.getPib(); break;
				case "Rio Grande do Norte": nordeste += pib.getPib(); break;
				case "Paraiba": nordeste += pib.getPib(); break;
				case "Pernambuco": nordeste += pib.getPib(); break;
				case "Alagoas": nordeste += pib.getPib(); break;
				case "Sergipe": nordeste += pib.getPib(); break;
				case "Bahia": nordeste += pib.getPib(); break;

				//Sudeste
				case "Minas Gerais": sudeste += pib.getPib(); break;
				case "Espirito Santo": sudeste += pib.getPib(); break;
				case "Rio de Janeiro": sudeste += pib.getPib(); break;
				case "São Paulo": sudeste += pib.getPib(); break;
				
				//Sul
				case "Parana": sul += pib.getPib(); break;
				case "Santa Catarina": sul += pib.getPib(); break;
				case "Rio Grande do Sul": sul += pib.getPib(); break;
				
				//Centro-Oeste
				case "Mato Grosso do Sul": centroOeste += pib.getPib(); break;
				case "Mato Grosso": centroOeste += pib.getPib(); break;
				case "Goias": centroOeste += pib.getPib(); break;
				case "Distrito Federal": centroOeste += pib.getPib(); break;
				}

			}
			
		try (OutputStream out = new FileOutputStream("saida.txt");
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);) {

			bw.write("Norte;");
			bw.write(String.valueOf(norte));
			bw.newLine();
			
			bw.write("Nordeste;");
			bw.write(String.valueOf(nordeste));
			bw.newLine();
			
			bw.write("Sudeste;");
			bw.write(String.valueOf(sudeste));
			bw.newLine();
			
			bw.write("Sul;");
			bw.write(String.valueOf(sul));
			bw.newLine();
			
			bw.write("Centro-Oeste;");
			bw.write(String.valueOf(centroOeste));
		

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
		
		
		System.out.println("Norte: " + norte);
		System.out.println("Nordeste: " + nordeste);
		System.out.println("Sudeste: " + sudeste);
		System.out.println("Sul: " + sul);
		System.out.println("Centro Oeste: " + centroOeste);

	}
}

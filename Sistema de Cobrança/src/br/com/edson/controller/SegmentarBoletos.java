package br.com.edson.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.edson.model.Boleto;

public class SegmentarBoletos {

	ArrayList<Boleto> boletos = new ArrayList<>();

	public List<Boleto> carregarBoletos() {
		int quantidadeBoletosLidos = 0;

		// Se a lista de clientes nao existir ou estiver vazia...
		if (boletos == null || boletos.isEmpty()) {
			try {
				Scanner scan = new Scanner(SegmentarBoletos.class.getResourceAsStream("/resource/boletos.csv"));

				// Enquanto tiver linha a ser lida
				while (scan.hasNext()) {

					// Colocar toda linha capturada em uma String.
					String linhaBoleto = scan.nextLine();

					// Separar a linha capturada e separar por ;.
					String[] atributos = linhaBoleto.split(";");

					// Cada separacao por ; colocar em uma posicao do array.
					String codAcao = atributos[0];
					String cpfCnpj = atributos[1];
					String dataGeracao = atributos[2];
					String areaNegocio = atributos[3];
					String tipoDePessoa = atributos[4];
					String dataDeVencimento = atributos[5];
					String codDeBarra = atributos[6];

					quantidadeBoletosLidos++;

//					StringBuilder builder = new StringBuilder();
//					StringBuilder mostrar = builder.append("C0000").append(cpfCnpj);
//					System.out.println("Mostrar: " + mostrar.toString());
					
					
					// Criar uma instancia de Contrato.
					Boleto novoBoleto = new Boleto(codDeBarra, codDeBarra, codDeBarra, codDeBarra, codDeBarra,
							codDeBarra, codDeBarra);
					
					
					// Adicionar a lista de Contrato.
					boletos.add(novoBoleto);

				}

				System.out.println("Boletos lidos: " + quantidadeBoletosLidos);

			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}
		return boletos;
	}

}

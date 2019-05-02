package br.com.edson.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.edson.model.Contrato;

public class SegmentarContratos {

	private static ArrayList<Contrato> contratos = new ArrayList<>();

	public static List<Contrato> carregarContratos() {

		Scanner scan = new Scanner(SegmentarContratos.class.getResourceAsStream("/resource/contratos.csv"));

		int quantidadeContratosLidos = 0;

		// Se a lista de clientes nao existir ou estiver vazia...
		if (contratos == null || contratos.isEmpty()) {
			try {

				// Enquanto tiver linha a ser lida
				while (scan.hasNext()) {

					// Colocar toda linha capturada em uma String.
					String linhaContrato = scan.nextLine();

					// Separar a linha capturada e separar por ;.
					String[] atributos = linhaContrato.split(";");

					// Cada separacao por ; colocar em uma posicao do array.
					String codAcao = atributos[0];
					String cpfCnpj = atributos[1];
					String dataGeracao = atributos[2];
					String areaNegocio = atributos[3];
					String tipoDePessoa = atributos[4];
					int codDoProduto = Integer.parseInt(atributos[5]);
					String numeroDoContrato = atributos[6];
					String nomeDoProduto = atributos[7];
					Float valorOriginal = Float.parseFloat(atributos[8]);
					Float valorDaDivida = Float.parseFloat(atributos[9]);
					Float valorPagamentoMinimo = Float.parseFloat(atributos[10]);
					int quantidadeParcelas = Integer.parseInt(atributos[11]);
					;

					quantidadeContratosLidos++;

					// Criar uma instancia de Contrato.
					Contrato novoContrato = new Contrato(codAcao, cpfCnpj, dataGeracao, areaNegocio, tipoDePessoa,
							codDoProduto, numeroDoContrato, nomeDoProduto, valorOriginal, valorDaDivida,
							valorPagamentoMinimo, quantidadeParcelas);

					// Adicionar a lista de Contrato.
					contratos.add(novoContrato);

				}

				System.out.println("Contratos lidos: " + quantidadeContratosLidos);

			} catch (RuntimeException e) {
				e.printStackTrace();
			} finally {
				scan.close();
			}
		}
		return contratos;
	}

}

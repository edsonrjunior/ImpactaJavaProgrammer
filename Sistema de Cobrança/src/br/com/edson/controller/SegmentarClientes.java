package br.com.edson.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.edson.model.Cliente;

public class SegmentarClientes {

	public List<Cliente> carregarClientes() {

		ArrayList<Cliente> clientes = new ArrayList<>();

		int quantidadeClientesLidos = 0;
		int lidosPf = 0;
		int lidosPj = 0;
		int lidosImob = 0;
		int lidosCartoes = 0;
		int lidosConsignado = 0;

		// Se a lista de clientes nao existir ou estiver vazia...
		if (clientes == null || clientes.isEmpty()) {
			try {
				Scanner scan = new Scanner(SegmentarClientes.class.getResourceAsStream("/resource/clientes.csv"));

				// Enquanto tiver linha a ser lida
				while (scan.hasNext()) {

					// Colocar toda linha capturada em uma String.
					String linhaCliente = scan.nextLine();

//					if (linhaCliente.isEmpty()) {
//						System.out.println("Linha vazia");
//						linhaCliente = scan.nextLine();
//					}	
				
					// Separar a linha capturada e separar por ;.
					String[] atributos = linhaCliente.split(";");

					// Cada separacao por ; colocar em uma posicao do array.
					String codAcao = atributos[0];
					String cpfCnpj = atributos[1];
					String dataGeracao = atributos[2];
					String areaNegocio = atributos[3];
					String tipoDePessoa = atributos[4];
					String nome = atributos[5];
					String enedereco = atributos[6];
					int numero = Integer.parseInt(atributos[7]);
					String cidade = atributos[8];
					String estado = atributos[9];

					quantidadeClientesLidos++;

					// Criar uma instancia de Cliente.
					Cliente novoCliente = new Cliente(codAcao, cpfCnpj, dataGeracao, areaNegocio, tipoDePessoa, nome,
							enedereco, numero, cidade, estado);

					switch (areaNegocio) {

					case "01":
						lidosPf++;
//						gravarPF(cliente);
						break;
					case "02":
						lidosPj++;
//						gravarPJ(clieente);
						break;
					case "03":
						lidosImob++;
//						gravarImob(cliente);
						break;
					case "04":
						lidosCartoes++;
//						gravarCartoes();
						break;
					case "05":
						lidosConsignado++;
//						gravarConsignado();
						break;
					}

					// Adicionar a lista de Cliente.
					clientes.add(novoCliente);

				}

				System.out.println("\nClientes lidos: " + quantidadeClientesLidos + 
						            "\nPF            : " + lidosPf + 
						            "\nPJ            : " + lidosPj +
						            "\nImob          : " + lidosImob +
						            "\nCartoes       : " + lidosCartoes +
						            "\nConsignado    : " + lidosConsignado +"\n");

			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}

}

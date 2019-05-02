package br.com.edson.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.edson.model.*;


public class ExtrairArquivos {

	static String chaveCliente;
	static String chaveContrato;

	public static void main(String[] args) {

		List<Cliente> clientes = new SegmentarClientes().carregarClientes();
		List<Contrato> contratos = new SegmentarContratos().carregarContratos();
		List<Boleto> boletos = new SegmentarBoletos().carregarBoletos();

	}

}

//chaveCliente.equals(chaveContrato)
//chaveCliente = String.format("%s", clientes.get(i).getCodAcao())
//.concat(String.format("%s", clientes.get(i).getCpfCnpj())
//		.concat(String.format("%s", clientes.get(i).getDataGeracao())
//				.concat(String.format("%s", clientes.get(i).getAreaNegocio())
//						.concat(String.format("%s", clientes.get(i).getAreaNegocio())))));
//
//chaveContrato = String.format("%s", contratos.get(i).getCodAcao())
//	.concat(String.format("%s", contratos.get(i).getCpfCnpj())
//			.concat(String.format("%s", contratos.get(i).getDataGeracao())
//					.concat(String.format("%s", contratos.get(i).getAreaNegocio())
//							.concat(String.format("%s", contratos.get(i).getAreaNegocio())))));
//
//if (chaveCliente.equals(chaveContrato)) {
//System.out.println("É igual");
//
//}else
//System.out.println("É diferente");

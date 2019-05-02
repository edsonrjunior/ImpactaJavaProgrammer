package br.com.impacta.estacionamento.view.console;

import java.util.Scanner;

import br.com.impacta.estacionamento.controller.Controlador;
import br.com.impacta.estacionamento.model.Movimentacao;
import br.com.impacta.estacionamento.model.Veiculo;
import br.com.impacta.estacionamento.model.exceptions.MovimentacaoException;
import br.com.impacta.estacionamento.model.exceptions.VagaException;
import br.com.impacta.estacionamento.model.exceptions.VeiculoException;

public class ConsoleDeSaida {
	
	public static void main(String[] args) {
		
		System.out.println("--- Registro de saída de veículo ---");
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a placa:");
		String placa = scan.next();
		
		Controlador control = new Controlador();
		Movimentacao movimentacao = null;
		try {
			movimentacao = control.efetivarSaida(placa);

			System.out.println("--- Recibo de Pagamento ---");
			System.out.println(movimentacao);
			System.out.println(" ------------- ");
		} catch (VagaException | VeiculoException | MovimentacaoException e) {
			System.out.println(e.getMessage());
		}
	}

}












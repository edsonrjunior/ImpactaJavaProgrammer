package br.com.impacta.estacionamento.view.console;

import java.util.Scanner;

import br.com.impacta.estacionamento.controller.Controlador;
import br.com.impacta.estacionamento.model.exceptions.VagaException;
import br.com.impacta.estacionamento.model.exceptions.VeiculoException;

public class ConsoleDeEntrada {
	
	public static void main(String[] args) {
		
		System.out.println("--- Digite os dados do veículo --- ");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Placa:");
		String placa = scan.next();
		System.out.println("Marca:");
		String marca = scan.next();
		System.out.println("Modelo:");
		String modelo = scan.next();
		System.out.println("Cor:");
		String cor = scan.next();
		
		Controlador control = new Controlador();
		try {
			control.registraEntrada(placa,marca,modelo,cor);
			System.out.printf("Veiculo placa %s registrado!",placa);
		} catch (VagaException | VeiculoException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}

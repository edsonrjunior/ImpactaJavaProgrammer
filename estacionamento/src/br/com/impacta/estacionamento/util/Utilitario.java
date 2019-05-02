package br.com.impacta.estacionamento.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.regex.Pattern;

import br.com.impacta.estacionamento.model.Tarifario;

public class Utilitario {

	public static boolean ehPlacaValida(String placa) {
		if (placa != null && !placa.trim().isEmpty()) {
			return Pattern.matches("[a-zA-Z]{3}-\\d{4}", placa);
		}

		return false;
	}

	public static double calcularValorAPagar(LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida) {

		long duracaoEmMinutos = dataHoraEntrada.until(dataHoraSaida, ChronoUnit.MINUTES);

		double valor = 0;

		if (duracaoEmMinutos >= 60) {
			valor += Tarifario.getValorPrimeiraHora();
			duracaoEmMinutos -= 60;
		}

		valor += (duracaoEmMinutos / Tarifario.getIncrementoEmMinutos()) * Tarifario.getValorIncremental();

		return valor;
	}

}

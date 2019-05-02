package br.com.impacta.estacionamento.model;

import java.time.LocalDateTime;

/**
 * Representa um fluxo de entrada e saída de um veículo no estacionamento.
 *
 */
public class Movimentacao {

	private Veiculo veiculo; // nao nulo
	private LocalDateTime dataHoraEntrada; // nao nulo
	private LocalDateTime dataHoraSaida; // maior que a de entrada
	private double valor; // maior ou igual a 0

	public Movimentacao(Veiculo veiculo, LocalDateTime dataHoraEntrada) {
		this.setVeiculo(veiculo);
		this.setDataHoraEntrada(dataHoraEntrada);
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		if (veiculo != null) {
			this.veiculo = veiculo;
		}
	}

	public LocalDateTime getDataHoraEntrada() {
		return dataHoraEntrada;
	}

	public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
		if (dataHoraEntrada != null) {
			this.dataHoraEntrada = dataHoraEntrada;
		}
	}

	public LocalDateTime getDataHoraSaida() {
		return dataHoraSaida;
	}

	/**
	 * Representa a data e hora em que o veiculo saiu do estacionamento. Esta
	 * data/hora não pode ser menor que a data/hora de entrada.
	 * 
	 * @param dataHoraSaida Data/Hora de saída do veículo.
	 */
	public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
		if (dataHoraSaida != null) {
			if (dataHoraSaida.isAfter(this.dataHoraEntrada)) {
				this.dataHoraSaida = dataHoraSaida;
			}
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor > 0) {
			this.valor = valor;
		}
	}

	@Override
	public String toString() {
		String obj = "Placa: " + this.getVeiculo().getPlaca() + "\n";

		obj += "Data/Hora de entrada: " + this.getDataHoraEntrada() + "\n";
		obj += "Data/Hora de saída: " + this.getDataHoraSaida() + "\n";
		obj += String.format("Valor: R$ %.2f", this.getValor());

		return obj;

	}

}

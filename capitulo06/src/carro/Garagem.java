package carro;

public class Garagem {
	private Carro carroPasseio;
	private Carro carroUtilitario;
	
	public void pintar(Carro carro, String cor){
		carro.setCor(cor);
	}
	
	public Carro getCarroPasseio() {
		return carroPasseio;
	}
	public void setCarroPasseio(Carro carroPasseio) {
		this.carroPasseio = carroPasseio;
	}
	public Carro getCarroUtilitario() {
		return carroUtilitario;
	}
	public void setCarroUtilitario(Carro carroUtilitario) {
		this.carroUtilitario = carroUtilitario;
	}
}

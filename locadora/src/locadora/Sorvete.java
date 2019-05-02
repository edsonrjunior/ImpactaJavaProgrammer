package locadora;

public class Sorvete implements Negociavel {

	private String marca;
	private String sabor;

	public Sorvete(String marca, String sabor) {
		this.marca = marca;
		this.sabor = sabor;
	}

	@Override
	public double calculaPrecoVenda() {
		return 4.5;
	}

	@Override
	public String toString() {
		String obj = "----Sorvete---- \n";
		obj += "Marca: " + this.marca + "\n";
		obj += "Sabor: " + this.sabor;
		return obj;
	}


	
	
	
	
	
}

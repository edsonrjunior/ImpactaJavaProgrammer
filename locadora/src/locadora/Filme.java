package locadora;

public class Filme extends Midia implements Negociavel{

	 private String sinopse;

	@Override
	public String toString() {
		String obj =  "----Filme----\n"; 
			   obj += super.toString() + "\n";
			   obj += "Sinopse: " + this.getSinopse();
			   
		return obj;	   
	}

	public Filme(String titulo, String genero, 
						double preco, String sinopse) {

		super(titulo, genero, preco);
		this.setSinopse(sinopse);
	}

	public Filme() {
		// TODO Auto-generated constructor stub
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Sinopse: " + this.sinopse);
	}
	
	@Override
	public double calculaPrecoVenda() {
		return this.getPrecoDoAluguel() * 3;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package locadora;

public class Musica extends Midia {

	private String gravadora;
	
	public Musica(String titulo){
		super(titulo);
	}
	
	public Musica() {
		// TODO Auto-generated constructor stub
	}

	public Musica(String titulo, String genero, 
						double preco, String gravadora) {
		
		super(titulo,genero,preco);
		this.setGravadora(gravadora);
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	
	@Override
	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("Gravadora: " + this.gravadora);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

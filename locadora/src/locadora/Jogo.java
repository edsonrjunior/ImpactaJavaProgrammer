package locadora;

public class Jogo extends Midia implements Negociavel{
	
	private String console;

	public Jogo(String titulo, String genero, 
					double preco, String console) {
		
		super(titulo,genero,preco);
		this.setConsole(console);
	}
	
	public Jogo() {
		// TODO Auto-generated constructor stub
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}
	
	@Override
	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("Console: " + this.console);
	}
	
	@Override
	public double calculaPrecoVenda() {
		return this.getPrecoDoAluguel() * 6;
	}
	
	@Override
	public String toString() {
		String obj =  "----Jogo----\n"; 
			   obj += super.toString() + "\n";
			   obj += "Console: " + this.getConsole();
			   
		return obj;	   
	}

}

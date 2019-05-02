package locadora;

public class Midia implements Comparable<Midia>{
	
	private String titulo;
	private String genero;
	private double precoDoAluguel;
	
	public Midia(){}
	
	public Midia(String titulo){
		this.setTitulo(titulo);
	}
	
	public Midia(String titulo, String genero){
		this(titulo);
		this.setGenero(genero);
	}
	
	public Midia(String titulo, String genero, double preco){
		this(titulo,genero);
		this.setPrecoDoAluguel(preco);
	}
	
	
	
	public void mostrarDados(){
		System.out.println("Titulo: "+titulo);
		System.out.println("Genero: "+genero);
		System.out.println("Preço do Aluguel: "+precoDoAluguel);
	}
	
	public String getTitulo(){
		return titulo;
	}
		
	public void setTitulo(String valor){
		if(valor != null){
			titulo = valor;
		}
	}
	
	public String getGenero(){
		return genero;
	}
	
	public void setGenero(String valor){
//		if(valor != null){
//			switch(valor.toUpperCase()){
//				case "ACAO": case "AVENTURA" : case "COMEDIA" : 
//				case "DRAMA" : case "FICCAO" : case "ROMANCE" :
//				case "ANIMACAO" : case "TERROR" : case "SUSPENSE":
//					genero = valor;
//					break;
//				default:
//					System.out.println("Gênero INVÁLIDO: "+valor);
//			}
//		}
		this.genero = valor;
	}
	
	public double getPrecoDoAluguel(){
		return precoDoAluguel;
	}
	
	public void setPrecoDoAluguel(double valor){
		if(valor > 0 && valor < 1000){
			precoDoAluguel = valor;
		}else{
			System.out.println
				("Preço deve ser maior que 0 e menor que 1000");
		}
	}

	@Override
	public String toString() {
		String obj =  "Titulo: " + this.titulo + "\n";
		       obj += "Gênero: " + this.genero + "\n";
		       obj += "Preço do Aluguel : " + this.precoDoAluguel;
		       
		return obj;	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Midia other = (Midia) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Midia o) {
		return this.getTitulo().compareTo(o.getTitulo());
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

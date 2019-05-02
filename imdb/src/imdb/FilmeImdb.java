package imdb;
public class FilmeImdb implements Comparable<FilmeImdb>{
	
	private String titulo;
	private String diretores;
	private double nota;
	private int duracao;
	private int ano;
	private String generos;
	private int numVotos;
	private String dataRegistro;
	private String url;
	
	public FilmeImdb(String titulo, String diretores, double nota, int duracao,
			int ano, String generos, int numVotos, String dataRegistro,
			String url) {
		
		this.titulo = titulo;
		this.diretores = diretores;
		this.nota = nota;
		this.duracao = duracao;
		this.ano = ano;
		this.generos = generos;
		this.numVotos = numVotos;
		this.dataRegistro = dataRegistro;
		this.url = url;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDiretores() {
		return diretores;
	}
	public void setDiretores(String diretores) {
		this.diretores = diretores;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getGeneros() {
		return generos;
	}
	public void setGeneros(String generos) {
		this.generos = generos;
	}
	public int getNumVotos() {
		return numVotos;
	}
	public void setNumVotos(int numVotos) {
		this.numVotos = numVotos;
	}
	public String getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString(){
		
		return 
		   String.format("%-60s", this.getTitulo()).concat
		   (String.format("%-40s",this.getDiretores())).concat
		   (String.format("%-8.2f", this.getNota())).concat
		   (String.format("%-8d", this.getDuracao())).concat
		   (String.format("%-8d", this.getAno())).concat		
		   (String.format("%-40s",this.getGeneros())).concat
		   (String.format("%-8d", this.getNumVotos())).concat
		   (String.format("%-15s", this.getDataRegistro())).concat
		   (String.format("%-30s", this.getUrl()));
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result
				+ ((diretores == null) ? 0 : diretores.hashCode());
		result = prime * result + duracao;
		result = prime * result + ((generos == null) ? 0 : generos.hashCode());
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
		FilmeImdb other = (FilmeImdb) obj;
		if (ano != other.ano)
			return false;
		if (diretores == null) {
			if (other.diretores != null)
				return false;
		} else if (!diretores.equals(other.diretores))
			return false;
		if (duracao != other.duracao)
			return false;
		if (generos == null) {
			if (other.generos != null)
				return false;
		} else if (!generos.equals(other.generos))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public int compareTo(FilmeImdb outro) {
		if(this.hashCode() != outro.hashCode() ||
			!this.equals(outro)){
			
			return this.getTitulo().compareToIgnoreCase
					(outro.getTitulo());
		}else{
			return 0;	
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

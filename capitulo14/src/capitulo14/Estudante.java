package capitulo14;

public class Estudante {
	private String nome;
	private double notaMatematica;
	private double notaPortugues;
	private double media;
	
	public Estudante(String nome, double nm, double np) {
		this.setNome(nome);
		this.setNotaMatematica(nm);
		this.setNotaPortugues(np);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public double getNotaPortugues() {
		return notaPortugues;
	}
	public void setNotaPortugues(double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	

}

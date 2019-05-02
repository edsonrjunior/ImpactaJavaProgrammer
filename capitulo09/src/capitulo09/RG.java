package capitulo09;

public class RG {
	
	private int numero;
	private String dataNasc;
	
	public RG(int numero, String dataNasc) {
		this.numero = numero;
		this.dataNasc = dataNasc;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void mostrarDados() {
		System.out.println("Numero RG: " + this.getNumero());
		System.out.println("Data Nascimento: " + this.getDataNasc());
	}
	
	

}

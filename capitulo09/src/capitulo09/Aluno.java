package capitulo09;

public class Aluno extends Pessoa {
	
	private double mensalidade;
	private String curso;

	public Aluno(String nome, int idade, char sexo, 
						int numeroRG, String dataNasc, 
						double mensalidade, String curso) {
		super(nome, idade, sexo, new RG(numeroRG,dataNasc));
		this.setMensalidade(mensalidade);
		this.setCurso(curso);
	}
	@Override
	public void falar(String fala) {
		System.out.println(this.getNome() + " : " + fala);
	}
	@Override
	public void mostrarDados() {
		System.out.println("Nome : " + this.getNome());
		System.out.println("Idade : " + this.getIdade());
		System.out.println("Sexo : " + this.getSexo());
		this.getRg().mostrarDados();
		System.out.println("Mensalidade : " + this.getMensalidade());
		System.out.println("Curso : " + this.getCurso());
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}

package capitulo09;

public class Professor extends Pessoa {
	private double salario;
	private String disciplina;

	public Professor(String nome, int idade, char sexo, 
						int numeroRG, String dataNasc, 
						double salario, String disciplina) {
		super(nome, idade, sexo, new RG(numeroRG,dataNasc));
		this.setDisciplina(disciplina);
		this.setSalario(salario);
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
		System.out.println("Salario : " + this.getSalario());
		System.out.println("Disciplina : " + this.getDisciplina());
	}
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}



}

package br.com.edson.domain;
public class Cap7_Lab3 {
	
	public static void main(String[] args) {
		
		//Passo 2:
		Aluno joao = new Aluno();
		Aluno maria = new Aluno();
		Aluno marcos = new Aluno();
		
		//Passo 3,4,5,6:
		joao.setNome("João");
		joao.contadorDeAlunos++;
		joao.imprimeAluno();
		System.out.println("contador no joao = " + joao.contadorDeAlunos);
		
		System.out.println();
		
		//Passo 3,4,5,6:
		maria.setNome("Maria");
		maria.contadorDeAlunos++;
		maria.imprimeAluno();
		System.out.println("contador na maria = " + maria.contadorDeAlunos);
		
		System.out.println();
		
		//Passo 3,4,5,6:
		marcos.setNome("Marcos");
		marcos.contadorDeAlunos++;
		marcos.imprimeAluno();
		System.out.println("contador no marcos = " + marcos.contadorDeAlunos);
		
		System.out.println();
		
		//Passo 7:
		//System.out.println("contador na classe = " + Aluno.contadorDeAlunos );
		
		
		
	}

}

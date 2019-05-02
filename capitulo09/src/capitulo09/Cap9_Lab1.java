package capitulo09;

public class Cap9_Lab1 {
	
	public static void main(String[] args) {
		
		Pessoa a1 = new Aluno("Manuel",19,'M',521234567,"15/06/1993",
							   1099,"Ciência da Computação");
		
		Pessoa a2 = new Aluno("Claudia",22,'F',415678912,"12/08/1990",
				   			  799,"Administração");
		
		Pessoa prof = new Professor("Rafael",38,'M',261454789,
									"05/02/1974", 2500,"Português");
		
		
		prof.falar("Manuel?");
		a1.falar("Presente");
		prof.falar("Claudia?");
		a2.falar("Presente");
		
		System.out.println();
		prof.mostrarDados();
		System.out.println();
		a1.mostrarDados();
		System.out.println();
		a2.mostrarDados();
		
	}

}

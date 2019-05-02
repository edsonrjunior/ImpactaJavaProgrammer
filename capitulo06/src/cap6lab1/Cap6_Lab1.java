package cap6lab1;

import java.util.Scanner;

public class Cap6_Lab1 {
	
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os dados do funcionário:");
		System.out.println("Nome:");
		f.setNome(scan.next());
		System.out.println("Sobrenome:");
		f.setSobrenome(scan.next());
		System.out.println("Cargo:");
		scan.nextLine();
		f.setCargo(scan.nextLine());
		System.out.println("Salário:");
		f.setSalario(scan.nextDouble());
		System.out.println();
		
		System.out.println("-----------------");
		System.out.println("***Confira os dados digitados***\n");
		
		System.out.printf("Nome Completo: %s %s \n",f.getNome(),f.getSobrenome());
		System.out.printf("Cargo: %s \n",f.getCargo());
		System.out.printf("Salário: R$ %.2f \n",f.getSalario());
		
		
		
		
	}

}

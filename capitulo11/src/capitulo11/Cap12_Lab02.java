package capitulo11;

public interface Cap12_Lab02 {

	public static void main(String[] args) {

		if (args.length > 0) {
			System.out.println("A média das idades: ");
			double soma = 0;
			for (String arg : args) {
				soma += Integer.parseInt(arg);
				System.out.print(arg + " ");
			}
			System.out.println();
			double media = soma / args.length;
			System.out.printf("\n é de %.2f anos.", media);
		}else{
			System.out.println("Informe valores válidos para idades");
		}
	}

}

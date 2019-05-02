package capitulo04;

public class DiasDoMes {

	public static void main(String[] args) {

		String mes = javax.swing.JOptionPane.showInputDialog("Digite o mês:");
		mes = mes.toUpperCase(); // toda letra em caixa alta.
		// JANEIRO FEVEREIRO MARCO ABRIL ...
		switch (mes) {
		
			case "JANEIRO": case "MARCO": case "MAIO":case "JULHO":
			case "AGOSTO":case "OUTUBRO":case "DEZEMBRO":
			
				System.out.printf("O mês de %s tem 31 dias",mes);
				break;
		
			case "ABRIL":case "JUNHO":case "SETEMBRO":case "NOVEMBRO":
				System.out.printf("O mês de %s tem 30 dias",mes);
				break;
		
			case "FEVEREIRO":
				System.out.printf("O mês de %s menos de 30 dias",mes);
				break;
		
			default:
				System.out.printf("O mês de %s NÃO EXISTE!",mes);
		}
	}
}

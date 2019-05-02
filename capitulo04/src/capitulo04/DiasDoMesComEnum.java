package capitulo04;

public class DiasDoMesComEnum {
	
	public static void main(String[] args) {

		String mes = javax.swing.JOptionPane.showInputDialog("Digite o mês:");
		Mes mesDoAno = Mes.valueOf(mes.toUpperCase()); // toda letra em caixa alta.
		
		int attribDias = mesDoAno.getDias();
		
		int qtDeDias = getDiasDoMes(mesDoAno);
		
		System.out.printf("O mês %s tem %d dias\n", 
									mesDoAno.name(),qtDeDias);
		
		System.out.printf("O mês %s tem %d dias\n", 
				mesDoAno.name(),attribDias);

		
		//usando os metodos da enum
		for(Mes m : Mes.values()){
			System.out.printf("%d - %s \n",m.ordinal(),m.name());
		}
	}

	private static int getDiasDoMes(Mes mesDoAno) {
		switch(mesDoAno){
		case JANEIRO: case MARCO: case MAIO: case JULHO: case AGOSTO:
		case OUTUBRO: case DEZEMBRO:
			return 31;
		case ABRIL: case JUNHO: case SETEMBRO: case NOVEMBRO:
			return 30;
		case FEVEREIRO:
			return 28;
		default:
			throw new IllegalArgumentException("invalido");
			
		}
		
	}
	
	
}

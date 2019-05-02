package capitulo16;

public class UsaAssertions {
	
	public static void main(String[] args) {
		System.out.println("chamando metodo com assertion...");
		chamar(-10);
	}

	private static void chamar(int valor) {
		
		assert (valor > 0) : "Valor não pode ser negativo aqui !!!";
		
		//int assert = 10;
		
		System.out.println("Valor informado - "+ valor);
	}
	
	

}

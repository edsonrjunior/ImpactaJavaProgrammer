package capitulo13;

public class UsaOperacao {
	
	public static void main(String[] args) {
		Operacao soma = new Soma();
		imprimirResultado(soma, 30.5, 21.5);
		
		Operacao subtracao = (x,y) -> x-y;
		imprimirResultado(subtracao, 30, 20);
		
		imprimirResultado((x,y)->x*y , 5, 10);
		
		Operacao restoDivisao = (x,y)->{
			
			System.out.println("Este é o resto da divisao ");
			System.out.printf("Envolvidos: %.2f e %.2f \n" ,x,y);
			
			double resultado = x % y;
			
			return resultado;
			
		};
		
	imprimirResultado(restoDivisao, 21, 6);
	
	imprimirResultado(Math::pow, 10, 5);
		
		
	}
	
	static void imprimirResultado
					(Operacao operacao, double op1, double op2){
		
		double result = operacao.executar(op1, op2);
		System.out.printf("Resultado da operacao entre "
							+ "%.2f e %.2f é %.2f \n",op1,op2,result);
	}
}

package capitulo03;

public class Operadores {
	
	public static void main(String[] args) {
		
		/*
		 * Operadores aritmeticos
		 * 
		 * adicao, subtracao, multiplicacao, divis�o, 
		 * "resto da divis�o" (mod) 
		 */
		int a = 10;
		int b = 2;
		
		//adicao
		int soma = a + b;
		System.out.printf("%d + %d = %d \n",a,b,soma);
		
		//subtracao
		int subtracao = a - b;
		System.out.printf("%d - %d = %d \n",a,b,subtracao);
		
		//multiplicacao
		int multiplicacao = a * b;
		System.out.printf("%d x %d = %d \n",a,b,multiplicacao);
		
		//divis�o 
		int divisao = a / b;
		System.out.printf("%d div %d = %d \n",a,b,divisao);
		
		//resto da divis�o
		int mod = a % b;
		System.out.printf("%d mod %d = %d \n",a,b,mod);
		
		
		//auto incremento
		
		int c = 10;
		//somando 1 ao c e guardando a soma
		c = c + 1;
		
		//somando mais 1 ao c e mantendo o valor do resultado final
		//valor inicial de c � 11
		c++; //adiciona 1 � variavel
		System.out.printf("O valor de c � %d \n",c);
		c--; //diminui 1 na vari�vel;
		System.out.printf("O valor de c � %d \n",c);
		
		
		// P�s fixa��o e Pre fixa��o
		
		//Pos-fixado tem precedencia minima 
		int x = 5;
		int y = 0;
		
		y = x++;
		System.out.printf("y vale %d \n",y);
		System.out.printf("x vale %d \n",x);
		
		
		int z = 5;
		int k = 0;
		
		k = ++z;
		System.out.printf("k vale %d \n",k);
		System.out.printf("z vale %d \n",z);
		
		
		
		/*
		 * Operadores Relacionais ou comparativos
		 * 
		 * > >= < <= 
		 * 
		 * == Igualdade
		 * != Diferen�a
		 */
		boolean ehMaior = (5 > 6);
		System.out.printf("%d > %d ? %b \n",5,6,ehMaior);
		
		boolean ehIgual = (10 == 10);
		System.out.printf("%d igual a %d ? %b \n",10,10,ehIgual);
		
		//etc
		
		
		/*
		 * Operadores l�gicos s�o aplicados para construir
		 * uma sente�a comparativa 
		 * 
		 * & ou && AND 
		 * | ou || OR
		 * ^ XoR (ou exclusivo)
		 * ! nega��o 
		 */
		int num1 = 5;
		int num2 = 40;
		boolean resultado = ( (num1 > num2) || (num2 < 60) ) ;	
		
		
		
		/*
		 * Ternario
		 * if reduzido 
		 */
		int idade = 16;
		String mensagem = (idade >= 16) ? "Pode Votar!" : "N�o vota!"; 
		
		System.out.printf("Cidad�o com %d anos %s \n",idade,mensagem);
		
		
		
		/*
		 * Operadpr com atribuicao 
		 * Opera��o reduzida
		 * 
		 *  Vale para todos os operadores aritmeticos
		 */
		int b1 = 10;
		b1 *=40; //equivalente a b1 = b1 * 40;
		System.out.println(b1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

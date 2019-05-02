package capitulo14;

import java.util.Collection;
import java.util.TreeSet;

public class TesteDesempenho {
	
	private static final int TAMANHO = 220000;

	public static void main(String[] args) {
		
		Collection<Integer> numeros = new TreeSet<>();
		
		for (int i = 0; i < TAMANHO; i++) {
			numeros.add(i);
		}
		
		long tInicial = System.currentTimeMillis();
		
		System.out.printf("Pesquisando a coleção ...\n\n");
		
		for (int i = 0; i < TAMANHO; i++) {
			numeros.contains(i); //pesquisa o objeto na colecao
		}
		
		long tFinal = System.currentTimeMillis();
		
		long duracao = tFinal - tInicial; 
		
		System.out.printf("No %s demorou %d ms. \n",
								numeros.getClass().getName(),duracao);
		
		
		
		
		
		
		
		
		
		
		
	}

}

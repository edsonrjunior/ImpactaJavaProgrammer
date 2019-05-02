package capitulo17;

import java.util.Collection;

public class PesquisaColecaoAssincrono implements Runnable {

	private Collection<Integer> numeros;
	private int tamanho;
	
	public PesquisaColecaoAssincrono
						(Collection<Integer> nums, int tam) {
		this.numeros = nums;
		this.tamanho = tam;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < tamanho; i++) {
			numeros.add(i);
		}
		
		long tInicial = System.currentTimeMillis();
		
		System.out.printf("Pesquisando a coleção ...\n\n");
		
		for (int i = 0; i < tamanho; i++) {
			numeros.contains(i); //pesquisa o objeto na colecao
			if(i % 5000 == 0){
				System.out.printf("%s pesquisou %d%n",
									Thread.currentThread().getName(),i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		long tFinal = System.currentTimeMillis();
		
		long duracao = tFinal - tInicial; 
		
		System.out.printf("No %s demorou %d ms. \n",
								numeros.getClass().getName(),duracao);

	}

}

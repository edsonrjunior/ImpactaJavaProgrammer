package capitulo17;

import java.util.List;
import java.util.Vector;

public class PesquisaEmBackground {
	
	public static void main(String[] args) {
		
		System.out.println("Iniciando a pesquisa na coleção...");
		List<Integer> meusNumeros = new Vector<Integer>();
		
		Runnable run = new PesquisaColecaoAssincrono(meusNumeros,120000);
		
		Thread t1 = new Thread(run,"T-PESQUISADOR-001");
		Thread t2 = new Thread(run,"T-PESQUISADOR-002");
		Thread t3 = new Thread(run,"T-PESQUISADOR-003");
		Thread t4 = new Thread(run,"T-PESQUISADOR-004");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		//Antecipando o ponto de espera para encerramento das Threads
		try{
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("Pesquisas encerradas!");
		System.out.println("Encerrado o main!");
	}

}

package capitulo17;

public class UsaThreads {
	
	public static void main(String[] args) {
		
		MinhaThread mt1 = new MinhaThread();
		mt1.start(); //a chamada assincrona

		Runnable executavel = new MeuRunnable();
		Thread t2 = new Thread(executavel);
		t2.start();
		
		System.out.println("Aplicação encerrada!");
		
	}

}

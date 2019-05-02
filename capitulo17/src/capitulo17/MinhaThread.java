package capitulo17;

public class MinhaThread extends Thread{
	
	@Override
	public void run(){
		System.out.println("Iniciando thread...");
		while(true);
	}

}

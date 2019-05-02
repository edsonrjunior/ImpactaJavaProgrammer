package capitulo17;

public class MeuRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable...");
		while(true);
	}

}

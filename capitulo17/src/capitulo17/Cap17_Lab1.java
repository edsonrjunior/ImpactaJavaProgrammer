package capitulo17;

public class Cap17_Lab1 {
	
	public static void main(String[] args) {
//		ThreadLab t1 = new ThreadLab("Thread 1");
//		ThreadLab t2 = new ThreadLab("Thread 2");

		ThreadLabNew t1 = new ThreadLabNew("Thread 1");
		ThreadLabNew t2 = new ThreadLabNew("Thread 2");

		t1.start();
		t2.start();
	}

}

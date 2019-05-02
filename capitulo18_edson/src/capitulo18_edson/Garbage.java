package capitulo18_edson;

public class Garbage {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		int mb = 1048576;
		double totalDeMemoria = rt.maxMemory() / mb;
		System.out.println(totalDeMemoria);

	}

}

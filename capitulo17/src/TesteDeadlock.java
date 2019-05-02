public class TesteDeadlock {
	
	public static void main(String[] args) {
		
		double[] depositos = { 500, 500, 500, 500, 500 };
		double[] debitos = { 500, 500, 500, 500, 500 };

		Conta conta = new Conta(); // objeto compartilhado pelas threads
		
		DepositoRunner tDeposito = new DepositoRunner(conta, depositos);

		DebitoRunner tDebito = new DebitoRunner(conta, debitos);

		Thread tp = new Thread(tDeposito);
		Thread tc = new Thread(tDebito);

		tp.start();
		tc.start();
		
	}

}

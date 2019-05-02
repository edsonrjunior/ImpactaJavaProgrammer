public class DebitoRunner implements Runnable{

	private Conta conta;
	private double[] debitos;
	
	public DebitoRunner(Conta conta, double[] debitos){
		this.conta = conta;
		this.debitos = debitos;
	}
	
	@Override
	public void run() {
		for(double debito : this.debitos){
			this.conta.retira(debito);
		}
	}

}

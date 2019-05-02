public class DepositoRunner implements Runnable{

	private Conta conta;
	private double[] depositos;
	
	public DepositoRunner(Conta conta, double[] depositos){
		this.conta = conta;
		this.depositos = depositos;
	}
	
	@Override
	public void run() {
		for(double deposito : this.depositos){
			this.conta.deposita(deposito);
		}
	}

}

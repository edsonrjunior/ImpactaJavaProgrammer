public class Conta {

	private double saldo;

	public synchronized  void deposita(double valor) {
		double novoSaldo = this.saldo + valor;
		this.saldo = novoSaldo;
		this.notifyAll();
	}

	public synchronized void retira(double valor) {
		while(this.saldo < 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		double novoSaldo = this.saldo - valor;
		this.saldo = novoSaldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

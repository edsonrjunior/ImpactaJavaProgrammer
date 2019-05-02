public class CompensacaoBancaria {

	public static void main(String[] args) throws InterruptedException {
		
		Conta conta = null; 
		
		boolean inconsistencia = false;
		int contador = 1;

		System.out.println("Processando...");
		
		while (!inconsistencia) {

			double[] depositos = { 500, 500, 500, 500, 500 };
			double[] debitos = { 500, 500, 500 };

			conta = new Conta(); // objeto compartilhado pelas threads
			
			DepositoRunner tDeposito = new DepositoRunner(conta, depositos);

			DebitoRunner tDebito = new DebitoRunner(conta, debitos);

			Thread tp = new Thread(tDeposito);
			Thread tc = new Thread(tDebito);

			tp.start();
			tc.start();

			// aguardando encerramento das threads
			tp.join();
			tc.join();
			
			if(conta.getSaldo() != 1000){
				inconsistencia = true;
			}
			
			contador++;
		}

		System.out.println("Realizada " + contador + " transações corretas");
		
		System.out.println("----- ERRO ------");
		System.out.println("Saldo Final esperado: 1000,00");
		System.out.printf("Saldo Final obtido: %.2f", conta.getSaldo());

	}

}

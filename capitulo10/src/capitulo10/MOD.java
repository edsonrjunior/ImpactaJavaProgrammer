package capitulo10;

public class MOD implements Operacao{

	@Override
	public double executar(double operador1, double operador2) {
		return operador1 % operador2;
	}
	
	@Override
	public String toString(){
		return "MOD";
	}
	

}

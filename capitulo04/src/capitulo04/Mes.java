package capitulo04;

public enum Mes {
	
	JANEIRO(31,1), FEVEREIRO(28,2), MARCO(31,3),
	ABRIL(30,4), MAIO(31,5), JUNHO(30,6),
	JULHO(31,7), AGOSTO(31,8), SETEMBRO(30,9),
	OUTUBRO(31,10), NOVEMBRO(30,11), DEZEMBRO(31,12);
	
	private int ordinal;
	private int dias;

	Mes(int dias, int ordinal){
		this.dias = dias;
		this.ordinal = ordinal;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public int getDias() {
		return dias;
	}

	
}

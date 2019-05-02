package capitulo14;

import java.util.Comparator;

import locadora.Midia;

public class ComparaMidiaPorPreco implements Comparator<Midia>{

	@Override
	public int compare(Midia o1, Midia o2) {
		
		if(o1.getPrecoDoAluguel() > o2.getPrecoDoAluguel()){
			return 1;
		}else if(o1.getPrecoDoAluguel() < o2.getPrecoDoAluguel()){
			return -1;
		}
		return 0;
	}

}

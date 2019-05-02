package capitulo14;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UsaUtilitarioLista {
	
	public static void main(String[] args) {
		
		List<String> nomes = new LinkedList<>();//Vector<>();//new ArrayList<>();
		
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Lucila");
		nomes.add("Pedro");
		nomes.add("Zeca");
		nomes.add("Ana");
		nomes.add("José");
		nomes.add("Berenice");
		
		System.out.println("** ORIGINAL **");
		nomes.forEach(x->System.out.println(x));
		
		Collections.sort(nomes); //ordenacao
		
		System.out.println("\n\n** ORDEM DIRETA **");
		nomes.forEach(x->System.out.println(x));
		
		Collections.reverse(nomes);
		
		System.out.println("\n\n** ORDEM REVERSA **");
		nomes.forEach(x->System.out.println(x));
		
		String maior = Collections.max(nomes);
		String menor = Collections.min(nomes);
		
		System.out.println("\n\nA maior é "+maior);
		System.out.println("A menor é "+menor);
		
		Collections.shuffle(nomes);
		System.out.println("\n\n** ORDEM ALEATORIA **");
		nomes.forEach(x->System.out.println(x));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

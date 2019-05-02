package capitulo14;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {
	
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
		nomes.add("Maria");
		nomes.add("Maria");
		
		System.out.println("---Percorrendo com for tradicional---");
		for (int i = 0; i < nomes.size(); i++) {
			System.out.printf("%d : %s \n",i,nomes.get(i));
		}
		
		System.out.println("\n\n---Percorendo com for-each---");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("\n\n---Percorrendo com iterator---");
		Iterator<String> cursor = nomes.iterator();
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}
		
		
		System.out.println("\n\n---Removendo a String Maria---");
		//remove a primeira ocorrencia 
		//nomes.remove("Maria");
		
		//remove todas as ocorrencias
		nomes.removeIf(x->x.equalsIgnoreCase("Maria"));
		//remove todo mundo --- nomes.removeIf(x->true);
		
		System.out.println("\n\n---Percorrendo com Consumer---");
		nomes.forEach(x->System.out.println(x));
		
		//Pesquisar se um elemento está na coleção
		if(nomes.contains("Berenice")){
			System.out.println("Berenice está na lista !");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

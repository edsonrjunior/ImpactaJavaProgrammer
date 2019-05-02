package capitulo14;

import java.util.HashMap;

public class Cap14_Lab01 {
	
	public static void main(String[] args) {
		HashMap<String,Integer> pessoaMap = new HashMap<>();
		
		pessoaMap.put("Roberto", 35);
		pessoaMap.put("Carla", 26);
		pessoaMap.put("Gabriel", 18);
		pessoaMap.put("Bruna", 17);
		
		System.out.println("-- Pessoas --");
		pessoaMap.forEach((k,v) -> System.out.printf("%s: %d%n",k,v));
		
		//Outro jeito...
		System.out.println("-- Pessoas (Outro Jeito) --");
		for (String chave : pessoaMap.keySet()) {
			System.out.printf("%s: %d%n",chave,pessoaMap.get(chave));
		}
		
	}

}

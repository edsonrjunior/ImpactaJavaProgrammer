package capitulo14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import locadora.Filme;
import locadora.Midia;

public class ListaFilmes {
	
	public static void main(String[] args) {
		
		List<Filme> filmes = new ArrayList<>();
		
		filmes.add(new Filme("Matrix","Ficcao",5.4,"Filme Otimo!"));
		filmes.add(new Filme("Corra","Aventura",8.7,"Filme corrido!"));
		filmes.add(new Filme("Up","Animacao",3.2,"Legal!"));
		filmes.add(new Filme("Sorriso","Drama",6.2,"Um bom drama!"));
		filmes.add(new Filme("Jogador #1","Ficcao",11,"Nos cinemas!"));
		filmes.add(new Filme("A Origem","Ficcao",7.1,"Sonhar um sonho!"));
		filmes.add(new Filme("Rambo II","Aventura",5.2,"Está longe!"));
		
//		System.out.println("---Listagem de Filmes---");
//		filmes.forEach(x->System.out.println(x));
		
		Filme paraRemover = 
				new Filme("Rambo II","Aventura",5.2,"Está longe!");
		
		filmes.remove(paraRemover);
		
		System.out.println("--- NOVA Listagem de Filmes ---");
		filmes.forEach(x->System.out.println(x));
		
		
		Collections.sort(filmes);
		System.out.println("\n\n--- Filmes Ordenados ---");
		
		filmes.forEach(x->System.out.println(x));
		
		
		Collections.sort(filmes, new ComparaMidiaPorPreco());
		System.out.println("\n\n--- Filmes Ordenados POR PREÇO---");
		
		filmes.forEach(x->System.out.println(x));
		
		
		
		
/*		
		Filme f1 = new Filme("A Origem","Ficcao",7.1,"Sonhar um sonho!");
		Filme f2 = new Filme("A Origem","Ficcao",7.1,"Sonhar um sonho!");
		
		if(f1.equals(f2)){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
			
		}
		
*/		
		
		

	}

}

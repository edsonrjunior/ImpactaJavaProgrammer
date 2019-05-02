package capitulo11;

import locadora.Filme;
import locadora.Midia;

public class UsaArray {
	
	public static void main(String[] args) {
		
		int[] idades = new int[10];
		
		//Imprimir o tamanho do array
		System.out.printf("O tamanho do array é %d \n",idades.length);
		
		System.out.println("---- Elementos do array ----");
		for (int i = 0; i < idades.length; i++) {
			System.out.println(i + " - " + idades[i]);
			idades[i] = 10; //Altera o elemento no array
		}
		
		System.out.println("---- Elementos do array foreach ----");
		for(int var : idades){
			System.out.println(var);
			var = 20; //Não altera o elemento no array 
		}
		
		System.out.println("---- Array foreach Modificado ???----");
		for(int var : idades){
			System.out.println(var);
		}
		
		//declaracao e inicializacao no mesmo momento
		int idades2[] = {10,13,4,55,76,45};
		System.out.println("---- Array Idades 2 ----");
		for (int num : idades2) {
			System.out.println(num);
		}
		
		idades2 = new int[]{66,77,88};
		
		System.out.println("--- Array de filmes ---");		
		
		Filme[] filmes = new Filme[5];
		filmes[0] = new Filme("Matrix","Ficcao",5.4,"Filme Otimo!");
		filmes[1] = new Filme("Corra","Aventura",7.7,"Filme corrido!");
		filmes[2] = new Filme("Post","Drama",8,"OK");
		filmes[3] = new Filme("Up","Animacao",10,"Desenho legal");
		filmes[4] = new Filme("Os Goonies","Aventura",2.5,"dos antigos!");
		
		for (Filme filme : filmes) {
			System.out.println(filme);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package capitulo14;

import imdb.ExtratorIMDB;
import imdb.FilmeImdb;

import java.util.Comparator;
import java.util.List;

public class PesquisaImdb {
	
	public static void main(String[] args) {
		
		List<FilmeImdb> filmes = ExtratorIMDB.loadFilmes();
		//filmes.forEach(x->System.out.println(x));
		
		FilmeImdb filme = 
				ExtratorIMDB.roleta(filmes, 8, 2000 );
		
		double media = 
			filmes.stream()
			  .sorted(Comparator.comparing(FilmeImdb::getNota))
			  .filter(x -> x.getDiretores().contains("Steven Spielberg"))
			  .mapToDouble(x-> x.getNota())
			  .average().getAsDouble();
		
		System.out.println("Media =" + media);
		
			//  .forEach(x->System.out.println(x));	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

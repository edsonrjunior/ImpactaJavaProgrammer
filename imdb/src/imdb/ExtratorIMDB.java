package imdb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ExtratorIMDB {

	private static List<FilmeImdb> filmes = new ArrayList<>();

	public static void main(String[] args) {

		loadFilmes();

		FilmeImdb sorteado = roleta(filmes, 8, 2000);
		System.out.println("*** Filme SORTEADO ***");
		System.out.println(sorteado);
		
		report(filmes);
	}

	public static List<FilmeImdb> loadFilmes() {

		if (filmes == null || filmes.isEmpty()) {
			try {
				Scanner scan = new Scanner(
						ExtratorIMDB.class.getResourceAsStream("/resources/filmes-imdb-ago-2016.csv"));

				scan.nextLine(); // ignora a primeira linha
				while (scan.hasNextLine()) {
					String linhaFilme = scan.nextLine();

					String[] atributos = linhaFilme.split(";");
					String titulo = atributos[0];
					String diretores = atributos[1];
					double nota = getAsDouble(atributos[2]);
					int duracao = getAsInt(atributos[3]);
					int ano = getAsInt(atributos[4]);
					String generos = atributos[5];
					int numVotos = getAsInt(atributos[6]);
					String dataRegistro = atributos[7];
					String url = atributos[8];

					FilmeImdb filme = new FilmeImdb(titulo, diretores, nota, duracao, ano, generos, numVotos,
							dataRegistro, url);

					filmes.add(filme);
				}

			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}

		return filmes;
	}

	/**
	 * Sorteia um filme que tenha no minimo a nota e a quantidade de votos
	 * informados
	 * 
	 * @param filmes
	 *            Lista original de filmes
	 * @param notaMin
	 *            Nota minima
	 * @param numVotosMin
	 *            Numero de votos minimo
	 * 
	 * @return O Filme sorteado a partir dos parametros informados ou null se
	 *         nenhum filme atender aos critérios
	 */
	public static FilmeImdb roleta(List<FilmeImdb> filmes, int notaMin, int numVotosMin) {

		FilmeImdb filme = null;

		// embaralhar a lista
		Collections.shuffle(filmes);

		filme = filmes.stream()
				.filter(f -> f.getNumVotos() >= numVotosMin)
				.filter(f -> f.getNota() >= notaMin)
				.findFirst()
				.get();

		return filme;
	}

	private static double getAsDouble(String nota) {
		if (nota == null || nota.isEmpty()) {
			return -1;
		} else {
			return Double.parseDouble(nota);
		}
	}

	private static int getAsInt(String atributo) {
		if (atributo == null || atributo.isEmpty()) {
			return -1;
		} else {
			return Integer.parseInt(atributo);
		}
	}

	private static void report(List<FilmeImdb> filmes) {

		System.out.println("\n*** 90's ***");
		filmes.stream().filter(f -> (f.getAno() >= 1990 && f.getAno() < 2000)).forEach(System.out::println);

		System.out.println("\n*** Filme mais Antigo ***");
		FilmeImdb oMaisAntigo = filmes.stream().sorted(Comparator.comparing(FilmeImdb::getAno)).findFirst().get();

		System.out.println(oMaisAntigo);

		System.out.println("\n*** Filmes Recentes ***");
		filmes.stream().filter(f -> f.getAno() >= 2016).forEach(System.out::println);

		System.out.println("\n*** TOP 20 ***");
		filmes.stream().filter(f -> f.getNumVotos() > 1000).sorted(Comparator.comparing(FilmeImdb::getNota).reversed())
				.limit(20).forEach(System.out::println);

		System.out.println("\n*** DOWN 20 ***");
		filmes.stream().filter(f -> f.getNumVotos() > 1000).sorted(Comparator.comparing(FilmeImdb::getNota)).limit(20)
				.forEach(System.out::println);

		System.out.println("\n*** Filmes de Steven Spielberg***");
		filmes.stream().filter(f -> f.getDiretores().contains("Steven Spielberg")).forEach(System.out::println);

		System.out.println("\n*** Filmes de Comédia ***");
		filmes.stream().filter(f -> f.getGeneros().contains("comedy")).forEach(System.out::println);

		System.out.println("\n*** O Filme mais Votado ***");
		FilmeImdb oMaisVotado = filmes.stream().sorted(Comparator.comparing(FilmeImdb::getNumVotos).reversed())
				.findFirst().get();

		System.out.println(oMaisVotado);

		/** TODO: Exibir a nota média dos filmes do diretor Tim Burton **/
		System.out.println("\n*** A nota média do filmes de Tim Burton ***");
		double mediaBurton = filmes.stream().filter(f -> f.getDiretores().contains("Tim Burton"))
				.mapToDouble(FilmeImdb::getNota).average().getAsDouble();

		System.out.printf("A média de Tim Burton é %.2f\n", mediaBurton);

	}

}

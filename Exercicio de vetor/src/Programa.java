//import java.util.Scanner;
//
//public class Programa {
//
//	public static void main(String[] args) {
//
//		String nomes[] = new String[50];
//
//		menu();
//
//	}
//
//	public static void menu() {
//		System.out.println("-------- MENU --------");
//		System.out.println("1 - Adicionar um novo nome");
//		System.out.println("2 - Apresentar os nomes");
//		System.out.println("3 - Pesquisar um nome");
//		System.out.println("4 - Remover um nome");
//		System.out.println("0 - Sair");
//
//		System.out.println("\nDIGITE UMA OPCAO>:");
//
//		Scanner scan = new Scanner(System.in);
//		String valorLido = scan.nextLine();
//
//		int opcao = Integer.parseInt(valorLido);
//
//		switch (opcao) {
//
//		case 1:
//			adicionarNome(nomes, nome);
//			break;
//		case 2:
//			break;
////			apresentarNomes(nome);
//		case 3:
//			break;
////			pesquisarNome(nome);
//		case 4:
//			break;
////			removerNome(nome);
//		case 0:
//			break;
////			sair();
//		default:
//			System.err.println("Opção inválida!");
//			break;
//		}
//	}
//
//	public void adicionarNome(String vetorNomes[], String nome) {
//
//		for (int i = 50; i < vetorNomes.length; i--) {
//			if (vetorNomes[i] != null) {
//				vetorNomes[i] = nome;
//			} else {
//				if (vetorNomes[i] == nome)
//					System.out.println("nome adcionado");
//			}
//		}
//
//	}
//}

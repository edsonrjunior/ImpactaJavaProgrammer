package admcl�ssicarpgpi;

import java.util.Random;
import java.util.Scanner;

public class AdmCl�ssicaRpgPI {

    static String objeto;
    static String soldado;
    static String jokempoJogador;
    public static String result;
    public static String resultRegras;

    static String Jokempo(int a) {

        switch (a) {
            case 1:
                objeto = "Pedra";
                break;
            case 2:
                objeto = "Papel";
                break;
            default:
                objeto = "Tesoura";
                break;
        }
        return (objeto);
    }

    static String jokempoRegras(String a, String b) {
        if ("Pedra".equalsIgnoreCase(jokempoJogador) && "Tesoura".equals(result)) {
            //personagem
            resultRegras = "Personagem Ganhou!!";
        } else if ("Pedra".equalsIgnoreCase(jokempoJogador) && "Papel".equals(result)) {
            resultRegras = soldado + " Ganhou!!";
        } else if ("Tesoura".equalsIgnoreCase(jokempoJogador) && "Papel".equals(result)) {
            resultRegras = "Personagem Ganhou";
        } else if ("Tesoura".equalsIgnoreCase(jokempoJogador) && "Pedra".equals(result)) {
            resultRegras = soldado + " Ganhou!!";
        } else if ("Papel".equalsIgnoreCase(jokempoJogador) && "Pedra".equals(result)) {
            resultRegras = "Personagem Ganhou";
        } else if ("Papel".equalsIgnoreCase(jokempoJogador) && "Tesoura".equals(result)) {
            resultRegras = soldado + " Ganhou!!";
        } else if (jokempoJogador.equalsIgnoreCase(result)) {
            resultRegras = "Empate!!";
        }
        return resultRegras;
    }

    static int Dado1;
    static int Dado2;

    static int Dados1(String a) {
        if (a.equalsIgnoreCase("Sim")) {
            int n = 1 + (int) (Math.random() * 6);
            Dado1 = n;
        }
        return (Dado1);
    }

    static int Dados2(String a) {
        if (a.equalsIgnoreCase("Sim")) {
            int n = 1 + (int) (Math.random() * 6);
            Dado2 = n;
        }
        return (Dado2);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respostas;
        String respostas2;
        String respostas3;
        String soldado1 = "Cabo Hulk";
        soldado = soldado1;

        System.err.println("**Stage 1:  Administra��o Cientif�ca**");
        System.out.println("");
        System.out.println("Estamos em 1903 nos EUA comanadado pelo Mestre Frederick Wislow Taylor\n com �nfase nas tarefas aplicando m�todos cientif�cos para resolu��o dos problemas da\n\t Administra��o, a fim de alavancar a efici�ncia industrial.");
        System.out.println("Carros Fords nas ruas, Homens de terno, bigode e chap�us, mulheres com vestidos, casar�os e ind�strias.");
        System.out.println("");
// fala do personagem
        System.out.println("Vamos encontrar Taylor, Siga em frente ao lado Sul: Sim ou N�o");
        respostas = entrada.next();
        if (respostas.equalsIgnoreCase("Sim")) {
            System.out.println("");
            System.out.println(soldado1 + " aparece");
            System.out.println("Quem � vc?");
            //personagem
            System.out.println("Sou... preciso encontrar mestre Taylor?");
            System.out.println(soldado1 + " Ningu�m chega no mestre, ainda mais com essa apar�ncia.\n Ter� que me derrotar");
            System.out.println("");
            System.out.println(soldado1 + " Jokenp�!!!");

            do {
                System.out.println("Digite Papel, Pedra ou Tesoura: ");
                jokempoJogador = entrada.next();

                int n = 1 + (int) (Math.random() * 4);
                result = Jokempo(n);
                System.out.println(soldado1 + ": " + result);

                System.out.println(jokempoRegras(jokempoJogador, result));
            } while (resultRegras.equals("Empate!!") || resultRegras.equals(soldado + " Ganhou!!"));

            // if (player.equalsIgnoreCase(player + " Ganhou!!")){
            System.out.println(soldado1 + "Voc� ganhou honrosamente, por sua vit�ria de darei informa��es de como encontrar o grande Taylor.");
            System.out.println("");
            System.out.println(soldado1 + "Assim vai a dica para chegar no seu destino: 'Taylor come�ou como oper�rios, analisando seus movimentos\n\t Para perfei�oar a maneira de trabalho de cada um, ent�o ele percebeu que, \n\t o funcion�rio produzia menos do que era capaz com equipamentos dispon�veis. \n\t Ent�o concluiu que um funcion�rio produtivo ao perceber que o outro produzia menos \n\t ganhando a mesma coisa acabou perdendo o ineterrese, nascendo assim a remunera��o por m�rito.");
            //Personagem
            System.out.println("Personagem vlw pela dica," + soldado1 + " A informa��o � de grande valia");
            System.out.println(soldado1 + ": Segue em frente, mas cuidado com que pode aparecer pela frente, h� soldados mais sanguin�rios que eu!!");
            System.out.println("Personagem: Flw Man!!");
            System.out.println("");
            String soldado2 = "Capit�o Am�rica";
            soldado = soldado2;
            System.out.println(" Ent�o personagem sai andando, seguinte em frente com seu objetivo...");
            System.out.println(" Chegando perto do port�o onde Mestre Taylor se encontrava-se surge: " + soldado2);
            System.out.println("");
            System.out.println(soldado2 + " Onde voc� vai, n�o deixarei que entra na White House!!");
            System.out.println(" Personagem : Preciso falar com taylor:");
            System.out.println(soldado2 + " S� por cima do me cad�ver");
            System.out.println("Personagem ent�o vamos lutar!!");
            System.out.println(soldado2 + " Vamos jogar os dados tirando os dois iguais, te deixarei passar nos port�es");
            System.out.println("Personagem, Vamos Jogar? Sim ou N�o ");
            respostas2 = entrada.next();
            if (respostas2.equalsIgnoreCase("Sim")) {
                do {
                    Dados1(respostas2);
                    Dados2(respostas2);
                    System.out.println("Primeiro Dado: " + Dados1(respostas2));
                    System.out.println("Segundo Dado: " + Dados2(respostas2));
                } while (Dado1 != Dado2);
                System.out.println(soldado2+ "Parab�ns Personagem, voc� conseguiu, te deixarei entrar para ver nosso mestre");
                System.out.println("Personagem reverencia soldado e segue...");
                System.out.println("");
                //Personagem
                System.out.println("Port�es se abrem e Personagem da de cara com um enorme casar�o");
                System.out.println("Ent�o Personagem segue pelo jardim at� a porta do grande casar�o");
                System.out.println("Personagem entra, e encontra em uma poltrona em uma biblioteca o grande Mestre Taylor");
                System.out.println("");
                System.out.println("Taylor: Sente-se Rapaz, fiquei sabendo que estava a minha procura, ent�o o que te levou at� aqui?");
                System.out.println("Personagem: Preciso do pergaminho com os pr�ncios da Administra��o Cient�fica.");
                System.out.println("Taylor, mas voc� � estranho em compara��o as outras pessoas, quero saber de onde vem.\n\t J� que vc deseja o pergaminho me conte mais de voc�, ali�s n�o posso dar para qualquer pessoa");
                System.out.println("Realmente n�o sou deste tempo, vim do futuro e para voltar preciso ajudar a Keli");
                System.out.println("Taylor: Como assim futuro, isto existe!!??");
                System.out.println("Personagem: Se existe ou n�o, quero voltar pra casa. Me d� o pergaminho, tenho uma busca maior pela frente.");
                System.out.println("Taylor: Pela sua insist�ncia me convenceu, mas tem um por�m, s� se vc acertar meu desafios, \n\t vou te propor dois desafios voc� � capaz de responder corretamente?\n\t J� que � do futuro, ser� f�cil ");
                System.out.println("O que voc� me fala? Sim ou N�o.");
                respostas3 = entrada.next();
                if (respostas3.equalsIgnoreCase("Sim")){
                
                    
                    
                    
                    
                    
                    
                
                } else {
                    System.out.println("Game over!!");
                    System.exit(0);
                }        
                }else {
                System.out.println("Game over!!");
                System.exit(0);
            }
        } else {
            System.out.println("Game over!!");
                System.exit(0);
        }

    }
}

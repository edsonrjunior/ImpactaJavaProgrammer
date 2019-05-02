package admclássicarpgpi;

import java.util.Random;
import java.util.Scanner;

public class AdmClássicaRpgPI {

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

        System.err.println("**Stage 1:  Administração Cientifíca**");
        System.out.println("");
        System.out.println("Estamos em 1903 nos EUA comanadado pelo Mestre Frederick Wislow Taylor\n com ênfase nas tarefas aplicando métodos cientifícos para resolução dos problemas da\n\t Administração, a fim de alavancar a eficiência industrial.");
        System.out.println("Carros Fords nas ruas, Homens de terno, bigode e chapéus, mulheres com vestidos, casarãos e indústrias.");
        System.out.println("");
// fala do personagem
        System.out.println("Vamos encontrar Taylor, Siga em frente ao lado Sul: Sim ou Não");
        respostas = entrada.next();
        if (respostas.equalsIgnoreCase("Sim")) {
            System.out.println("");
            System.out.println(soldado1 + " aparece");
            System.out.println("Quem é vc?");
            //personagem
            System.out.println("Sou... preciso encontrar mestre Taylor?");
            System.out.println(soldado1 + " Ninguêm chega no mestre, ainda mais com essa aparência.\n Terá que me derrotar");
            System.out.println("");
            System.out.println(soldado1 + " Jokenpô!!!");

            do {
                System.out.println("Digite Papel, Pedra ou Tesoura: ");
                jokempoJogador = entrada.next();

                int n = 1 + (int) (Math.random() * 4);
                result = Jokempo(n);
                System.out.println(soldado1 + ": " + result);

                System.out.println(jokempoRegras(jokempoJogador, result));
            } while (resultRegras.equals("Empate!!") || resultRegras.equals(soldado + " Ganhou!!"));

            // if (player.equalsIgnoreCase(player + " Ganhou!!")){
            System.out.println(soldado1 + "Você ganhou honrosamente, por sua vitória de darei informações de como encontrar o grande Taylor.");
            System.out.println("");
            System.out.println(soldado1 + "Assim vai a dica para chegar no seu destino: 'Taylor começou como operários, analisando seus movimentos\n\t Para perfeiçoar a maneira de trabalho de cada um, então ele percebeu que, \n\t o funcionário produzia menos do que era capaz com equipamentos disponíveis. \n\t Então concluiu que um funcionário produtivo ao perceber que o outro produzia menos \n\t ganhando a mesma coisa acabou perdendo o ineterrese, nascendo assim a remuneração por mérito.");
            //Personagem
            System.out.println("Personagem vlw pela dica," + soldado1 + " A informação é de grande valia");
            System.out.println(soldado1 + ": Segue em frente, mas cuidado com que pode aparecer pela frente, há soldados mais sanguinários que eu!!");
            System.out.println("Personagem: Flw Man!!");
            System.out.println("");
            String soldado2 = "Capitão América";
            soldado = soldado2;
            System.out.println(" Então personagem sai andando, seguinte em frente com seu objetivo...");
            System.out.println(" Chegando perto do portão onde Mestre Taylor se encontrava-se surge: " + soldado2);
            System.out.println("");
            System.out.println(soldado2 + " Onde você vai, não deixarei que entra na White House!!");
            System.out.println(" Personagem : Preciso falar com taylor:");
            System.out.println(soldado2 + " Só por cima do me cadáver");
            System.out.println("Personagem então vamos lutar!!");
            System.out.println(soldado2 + " Vamos jogar os dados tirando os dois iguais, te deixarei passar nos portões");
            System.out.println("Personagem, Vamos Jogar? Sim ou Não ");
            respostas2 = entrada.next();
            if (respostas2.equalsIgnoreCase("Sim")) {
                do {
                    Dados1(respostas2);
                    Dados2(respostas2);
                    System.out.println("Primeiro Dado: " + Dados1(respostas2));
                    System.out.println("Segundo Dado: " + Dados2(respostas2));
                } while (Dado1 != Dado2);
                System.out.println(soldado2+ "Parabéns Personagem, você conseguiu, te deixarei entrar para ver nosso mestre");
                System.out.println("Personagem reverencia soldado e segue...");
                System.out.println("");
                //Personagem
                System.out.println("Portões se abrem e Personagem da de cara com um enorme casarão");
                System.out.println("Então Personagem segue pelo jardim até a porta do grande casarão");
                System.out.println("Personagem entra, e encontra em uma poltrona em uma biblioteca o grande Mestre Taylor");
                System.out.println("");
                System.out.println("Taylor: Sente-se Rapaz, fiquei sabendo que estava a minha procura, então o que te levou até aqui?");
                System.out.println("Personagem: Preciso do pergaminho com os príncios da Administração Científica.");
                System.out.println("Taylor, mas você é estranho em comparação as outras pessoas, quero saber de onde vem.\n\t Já que vc deseja o pergaminho me conte mais de você, aliás não posso dar para qualquer pessoa");
                System.out.println("Realmente não sou deste tempo, vim do futuro e para voltar preciso ajudar a Keli");
                System.out.println("Taylor: Como assim futuro, isto existe!!??");
                System.out.println("Personagem: Se existe ou não, quero voltar pra casa. Me dê o pergaminho, tenho uma busca maior pela frente.");
                System.out.println("Taylor: Pela sua insistência me convenceu, mas tem um porém, só se vc acertar meu desafios, \n\t vou te propor dois desafios você é capaz de responder corretamente?\n\t Já que é do futuro, será fácil ");
                System.out.println("O que você me fala? Sim ou Não.");
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

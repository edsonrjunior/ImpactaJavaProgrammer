package pithetravelrpg;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class PIThetravelRPG {

    static Scanner entrada = new Scanner(System.in);
    static String player;
    static int Pontuacao;
    static int Vidas;
    static int OpcaoMenu;

    // Calculo de vidas
    static int calculaVida (int a){
        int calcula;
        Vidas = 3;
        calcula = Vidas + a;
        // Se perdeu todas a vida o jogo termina e volta ao Menu
        if (Vidas == 0) {
            System.out.println("**GAME OVER**");
            System.exit(0);
            Menu();
        }
    return Vidas;            
    }
    
    //Fun��o Pontua��o, personagem inicia com 3 vidas e 50 pontos, conforme ele patalha ele perde e ganha pontuacao
    // A cada 100 pontua��o ele ganha uma vida e come�a a encher a pontua��o;
    static int calculaPontuacao(int a) {
        int calculoRegrapontuacao;
        int calculoRegravidas;
        int calculoPont;
        Pontuacao = 50;
        
        calculoPont = Pontuacao + a;

        if (Pontuacao == 100) {
            calculoRegrapontuacao = Pontuacao - 100;
            calculaVida(1);
        }
    return Pontuacao;    
    }

    static void PainelPontuacao() {
        System.out.println("Total de Vidas: " + Vidas + " \tTotal de pontua��o: " + Pontuacao);
    }

    // Funcao sele��o de personagens.
    static String Personagem(int a) {
        if (a == 1) {
            player = "Chronos";
        } else {
            player = "Beatrixe";
        }
        return (player);
    }

    // Fun��o menu.
    public static int Menu() {
        int personagem;
        int opcao;

        //Tela de boas vindas
        System.out.println("______________________________________________________________________________________________");
        System.out.println("|                                                                                            |");
        System.out.println("|                                                                                            |");
        System.out.println("|                                Seja bem vindo ao The Travel!!                              |");
        System.out.println("|                                                                                            |");
        System.out.println("|       Aqui voce viajara al�m do tempo para recuperar pergaminhos de administracao,         |");
        System.out.println("|                   ajudar� a misteriosa Keli a recuperar seu planeta.                       |");
        System.out.println("|                                                                                            |");
        System.out.println("|                                                                                            |");
        System.out.println("|____________________________________________________________________________________________|");

        //Tela de opcoes Menu
        System.out.println("______________________________________________________________________________________________");
        System.out.println("|                                                                                            |");
        System.out.println("|                                                                                            |");
        System.out.println("|                                           MENU                                             |");
        System.out.println("|                                                                                            |");
        System.out.println("|                                         1 - Jogar                                          |");
        System.out.println("|                                         2 - Instruc�es                                     |");
        System.out.println("|                                         3 - Cr�ditos                                       |");
        System.out.println("|                                         4 - Sair                                           |");
        System.out.println("|                                                                                            |");
        System.out.println("|____________________________________________________________________________________________|");

        //Loop para escolher at� jogar
        do {
            opcao = entrada.nextInt();

            switch (opcao) {
                //Escolha dos Personagens
                case 1:
                    System.out.println("______________________________________________________________________________________________");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                Vamos Nessa!!                                               |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                         **Selecione seu Personagem**                                       |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|         1 - para Chronos: Aluno de TADS, jovem,descolado, topa qualquer aventura.          |");
                    System.out.println("|         2 - para Beatrixe: Aluna de Economia, jovem, estudiosa, corajosa.                  |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                          Digite n�mero do personagem:                                      |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|____________________________________________________________________________________________|");

                    personagem = entrada.nextInt();
                    Personagem(personagem);
                    System.out.println("Voce escolheu " + player);
                    System.out.println("");
                    break;
                //Instrucoes.
                case 2:
                    System.out.println("______________________________________________________________________________________________");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                       INSTRU��ES                                           |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|          O objetivo do jogo e viajar entre as eras, e recuperar os pegaminhos;             |");
                    System.out.println("|           A batalha entre os soldados te proporcionas dicas a ser utilizadas;              |");
                    System.out.println("|                                 Conquiste os pegaminhos.                                   |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|____________________________________________________________________________________________|");

                    //Tela de opcoes Menu - Volta Menu depois de instru��es
                    System.out.println("______________________________________________________________________________________________");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                           MENU                                             |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                         1 - Jogar                                          |");
                    System.out.println("|                                         2 - Instruc�es                                     |");
                    System.out.println("|                                         3 - Cr�ditos                                       |");
                    System.out.println("|                                         4 - Sair                                           |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|____________________________________________________________________________________________|");
                    break;
                //Cr�ditos: desenvolvedores.
                case 3:
                    System.out.println("______________________________________________________________________________________________");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                       CR�DITOS                                             |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                               Turma A - 2� Per�odo 2018                                    |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                      Alexsandro                                            |");
                    System.out.println("|                                     Deise Moraes                                           |");
                    System.out.println("|                                       Leonardo                                             |");
                    System.out.println("|                                     Marcos Lopes                                           |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|____________________________________________________________________________________________|");

                    //Tela de opcoes Menu - Volta Menu depois de instru��es
                    System.out.println("______________________________________________________________________________________________");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                           MENU                                             |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                         1 - Jogar                                          |");
                    System.out.println("|                                         2 - Instruc�es                                     |");
                    System.out.println("|                                         3 - Cr�ditos                                       |");
                    System.out.println("|                                         4 - Sair                                           |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|____________________________________________________________________________________________|");
                    break;
                //Opcao sair aborta o jogo.    
                case 4:
                    System.out.println("______________________________________________________________________________________________");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|                                       Voce escolheu SAIR!                                  |");
                    System.out.println("|                                                                                            |");
                    System.out.println("|____________________________________________________________________________________________|");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Op��o Inv�lida");
            }

        } while (opcao != 1 && opcao != 4);

        return (OpcaoMenu = opcao);
    }

    //Funcao Jokempo; continu�ra rodando at� o personagem ganhar;
    static void batalhaJokempo() {
        String jokempoJogador;
        String jokempoSoldado;
        String resultRegras = "";

        // Fazer loop at� personagem ganhar
        do {
            //Perda de pontos a cada do/while utilizado
            calculaPontuacao(-5);
            System.out.println("- 5 de pontua��o");
            System.out.println("Digite Papel, Pedra ou Tesoura: ");
            jokempoJogador = entrada.next();

            // Comando para gerar aleat�rio jokempo do Soldado
            int n = 1 + (int) (Math.random() * 3);
            String objeto = "";
            switch (n) {
                case 1:
                    objeto = "Pedra";
                    break;
                case 2:
                    objeto = "Papel";
                    break;
                case 3:
                    objeto = "Tesoura";
                    break;
            }
            jokempoSoldado = objeto;
            System.out.println("Soldado: " + jokempoSoldado);
            // Aplica��o das regras
            if ("Pedra".equalsIgnoreCase(jokempoJogador) && "Tesoura".equals(jokempoSoldado)) {
                resultRegras = player + " Ganhou!!";
                System.out.println(player + " Ganhou!!");
            } else if ("Pedra".equalsIgnoreCase(jokempoJogador) && "Papel".equals(jokempoSoldado)) {
                resultRegras = "Soldado Ganhou!!";
                System.out.println("Soldado Ganhou!!");
            } else if ("Tesoura".equalsIgnoreCase(jokempoJogador) && "Papel".equals(jokempoSoldado)) {
                resultRegras = player + " Ganhou";
                System.out.println(player + " Ganhou!!");
            } else if ("Tesoura".equalsIgnoreCase(jokempoJogador) && "Pedra".equals(jokempoSoldado)) {
                resultRegras = "Soldado Ganhou!!";
                System.out.println("Soldado Ganhou!!");
            } else if ("Papel".equalsIgnoreCase(jokempoJogador) && "Pedra".equals(jokempoSoldado)) {
                resultRegras = player += " Ganhou";
                System.out.println(player + " Ganhou!!");
            } else if ("Papel".equalsIgnoreCase(jokempoJogador) && "Tesoura".equals(jokempoSoldado)) {
                resultRegras = "Soldado Ganhou!!";
                System.out.println("Soldado Ganhou!!");
            } else if (jokempoJogador.equalsIgnoreCase(jokempoSoldado)) {
                resultRegras = "Empate!!";
                System.out.println("Empate!!");
            }
        } while (resultRegras.equals("Empate!!") || resultRegras.equals("Soldado Ganhou!!"));
    }

    // Funcao dados: ganha quando os dois dados tiverem numera��o igual
    static void BatalhaDados() {
        int Dado1;
        int Dado2;
        String ResultDado = "";
        String Jogar;

        // Calcula valor dos dados at� que forem iguais, e penaliza pontua��o -5.
        do {
            calculaPontuacao(-5);
            System.out.println("- 5 de pontua��o");
            System.out.println("");
            System.out.println("Jogar dados Agora? Sim ou N�o");
            Jogar = entrada.next();

            if (Jogar.equalsIgnoreCase("Sim")) {
                int n = 1 + (int) (Math.random() * 6);
                Dado1 = n;
                System.out.println("Primeiro dado: " + Dado1);
                int m = 1 + (int) (Math.random() * 6);
                Dado2 = m;
                System.out.println("Segundo dado: " + Dado2);
                if (Dado1 == Dado2) {
                    ResultDado = player + " Ganhou!!";
                    System.out.println(player + "Ganhou!!");
                    Pontuacao = +10;
                    System.out.println("Ganhou mais 10 de pontua��o");
                } else {
                    ResultDado = "Soldado Ganhou!!";
                    System.out.println("Soldado Ganhou!!");
                }
            }
        } while (ResultDado.equals("Soldado Ganhou!!"));
    }

    // Funcao Jogo Advinha, Advinhar qual n�mero est� na m�o do soldado
    static void jogoAdivinha() {

        Random geradorA = new Random();

        int chute = 0;
        int nAle;
        int g = 5;

        // random para jogada do computador
        nAle = geradorA.nextInt(g);
        System.out.println("Soldado: Apenas um n�mero de 1 a 10 sera o meu escolhido!");
        System.out.println("Consegue adivinhar qual numero esta em minhas m�os?? ");
        // Loop para o jogo rodar at� jogador ganhar
        do {
            // perda de pontua��o a cada loop
            calculaPontuacao(-5);
            System.out.println("- 5 de pontua��o");
            for (int t = 1; t < 11; t++) {
                System.out.printf("\t...........................\n");
                System.out.print("Digite o numero que pode estar em minhas m�os: ");
                chute = entrada.nextInt();
                System.out.println("\t* * * * * * * * * * * * * * ");

                if (chute == nAle) {
                    System.out.println(player + "Ganhou");
                    break;
                } else if (chute < nAle && chute < 11) {
                    System.out.println("\nSeu n�mero � menor do que est� em minhas m�os!!");
                } else if (chute > nAle && chute < 11) {
                    System.out.println("\nSeu n�mero � maior do que esta em minhas m�os!!");
                } else {
                    System.err.println("\tN�mero invalido!!");
                    System.exit(0);
                }
            }
        } while (chute != nAle);
    }
    
    // Perguntas e Respotas, dos desafios do mestre das teorias.
    static void ParouImpar() {
        int player1;
        String result;
        String resultpc;
        
        calculaPontuacao(-5);
        System.out.println("Digite um n�mero desejada: ");
        player1 = entrada.nextInt();
        
        do{
        if (player1 % 2 == 0) {
            System.out.println(player+": Escolheu Par");
            result = "Par";
        } else {
            System.out.println(player+": Escolheu impar");
            result = "Impar";
        }
        
        int computador = (int) (Math.random() * 3 + 1);

        if (computador % 2 == 0) {
            System.out.println("O soldado escolheu Par");
            resultpc = "Par";

        } else {
            System.out.println("O soldado escolheu impar");
            resultpc = "Impar";
        }
    }while (result==resultpc);
    }    

    // Perguntas e Respotas, dos desafios do mestre das teorias.
    // Em desenvolvimento
    static String Desafios(int a) {
        String result = "";
        String resposta;

        // Matriz que guarda quest�o de desafio        
        String[][] DesafioAdmCientica = new String[5][3];
        DesafioAdmCientica[0][1] = "1 - Como se pode observar � Administra��o Ci�ntifica?";
        DesafioAdmCientica[1][1] = "A - Produzir mais com menos estabelecendo procedimentos e processos.";
        DesafioAdmCientica[2][1] = "B - Observar os processos de qualidade.";
        DesafioAdmCientica[3][1] = "C - Valorizar o trabalho e pagando mais aos funcion�rios";
        DesafioAdmCientica[4][1] = "D - Trabalho sem procedimentos e processo visando somente o trabalho em massa.";
        DesafioAdmCientica[0][2] = "2 - Qual a principal caracteristica da Administra��o Ci�nfica?";
        DesafioAdmCientica[1][2] = "A - �nfase no planejamento.";
        DesafioAdmCientica[2][2] = "B - �nfase na estrutura.";
        DesafioAdmCientica[3][2] = "C - �nfase nas tarefas.";
        DesafioAdmCientica[4][2] = "D - Todas alternativas est�o corretas.";
        DesafioAdmCientica[0][3] = "3 - Qual os princip�os da Administra��o?";
        DesafioAdmCientica[1][3] = "A - Planejar, Gerenciamento, Subordina��o e Coordena��o";
        DesafioAdmCientica[2][3] = "B - Planejar, Coordenar, Controlar e Gerenciar";
        DesafioAdmCientica[3][3] = "C - Planejar e Gerenciar";
        DesafioAdmCientica[4][3] = "D - Todas alternativas est�o corretas.";
        // Loop para rodar at� as vidas chegarem a 0
        do {
            // Desafio 1 - puxa a quest�o na matriz entre 1 e 2
            switch (a) {
                case 1:
                    System.out.println(DesafioAdmCientica[0][1]);
                    System.out.println(DesafioAdmCientica[1][1]);
                    System.out.println(DesafioAdmCientica[2][1]);
                    System.out.println(DesafioAdmCientica[3][1]);
                    System.out.println(DesafioAdmCientica[4][1]);
                    System.out.println("Digite resposta de A � D: ");
                    resposta = entrada.next();
                    // testa a respota
                    if ("A".equalsIgnoreCase(resposta)) {
                        result = player + "Ganhou";
                        calculaPontuacao(50);
                        System.out.println("+50 de pontua��o");
                        System.out.println(" Ganhou 50 pontos!!");
                    } else {
                        calculaVida(-1);
                        result = player + "Perdeu!!\n Resposta correta �: " + DesafioAdmCientica[1][1];
                        System.out.println("Perdeu vida");
                    }
                    //Desafio 2 - if para puxar o desafio
                    break;
                case 2:
                    System.out.println(DesafioAdmCientica[0][2]);
                    System.out.println(DesafioAdmCientica[1][2]);
                    System.out.println(DesafioAdmCientica[2][2]);
                    System.out.println(DesafioAdmCientica[3][2]);
                    System.out.println(DesafioAdmCientica[4][2]);
                    System.out.println("Digite resposta de A � D: ");
                    resposta = entrada.next();
                    //testa a resposta, adere pontua��o e vidas
                    if ("C".equalsIgnoreCase(resposta)) {
                        result = player + "Ganhou";
                        Pontuacao = +50;
                        System.out.println(" Ganhou 50 pontos!!");
                    } else {
                        Vidas = -1;
                        result = player + "Perdeu!!";
                        System.out.println(" Resposta correta �: " + DesafioAdmCientica[3][2]);
                        System.out.println("Perdeu vida");
                    }
                    // Desafio Final Keli
                    break;
                case 3:
                    System.out.println(DesafioAdmCientica[0][3]);
                    System.out.println(DesafioAdmCientica[1][3]);
                    System.out.println(DesafioAdmCientica[2][3]);
                    System.out.println(DesafioAdmCientica[3][3]);
                    System.out.println(DesafioAdmCientica[4][3]);
                    System.out.println("Digite resposta de A � D: ");
                    resposta = entrada.next();
                    // testa a respota
                    if ("B".equalsIgnoreCase(resposta)) {
                        result = player + "Ganhou";
                        Pontuacao = +50;
                        System.out.println("+50 de pontua��o");
                        System.out.println(" Ganhou 50 pontos!!");
                    } else {
                        Vidas = -1;
                        result = player + "Perdeu!!\n Resposta correta �: " + DesafioAdmCientica[2][3];
                        System.out.println("Perdeu vida");
                    }       break;
                default:
                    break;
            }
        } while (Vidas == 0);

        return result;
    }

    // Tratamento/Controle dos Desafios
    static void resultDesafio(int a) {
        String result = Desafios(a);
        if (result.equalsIgnoreCase("Ganhou")) {
            System.out.println("Est� aqui o pergaminho!! Parab�ns");
            System.out.println(player + " Ao tocar no pergaminhos!! Desaparece!!");
        } else if (Vidas == 0) {
            System.out.println("Voc� perdeu!! " + player + " Volte ao in�cio");
            System.exit(0);

        }
    }

    // Estagio Mundo Administra��o cientif�ca
    static void AdmCientifica() {
        //vari�veis utilizadas durante o jogo
        // vari�vel de resposta para encontrar o mestre
        String respostas;
        // respostas mestre
        String respostas1;
        String soldado1 = "Cabo Hulk";
        String soldado2 = "Capit�o Am�rica";

        // Stage da teoria Adm Cientif�ca 
        System.out.println("                    **ADMINISTRA��O CIENTIF�CA**                     ");
        System.out.println("");
        PainelPontuacao();
        // Breve descri��o da teria, informa��o a ser utilizada no Desafio com o mestre (� o estudo da mat�ria).
        System.out.println("Estamos em 1903 nos EUA comanadado pelo Mestre Frederick Wislow Taylor\n com enfase nas tarefas aplicando m�todos cientif�cos para resolu��oo dos problemas da\n\t Administra��o, a fim de alavancar a eficiencia industrial.");
        System.out.println("Os princ�pios da Administra��o ci�ntif�ca s�o;");
        System.out.println("1 - Estudo de tempos e padr�es de produ��o: o tempo e como era feito.");
        System.out.println("2 - Supervis�o funcional: exist�ncia de v�rio supervisores para cada especializa��o.");
        System.out.println("3 - Padroniza��o:  das m�quinas e ferramentas ou seja dos instrumentos de trabalho.");
        System.out.println("4 - Planejamento do desenho de tarefas e cargos");
        System.out.println("5 - Princ�pio de exce��o: cuidar somento do planejamento e deixar o operacional ao funcion�rios");
        System.out.println("6 - Pr�mios de produ��o pela execu��o eficiente das tarefas: ");
        System.out.println("7 - Defini��o da rotina de trabalho.");
        System.out.println("");
        System.out.println("Carros Fords nas ruas, Homens de terno, bigode e chap�us, mulheres com vestidos, casar�os e ind�strias.");
        System.out.println("");

        System.out.println("Vamos encontrar Taylor, Siga em frente ao lado Sul. Sim ou n�o");
        respostas = entrada.next();
        System.out.println("");
        if (respostas.equalsIgnoreCase("Sim")) {
            System.out.println("");
            System.out.println(soldado1 + " aparece");
            System.out.println(soldado1 + "Quem � vc?");
            System.out.println(player + " preciso encontrar mestre Taylor?");
            System.out.println(soldado1 + " Ningu�m chega no mestre, ainda mais com essa apar�ncia.\n Ter� que me derrotar");
            System.out.println("");
            PainelPontuacao();
            System.out.println(soldado1 + "Jokempoooo");

            //Chamada fun�ao Jokempo
            batalhaJokempo();
            PainelPontuacao();
            // Continua ap�s vit�ria
            System.out.println(soldado1 + "Você ganhou honrosamente, por sua vitória de darei informações de como encontrar o grande Taylor.");
            System.out.println("");
            // Dica sobre a teoria Ci�ntifica, informa��o utilizada para responder os desafios do Mestre
            System.out.println(soldado1 + "Assim vai a dica para chegar no seu destino: 'Taylor começou como operários, analisando seus movimentos\n\t Para perfeisoar a maneira de trabalho de cada um, ent�o ele percebeu que, \n\t o funcionário produzia menos do que era capaz com equipamentos disponíveis. \n\t E concluiu que um funcionário produtivo ao perceber que o outro produzia menos \n\t ganhando a mesma coisa acabou perdendo o ineterrese, nascendo assim a remuneração por mérito.");
            System.out.println(player + ": vlw pela dica," + soldado1 + " A informa��o � de grande valia");
            System.out.println(soldado1 + ": Segue em frente, mas cuidado com que pode aparecer pela frente, h� soldados mais sanguin�rios que eu!!");
            System.out.println("Personagem: Flw Man!!");
            System.out.println("");
            System.out.println(" Ent�o " + player + " sai andando, seguinte em frente com seu objetivo...");
            System.out.println(" Chegando perto do port�oo onde Mestre Taylor se encontrava-se surge: " + soldado2);
            System.out.println("");
            System.out.println(soldado2 + " Onde voc� vai, n�o deixarei que entra na White House!!");
            System.out.println(player + " : Preciso falar com Taylor:");
            System.out.println(soldado2 + " S� por cima do me cad�ver");
            System.out.println(player + " ent�oo vamos lutar!!");
            System.out.println(soldado2 + " Vamos jogar os dados tirando os dois iguais, te deixarei passar nos port�es");
            PainelPontuacao();
            //Chama batalha dos dados
            BatalhaDados();
            PainelPontuacao();
            // ap�s ganhar
            System.out.println(soldado2 + "Parabéns" + player + " você conseguiu, te deixarei entrar para ver nosso mestre");
            System.out.println(soldado2 + " Ai vai uma dica, este tempo proz mais com menos.");
            System.out.println(player + " reverencia soldado e segue...");
            System.out.println("");
            System.out.println("Portões se abrem e " + player + " da de cara com um enorme casarão");
            System.out.println("Então" + player + " segue pelo jardim até a porta do grande casarão");
            System.out.println(player + " entra, e encontra em uma poltrona em uma biblioteca o grande Mestre Taylor");
            System.out.println("");
            System.out.println("Taylor: Sente-se Rapaz, fiquei sabendo que estava a minha procura, então o que te levou até aqui?");
            System.out.println(player + ": Preciso do pergaminho com os príncios da Administração Científica.");
            System.out.println("Taylor, mas você é estranho em comparação as outras pessoas, quero saber de onde vem.\n\t Já que vc deseja o pergaminho me conte mais de você, aliás não posso dar para qualquer pessoa");
            System.out.println(player + "Realmente não sou deste tempo, vim do futuro e para voltar preciso ajudar a Keli");
            System.out.println("Taylor: Como assim futuro, isto existe!!??");
            System.out.println(player + ": Se existe ou não, quero voltar pra casa. Me dê o pergaminho, tenho uma busca maior pela frente.");
            System.out.println("Taylor: Pela sua insistência me convenceu, mas tem um por�m, só se vc acertar meu desafios, \n\t vou te propor dois desafios você é capaz de responder corretamente?\n\t Já que é do futuro, será fácil ");
            PainelPontuacao();
            // Chama o Desafio do Mestre, quest�es de Adm Cientifica atrav�s do Random
            Random gerador = new Random();
            for (int i=1;i<=2;i++){
            Desafios(gerador.nextInt());
            resultDesafio(gerador.nextInt());
            System.out.println("");
            PainelPontuacao();
        } 
        }else {
            System.out.println("Game over!!");
            Menu();
        }
    }

    // Est�gio Mundo Admnistra��o Cl�ssica
    static void AdmClasisca() {

    }

    // Estagio Mundo Administra��o por objetivos 
    static void AdmAPO() {

    }

    // Estagio Mundo Administra��o por Sistemas
    static void AdmSistema() {

    }

    //Fun��o onde ir� ter todas a fun��o dos mundos e da personagem que � guia durante as viagens
    static void controladorkeli() {
        //Chama Menu
        Menu();
        
        System.out.println("Keli: Bem vindo ao meu mundo" + player);
        System.out.println("Keli: Gastei minhas �ltimas energias para te trazer aqui");
        System.out.println("Keli: Preciso que me ajude conseguindo os pergaminhos com grandes Mestres");
        System.out.println(player + ": E se eu n�o quiser? ");
        System.out.println("Keli: sinto muito mas vai ficar preso aqui para sempre");
        System.out.println("Keli: Vou te Mandar para o primeiro mundo, para conseguir o pergaminho");
        System.out.println(player + " E ele ficou sem entender nada...");
        System.out.println("");
        
        AdmCientifica();
        System.out.println("Keli: Meus parab�ns!! Conseguiu o primeiro pergaminho.");
        System.out.println("Vamos para o pr�ximo!!?");
        System.out.println("");
        
        AdmClasisca();
        System.out.println("Keli: Meus parab�ns!! Conseguiu o primeiro pergaminho.");
        System.out.println("Vamos para o pr�ximo!!?");
        System.out.println("");
        
        AdmSistema();
        System.out.println("Keli: Meus parab�ns!! Conseguiu o primeiro pergaminho.");
        System.out.println("Vamos para o pr�ximo!!?");
        System.out.println("");
        
        AdmAPO();
        System.out.println("Keli: Obrigada por me ajudar, assim recuperarei meu poder");
        System.out.println("Keli: Vamos l� para um �ltimo desafio!!");
        System.out.println("Keli: Assim ir� para casa");
        System.out.println("");
        
        Desafios(3);
        
        resultDesafio(3);
        
        System.out.println("Keli: Parab�ns vc vai para casa");

    }

    public static void main(String[] args) throws IOException {
        controladorkeli();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //OBJETIVO: CRIAR UM PROGRAMA QUE SEJA EXECUTADO CONTINUAMENTE
        //ATÉ O USUARIO SELECIONAR A OPÇÃO DE SAIR
        /*AS OPÇÕES DO PROGRAMA SERÃO AS SEGUINTES:
            [ 1 ] - SOMA
            [ 2 ] - SUBTRAÇÃO
            [ 3 ] - MULTIPLICAÇÃO
            [ 4 ] - DIVISÃO
            [ 5 ] - ESCOLHER UMA TAREFA ALEATÓRIA
            [ 0 ] - FECHAR PROGRAMA
         */
        
        //CRIANDO SCANNER
        Scanner input = new Scanner(System.in);
        
        //CRIANDO A LISTA DE TAREFAS QUE SERÁ USADA POSTERIORMENTE
        String[] tarefas = {"Estudar", "Lavar a louça", "Varrer a casa", "Arrumar a cama"};

        //CRIANDO VÁRIAVEL DE CONTROLE DAS OPÇÕES
        int opcao = 0;

        //CRIANDO O LOOP QUE VAI MANTER O USUÁRIO NO PROGRAMA
        //SERÁ INTERROMPIDO SE A OPCAO SE MANTER EM ZERO
        do{
            System.out.println("""
                    ESCOLHA:
                    [ 1 ] - SOMA
                    [ 2 ] - SUBTRAÇÃO
                    [ 3 ] - MULTIPLICAÇÃO
                    [ 4 ] - DIVISÃO
                    [ 5 ] - TAREFA ALEATÓRIA
                    [ 0 ] - FECHAR PROGRAMA
                    """);
                    //ESCOLHA DO USUARIO
                    opcao = input.nextInt();

                    //INICIANDO VARIAVEIS PRA CASO SEJA ESCOLHIDO UMA OPERAÇÃO MATEMATICA
                    int num1 = 0;
                    int num2 = 0;

                    // SE A OPCAO FOR UMA DAS 4 PRIMEIRAS,
                    //PERGUNTE OS NÚMEROS AO USUÁRIO
                    if(opcao > 0 && opcao < 5){
                        System.out.println("Digite o primeiro número");
                        num1 = input.nextInt();

                        System.out.println("Digite o segundo número");
                        num2 = input.nextInt();
                    }

                    //RESULTADO PARA CADA OPÇÃO
                    switch (opcao) {
                        case 1:
                            System.out.println("==================================================");
                            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                            System.out.println("==================================================");
                            break;
                        case 2:
                            System.out.println("==================================================");
                            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                            System.out.println("==================================================");
                            break;
                        case 3:
                            System.out.println("==================================================");
                            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                            System.out.println("==================================================");
                            break;
                        case 4:
                            System.out.println("==================================================");
                            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                            System.out.println("==================================================");
                            break;
                        case 5:
                            int max = 3;
                            int min = 0;
                            //FORMULA PARA GERAR NÚMERO ALEATÓRIO ENTRE O NÚMERO MIN E MAX
                            double randomNum = Math.floor(Math.random() * (max - min + 1) + min);
                            System.out.println("==================================================");
                            //(int)randomNum serve para transformar o double em int
                            // tarefas[ e ] sendo que "e" é o indice aleatório gerado
                            System.out.println(tarefas[(int)randomNum]);
                            System.out.println("==================================================");
                            break;
                        case 0:
                            break;
                        default:
                        //DEFAULT É PARA CASO O USUARIO DIGITE UMA OPÇÃO FORA DAS INSERIDAS AQUI
                            System.out.println("""
                                ==============================================================
                                    DIGITE UM NÚMERO VÁLIDO
                                ==============================================================
                                    """);
                    }
        }while(opcao != 0);
        input.close();
    }
}

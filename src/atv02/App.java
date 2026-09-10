package atv02;

import java.util.Scanner;

import atv02.q1.DivisaoSegura;
import atv02.q2.AcessoArray;
import atv02.q3.ConversaoNumero;
import atv02.q4.MultiplosCatches;
import atv02.q5.FinallyExemplo;
import atv02.q6.ReferenciaNula;
import atv02.q7.CadastroIdade;
import atv02.q8.ContaBancaria;
import atv02.q9.CarrinhoCompras;
import atv02.q10.Calculadora;

    public class App {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                System.out.println();
                System.out.println("===== MENU - Tratamento de Erros e Excecoes =====");
                System.out.println("1  - Divisao Segura");
                System.out.println("2  - Acesso Seguro a um Array");
                System.out.println("3  - Conversao de Texto para Numero");
                System.out.println("4  - Multiplos Catches");
                System.out.println("5  - Garantindo a Execucao com finally");
                System.out.println("6  - Investigando uma Referencia Nula");
                System.out.println("7  - Excecao Personalizada: Idade Invalida");
                System.out.println("8  - Excecao Personalizada: Saldo Insuficiente");
                System.out.println("9  - Validando um Carrinho de Compras");
                System.out.println("10 - Calculadora com Menu");
                System.out.println("0  - Sair");
                System.out.print("Escolha uma opcao: ");

                opcao = lerOpcao(scanner);

                switch (opcao) {
                    case 1:
                        DivisaoSegura.executar(scanner);
                        break;
                    case 2:
                        AcessoArray.executar(scanner);
                        break;
                    case 3:
                        ConversaoNumero.executar(scanner);
                        break;
                    case 4:
                        MultiplosCatches.executar(scanner);
                        break;
                    case 5:
                        FinallyExemplo.executar(scanner);
                        break;
                    case 6:
                        ReferenciaNula.executar();
                        break;
                    case 7:
                        CadastroIdade.executar(scanner);
                        break;
                    case 8:
                        ContaBancaria.executar(scanner);
                        break;
                    case 9:
                        CarrinhoCompras.executar(scanner);
                        break;
                    case 10:
                        Calculadora.executar(scanner);
                        break;
                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opcao invalida! Escolha um numero entre 0 e 10.");
                }

            } while (opcao != 0);

            scanner.close();
        }

        private static int lerOpcao(Scanner scanner) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida! Digite um numero.");
                return -1;
            }
        }
    }


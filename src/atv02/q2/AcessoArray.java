package atv02.q2;

import java.util.Scanner;

    public class AcessoArray {

        public static void executar(Scanner scanner) {
            System.out.println("\n--- Questao 2: Acesso Seguro a um Array ---");

            String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};

            try {
                System.out.print("Digite a posicao desejada (0 a 4): ");
                int posicao = Integer.parseInt(scanner.nextLine());

                String nome = nomes[posicao];
                System.out.println("Nome encontrado: " + nome);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posicao invalida! O vetor so possui " + nomes.length
                        + " posicoes (0 a " + (nomes.length - 1) + ").");
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas numeros inteiros.");
            }
        }
    }

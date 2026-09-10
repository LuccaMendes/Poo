package atv02.q4;

import java.util.Scanner;

    public class MultiplosCatches {

        public static void executar(Scanner scanner) {
            System.out.println("\n--- Questao 4: Multiplos Catches ---");

            try {
                System.out.print("Digite o primeiro numero: ");
                int numero1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite o segundo numero: ");
                int numero2 = Integer.parseInt(scanner.nextLine());

                int resultado = numero1 / numero2;
                System.out.println("Resultado da divisao: " + resultado);

            } catch (NumberFormatException e) {
                System.out.println("Erro: um dos valores digitados nao e um numero valido.");
            } catch (ArithmeticException e) {
                System.out.println("Erro: nao e possivel dividir por zero.");
            }
        }
    }


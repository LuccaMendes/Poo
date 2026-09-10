package atv02.q1;

import java.util.Scanner;

    public class DivisaoSegura {

        public static void executar(Scanner scanner) {
            System.out.println("\n--- Questao 1: Divisao Segura ---");

            try {
                System.out.print("Digite o dividendo: ");
                int dividendo = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite o divisor: ");
                int divisor = Integer.parseInt(scanner.nextLine());

                int resultado = dividendo / divisor;
                System.out.println("Resultado: " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("Nao e possivel dividir por zero.");
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas numeros inteiros.");
            }
        }
    }

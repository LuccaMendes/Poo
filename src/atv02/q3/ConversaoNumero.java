package atv02.q3;

import java.util.Scanner;

    public class ConversaoNumero {

        public static void executar(Scanner scanner) {
            System.out.println("\n--- Questao 3: Conversao de Texto para Numero ---");

            try {
                System.out.print("Digite sua idade: ");
                String texto = scanner.nextLine();

                int idade = Integer.parseInt(texto);
                System.out.println("Idade cadastrada com sucesso: " + idade + " anos.");

            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida! Digite apenas numeros.");
            }
        }
    }


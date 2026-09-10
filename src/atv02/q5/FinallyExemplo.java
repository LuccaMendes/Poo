package atv02.q5;

import java.util.Scanner;

    public class FinallyExemplo {

        public static void executar(Scanner scanner) {
            System.out.println("\n--- Questao 5: Garantindo a Execucao com finally ---");
            System.out.println("Abrindo arquivo...");

            try {
                System.out.print("Digite um numero (simulando dado lido do arquivo): ");
                String texto = scanner.nextLine();

                int numero = Integer.parseInt(texto);
                System.out.println("Numero lido com sucesso: " + numero);

            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter o dado do arquivo para numero.");

            } finally {
                System.out.println("Arquivo fechado.");
            }
        }
    }


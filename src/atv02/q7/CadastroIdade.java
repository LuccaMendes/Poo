package atv02.q7;

import java.util.Scanner;

    public class CadastroIdade {

        public static void cadastrarIdade(int idade) throws IdadeInvalidaException {
            if (idade < 0 || idade > 120) {
                throw new IdadeInvalidaException("Idade invalida! O valor deve estar entre 0 e 120.");
            }
            System.out.println("Idade cadastrada com sucesso: " + idade + " anos.");
        }

        public static void executar(Scanner scanner) {
            System.out.println("\n--- Questao 7: Excecao Personalizada - Idade Invalida ---");

            try {
                System.out.print("Digite a idade: ");
                int idade = Integer.parseInt(scanner.nextLine());

                cadastrarIdade(idade);

            } catch (IdadeInvalidaException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas numeros inteiros.");
            }
        }
    }

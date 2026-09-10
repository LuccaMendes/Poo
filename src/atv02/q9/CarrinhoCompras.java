package atv02.q9;

import java.util.Scanner;

    public class CarrinhoCompras {

        public static void adicionarItem(String nome, int quantidade, double preco)
                throws QuantidadeInvalidaException, PrecoInvalidoException {

            if (quantidade <= 0) {
                throw new QuantidadeInvalidaException("Quantidade invalida! Deve ser maior que zero.");
            }

            if (preco < 0) {
                throw new PrecoInvalidoException("Preco invalido! Nao pode ser negativo.");
            }

            System.out.println("Item adicionado: " + quantidade + "x " + nome + " - R$ " + preco + " cada.");
        }

        public static void executar(Scanner scanner) {
            System.out.println("\n--- Questao 9: Validando um Carrinho de Compras ---");

            try {
                System.out.print("Digite o nome do item: ");
                String nome = scanner.nextLine();

                System.out.print("Digite a quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite o preco: ");
                double preco = Double.parseDouble(scanner.nextLine());

                adicionarItem(nome, quantidade, preco);

            } catch (QuantidadeInvalidaException | PrecoInvalidoException e) {
                System.out.println("Erro ao adicionar item: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Digite valores numericos validos para quantidade e preco.");
            }
        }
    }
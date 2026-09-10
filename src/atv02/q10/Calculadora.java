package atv02.q10;

import java.util.Scanner;

    public class Calculadora {

        public static double dividir(double a, double b) throws DivisaoPorZeroException {
            if (b == 0) {
                throw new DivisaoPorZeroException("Nao e possivel dividir por zero.");
            }
            return a / b;
        }

        public static void executar(Scanner scanner) {
            System.out.println("\n--- Questao 10: Calculadora com Menu ---");

            int opcao;

            do {
                System.out.println();
                System.out.println("1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("5 - Sair da calculadora");
                System.out.print("Escolha uma opcao: ");

                opcao = -1;

                try {
                    opcao = Integer.parseInt(scanner.nextLine());

                    if (opcao == 5) {
                        System.out.println("Saindo da calculadora...");
                        continue;
                    }

                    if (opcao < 1 || opcao > 5) {
                        System.out.println("Opcao de menu invalida! Escolha um valor entre 1 e 5.");
                        continue;
                    }

                    System.out.print("Digite o primeiro numero: ");
                    double numero1 = Double.parseDouble(scanner.nextLine());

                    System.out.print("Digite o segundo numero: ");
                    double numero2 = Double.parseDouble(scanner.nextLine());

                    double resultado;

                    switch (opcao) {
                        case 1:
                            resultado = numero1 + numero2;
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 2:
                            resultado = numero1 - numero2;
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 3:
                            resultado = numero1 * numero2;
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 4:
                            resultado = dividir(numero1, numero2);
                            System.out.println("Resultado: " + resultado);
                            break;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Entrada invalida! Digite apenas numeros.");
                } catch (DivisaoPorZeroException e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("Operacao concluida.");
                }

            } while (opcao != 5);
        }
    }

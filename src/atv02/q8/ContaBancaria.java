package atv02.q8;

import java.util.Scanner;

    public class ContaBancaria {

        private double saldo;

        public ContaBancaria(double saldoInicial) {
            this.saldo = saldoInicial;
        }

        public double getSaldo() {
            return saldo;
        }

        public void sacar(double valor) throws SaldoInsuficienteException {
            if (valor > saldo) {
                throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
            }
            saldo -= valor;
        }

        public static void executar(Scanner scanner) {
            System.out.println("\n--- Questao 8: Excecao Personalizada - Saldo Insuficiente ---");

            ContaBancaria conta = new ContaBancaria(1000.0);
            System.out.println("Saldo inicial: R$ " + conta.getSaldo());

            try {
                System.out.print("Digite o valor do saque: ");
                double valor = Double.parseDouble(scanner.nextLine());

                conta.sacar(valor);
                System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + conta.getSaldo());

            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage() + " Saldo atual: R$ " + conta.getSaldo());
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas numeros.");
            }
        }
    }

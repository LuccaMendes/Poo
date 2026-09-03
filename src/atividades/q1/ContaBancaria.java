package atividades.q1;

    public class ContaBancaria {

        protected String cliente;
        protected String agencia;
        protected String conta;
        protected double saldo;

        public ContaBancaria(String cliente, String agencia, String conta, double saldo) {
            this.cliente = cliente;
            this.agencia = agencia;
            this.conta = conta;
            this.saldo = saldo;
        }

        // Verifica se o valor é válido e soma ao saldo atual
        public void depositar(double valor) {
            if (valor <= 0) {
                System.out.println("Valor de depósito inválido!");
                return;
            }
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        }

        // Valida se o valor do saque não é maior que o saldo
        public void sacar(double valor) {
            if (valor <= 0) {
                System.out.println("Valor de saque inválido!");
                return;
            }
            if (valor > saldo) {
                System.out.println("Saldo insuficiente para realizar o saque!");
                return;
            }
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        }

        public double getSaldo() {
            return saldo;
        }

        public String getCliente() {
            return cliente;
        }
    }

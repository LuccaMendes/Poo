package q1;

    public class ContaCorrente extends ContaBancaria {

        private double chequeEspecial;

        public ContaCorrente(String cliente, String agencia, String conta, double saldo, double chequeEspecial) {
            super(cliente, agencia, conta, saldo);
            this.chequeEspecial = chequeEspecial;
        }

        // Sobrescreve o saque para considerar o limite do cheque especial
        @Override
        public void sacar(double valor) {
            if (valor <= 0) {
                System.out.println("Valor de saque inválido!");
                return;
            }

            double saldoDisponivel = saldo + chequeEspecial;

            if (valor > saldoDisponivel) {
                System.out.println("Saldo insuficiente, mesmo utilizando o cheque especial!");
                return;
            }

            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        }

        public double getChequeEspecial() {
            return chequeEspecial;
        }
    }

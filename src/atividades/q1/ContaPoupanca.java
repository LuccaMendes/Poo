package atividades.q1;

public class ContaPoupanca extends ContaBancaria {

        private double taxaRendimento; // percentual, ex: 0.5 para 0,5%

        public ContaPoupanca(String cliente, String agencia, String conta, double saldo, double taxaRendimento) {
            super(cliente, agencia, conta, saldo);
            this.taxaRendimento = taxaRendimento;
        }

        // Incrementa o saldo com base no percentual configurado
        public void aplicarRendimento() {
            double rendimento = saldo * 0.01;
            saldo = saldo + rendimento;
            System.out.println("Rendimento de R$ " + rendimento + " aplicado. Saldo atual: R$ " + saldo);
        }

        public double getTaxaRendimento() {
            return taxaRendimento;
        }
    }

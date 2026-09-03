package atividades.q3;

    public class Gerente extends Funcionario {

        public Gerente(String nome, String cpf, double salarioBase, double totalDeVendasLoja) {
            // aliquotaBonus do gerente é fixa em 0,5%
            super(nome, cpf, salarioBase, 0.5, totalDeVendasLoja);
        }

        // Retorna 0,5% do total de vendas da loja + salário
        @Override
        public double calcularSalario() {
            double bonus = totalVendas * (aliquotaBonus / 100);
            return salarioBase + bonus;
        }
    }

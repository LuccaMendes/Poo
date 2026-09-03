package atividades.q3;

    public class Vendedor extends Funcionario {

        public Vendedor(String nome, String cpf, double salarioBase, double totalDeVendasIndividual) {
            // aliquotaBonus do vendedor é fixa em 1%
            super(nome, cpf, salarioBase, 1.0, totalDeVendasIndividual);
        }

        // Retorna 1% do total de vendas individual + salário
        @Override
        public double calcularSalario() {
            double bonus = totalVendas * (aliquotaBonus / 100);
            return salarioBase + bonus;
        }
    }

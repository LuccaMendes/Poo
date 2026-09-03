package atividades.q3;

    public class Funcionario {

        protected String nome;
        protected String cpf;
        protected double salarioBase;
        protected double aliquotaBonus;  // percentual, ex: 2 para 2%
        protected double totalVendas;

        public Funcionario(String nome, String cpf, double salarioBase, double aliquotaBonus, double totalVendas) {
            this.nome = nome;
            this.cpf = cpf;
            this.salarioBase = salarioBase;
            this.aliquotaBonus = aliquotaBonus;
            this.totalVendas = totalVendas;
        }

        // Retorna o salário + bônus (regra genérica, usando a aliquotaBonus do funcionário)
        public double calcularSalario() {
            double bonus = totalVendas * (aliquotaBonus / 100);
            return salarioBase + bonus;
        }

        public String getNome() {
            return nome;
        }
    }

package atividades.q3;

    public class App {
        public static void main(String[] args) {

            Gerente gerente = new Gerente("Carlos", "111.111.111-11", 5000.0, 40000.0);
            System.out.println("Salário do gerente Carlos: R$ " + gerente.calcularSalario());
            // 5000 + 0,5% de 40000 (200) = 5200.0

            Vendedor vendedor = new Vendedor("Fernanda", "222.222.222-22", 2000.0, 15000.0);
            System.out.println("Salário da vendedora Fernanda: R$ " + vendedor.calcularSalario());
            // 2000 + 1% de 15000 (150) = 2150.0
        }
    }
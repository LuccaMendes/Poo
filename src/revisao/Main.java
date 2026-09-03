package revisao;

public class Main {
    static void main() {

        Orcamento orcamento1 = new Orcamento(4.5, 500);
        Orcamento orcamento2 = new Orcamento(2.5, 300);

        OrcamentoICMS icms = new OrcamentoICMS(orcamento1);
        OrcamentoIPI ipi = new OrcamentoIPI(orcamento2);

        System.out.println("ICMS: " + icms.calcularICMS());
        System.out.println("IPI: " + ipi.calcularIPI());
    }
}

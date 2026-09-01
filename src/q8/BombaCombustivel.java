package q8;

public class BombaCombustivel {

    private String tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeCombustivelNaBomba;

    public BombaCombustivel(String tipoCombustivel, double valorPorLitro, double quantidadeCombustivelNaBomba) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivelNaBomba = quantidadeCombustivelNaBomba;
    }

    // Calcula quantos litros o valor em dinheiro compra, reduz do estoque e exibe
    public void abastecerPorValor(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para abastecimento!");
            return;
        }

        double litros = valor / valorPorLitro;

        if (litros > quantidadeCombustivelNaBomba) {
            System.out.println("Estoque insuficiente na bomba para esse valor!");
            return;
        }

        quantidadeCombustivelNaBomba -= litros;
        System.out.println("Abastecimento de " + tipoCombustivel + ": " + litros + " litros colocados.");
    }

    // Calcula o valor a pagar pela quantidade de litros, reduz do estoque e exibe
    public void abastecerPorLitro(double litros) {
        if (litros <= 0) {
            System.out.println("Quantidade de litros inválida!");
            return;
        }

        if (litros > quantidadeCombustivelNaBomba) {
            System.out.println("Estoque insuficiente na bomba para essa quantidade!");
            return;
        }

        double total = litros * valorPorLitro;
        quantidadeCombustivelNaBomba -= litros;
        System.out.println("Abastecimento de " + tipoCombustivel + ": total a pagar R$ " + total);
    }
}


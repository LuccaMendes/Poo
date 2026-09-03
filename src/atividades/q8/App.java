package atividades.q8;

public class App {
    public static void main(String[] args) {

        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.79, 500);

        bomba.abastecerPorValor(100);   // ~17,27 litros
        bomba.abastecerPorLitro(20);    // 20 litros -> R$ 115,80
        bomba.abastecerPorLitro(10000); // deve falhar, estoque insuficiente
    }
}


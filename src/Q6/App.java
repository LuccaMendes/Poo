package Q6;

public class App {
    public static void main(String[] args) {

        Encomenda encomenda = new Encomenda(10, 100, 500);

        System.out.println("Frete padrão: R$ " + encomenda.calcularFretePadrao());
        // 10*5 + 100*0.5 = 50 + 50 = 100.0

        System.out.println("Frete expresso: R$ " + encomenda.calcularFreteExpresso());
        // 100 + 30 + 1% de 500 (5) = 135.0
    }
}

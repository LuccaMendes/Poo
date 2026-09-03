package atividades.q9;

public class App {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Mariana", "mariana@email.com");
        Produto produto = new Produto("Teclado Mecânico", 250.0);

        Pedido pedido = new Pedido(cliente, produto, 2); // total = 500.0

        pedido.processarPagamento(400);  // insuficiente
        pedido.processarPagamento(550);  // paga com troco de 50
    }
}

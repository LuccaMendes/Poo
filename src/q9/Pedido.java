package q9;

public class Pedido {

    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private boolean pago;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.pago = false;
    }

    // Calcula o total, verifica o pagamento e exibe o troco
    public void processarPagamento(double valorRecebido) {
        double total = produto.getPreco() * quantidade;

        if (valorRecebido < total) {
            System.out.println("Valor recebido insuficiente! Faltam R$ " + (total - valorRecebido));
            return;
        }

        pago = true;
        double troco = valorRecebido - total;

        System.out.println("Pagamento do pedido de " + cliente.getNome() + " efetuado com sucesso!");
        System.out.println("Total da compra: R$ " + total);
        if (troco > 0) {
            System.out.println("Troco: R$ " + troco);
        } else {
            System.out.println("Sem troco.");
        }
    }

    public boolean isPago() {
        return pago;
    }
}


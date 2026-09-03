package revisao;

import java.util.Objects;

public class AppArray {

    static void main() {

        Produto [] produtos = {
                new Produto("Coca-Cola", 5.00),
                new Produto("Shampoo", 15.00),
                new Produto("Biscoito", 8.00),
        };

        Produto produtoMaisCaro = new Produto();

        for(Produto p : produtos) {
            if(Objects.isNull(produtoMaisCaro.getPreco())) {
                produtoMaisCaro = p;
            }else if(p.getPreco() > produtoMaisCaro.getPreco()) {
                produtoMaisCaro = p;
            }
        }

        System.out.println(produtoMaisCaro.toString());
    }
}

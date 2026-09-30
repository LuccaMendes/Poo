package colecoes;

import java.util.List;

public class ExemplosList {

    static void main() {

        List<Produto> listaProdutos =
                List.of(
                        new Produto("Arroz", 5, 10),
                        new Produto("Arroz", 7, 6),
                        new Produto("Café", 4, 2));

        System.out.println(listaProdutos);
        listaProdutos.add(new Produto("Farinha", 40, 4)); //lista imultavel, não edita.
    }




}
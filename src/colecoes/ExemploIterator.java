package colecoes;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterator {

    static void main() {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Arroz", 4.5, 5));
        produtos.add(new Produto("Açucar", 8, 0));
        produtos.add(new Produto("Café", 17.2, 2));
        produtos.add(new Produto("Feijão", 4.5, 0));

//        System.out.println("Estoque: " +produtos);
//        for(Produto p : produtos){    //não permite rodar produtos.remove
//            if(p.getEstoque() == 0){
//                produtos.remove(p);
//            }
//        }

        System.out.println("Estoque: " +produtos);

        Iterator<Produto> produtoIterator = produtos.iterator();
        while (produtoIterator.hasNext()){

            Produto produto = produtoIterator.next();
            if(produto.getEstoque() == 0){
                produtoIterator.remove();
            }
        }
        System.out.println("-------------------------");
        System.out.println("Estoque: " +produtos);



    }
}
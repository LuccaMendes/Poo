package colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploScannerList {

    static void main(){

        List<Produto> produtos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String menu = """
                1 - Adicionar
                2 - Remover
                3 - Ver
                4 - Sair
                
                """;


        int opcao = 0;

        while (true){
            System.out.println(menu);

            System.out.print("Digite uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 4){
                break;
            }

            if(opcao == 1){
                System.out.print("Digite a descricao do produto: ");
                String descricao = sc.nextLine();
                System.out.print("Digite o preco: ");
                double preco = sc.nextDouble();
                System.out.print("Digite o estoque: ");
                int estoque = sc.nextInt();
                produtos.add(new Produto(descricao, preco, estoque));

            } else if (opcao == 2) {
                sc.nextInt();
                System.out.print("Digite a descricao para remover o produto :");
                String descricao = sc.nextLine();
                produtos.removeIf(p -> p.getDescricao().equalsIgnoreCase(descricao));

            } else if (opcao == 3) {
                produtos.forEach( p-> System.out.println(p));
            }

        }
    }





}
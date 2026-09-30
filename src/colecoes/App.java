package colecoes;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    static void main() {
//        List<String> nomes = new ArrayList<>();  //coleçoes com atributos simples (tipo primitivos)
//        nomes.add("Jose");
//        nomes.add("Rose");
//        nomes.add("Maria");
//        nomes.add("Rose");
//        //nomes.forEach(n -> System.out.println(n));
//
//        nomes.set(1, "Nome alterado"); //alterar string da lista por String/nome
//
//        nomes.forEach(n -> System.out.println(n));
//
//        nomes.remove(2); //remover string da lista por indice
//
//        Collections.sort(nomes); //ordenar em ordem alfabetica.
//
//        List<Integer> idades = new ArrayList<>(); //coleçoes com atributos simples (tipo primitivos)
//        idades.add(50);
//        idades.add(20);
//        idades.add(35);
//
//        Collections.sort(idades); //ordenar em ordem crescente os numeros.
//
//
//        idades.forEach(i -> System.out.println(i)); //imprime a quantidade de itens de uma lista.
//
//        System.out.println("Total de elementos: " +idades.size()); //pega a quantidade de elementos que tem no array.
//
//        idades.clear(); //limpa todos os elementos da lista e fica limpa.
//
//
//        nomes.forEach(n -> System.out.println(n)); //imprime a quantidade de itens de uma lista.



        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Jose", "123", 'M', 30));
        pessoas.add(new Pessoa("Maria", "456", 'F', 38));
        pessoas.add(new Pessoa("Rose", "789", 'F', 50));
        pessoas.add(new Pessoa("Rose", "789", 'F', 50));


        pessoas.forEach(p -> System.out.println(p));

    }

}
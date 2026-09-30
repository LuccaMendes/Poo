package colecoes;

import java.util.*;

public class ExemploSet {
    static void main() {

        Set<String> veiculos = new HashSet<>();
        veiculos.add("BMW");
        veiculos.add("Ferrari");
        veiculos.add("Lamborghini");
        veiculos.add("Porsche");
        veiculos.add("Porsche");
        veiculos.forEach(v -> System.out.println(v));

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(new Pessoa("José", "123", 19, 'M'));
        pessoas.add(new Pessoa("Maria", "456", 18, 'F'));
        pessoas.add(new Pessoa("Lucca", "789", 20, 'M'));
        pessoas.add(new Pessoa("Eloah", "135", 21, 'F'));
        pessoas.add(new Pessoa("Lucca", "789", 20, 'M'));
//        pessoas.forEach(p -> System.out.println(p));
//        System.out.println(pessoas.contains("123"));

        int contador = 1;
        for(Pessoa p : pessoas) {
            System.out.println("\n Pessoa " + contador + p.toString());
            contador++;
        }
        System.out.println("-------------------------------------------------------");

        Set<Pessoa> pessoasTreeSet = new TreeSet<>();
        pessoasTreeSet.add(new Pessoa("José", "123", 19, 'M'));
        pessoasTreeSet.add(new Pessoa("Maria", "456", 18, 'F'));
        pessoasTreeSet.add(new Pessoa("Lucca", "789", 20, 'M'));
        pessoasTreeSet.add(new Pessoa("Eloah", "135", 21, 'F'));
        pessoasTreeSet.add(new Pessoa("Lucca", "789", 20, 'M'));
        pessoasTreeSet.forEach(p -> System.out.println(p));

        Map<String, Pessoa> mapPessoa = new HashMap<>();
        mapPessoa.put("123", new Pessoa("Maria", "123", 19, 'M'));
        mapPessoa.entrySet().forEach(p -> System.out.println(p.getKey()));
    }
}

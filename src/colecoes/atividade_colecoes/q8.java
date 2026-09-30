package colecoes.atividade_colecoes;

import java.util.HashSet;
import java.util.Iterator;

public class q8 {
    public static void main() {
        HashSet<String> cidades = new HashSet<>();
        cidades.add("Recife");
        cidades.add("Natal");
        cidades.add("Salvador");
        cidades.add("Fortaleza");
        cidades.add("São Luís");

        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        // Remover dentro de um for-each lança ConcurrentModificationException,
        // por isso usamos um Iterator e o método iterator.remove().
        Iterator<String> it = cidades.iterator();
        while (it.hasNext()) {
            String cidade = it.next();
            if (cidade.startsWith("S")) {
                it.remove();
            }
        }

        System.out.println("Restantes: " + cidades);
    }
}

package colecoes.atividade_colecoes;

import java.util.Map;
import java.util.TreeMap;

public class q13 {
    public static void main() {
        TreeMap<String, Integer> idades = new TreeMap<>();
        idades.put("Rafael", 33);
        idades.put("Beatriz", 27);
        idades.put("Lucas", 19);
        idades.put("Amanda", 45);
        idades.put("Gustavo", 22);

        // TreeMap já mantém as chaves em ordem alfabética
        for (Map.Entry<String, Integer> par : idades.entrySet()) {
            System.out.println(par.getKey() + ": " + par.getValue());
        }

        System.out.println("Primeira: " + idades.firstKey() + " | Última: " + idades.lastKey());
    }
}

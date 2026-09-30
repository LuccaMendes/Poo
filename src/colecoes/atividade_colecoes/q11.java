package colecoes.atividade_colecoes;

import java.util.HashMap;
import java.util.Map;

public class q11 {
    public static void main() {
        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("João", 30);
        idades.put("Maria", 25);
        idades.put("Pedro", 41);

        for (Map.Entry<String, Integer> par : idades.entrySet()) {
            System.out.println(par.getKey() + " tem " + par.getValue() + " anos");
        }
    }
}

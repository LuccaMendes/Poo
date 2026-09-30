package colecoes.atividade_colecoes;

import java.util.HashMap;

public class q12 {
    public static void main() {
        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("João", 30);
        idades.put("Maria", 25);
        idades.put("Pedro", 41);

        System.out.println("João tem " + idades.get("João") + " anos");

        // get() retorna null quando a chave não existe.
        // Guardar esse retorno direto em um int causaria NullPointerException,
        // por isso verificamos antes com containsKey (ou usaríamos getOrDefault).
        if (idades.containsKey("Ana")) {
            System.out.println("Ana tem " + idades.get("Ana") + " anos");
        } else {
            System.out.println("Ana não está cadastrada");
        }
    }
}

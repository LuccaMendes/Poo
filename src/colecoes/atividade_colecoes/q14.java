package colecoes.atividade_colecoes;

import java.util.HashMap;
import java.util.Map;

public class q14 {
    public static void main() {
        HashMap<String, Pessoa> pessoas = new HashMap<>();
        pessoas.put("111.111.111-11", new Pessoa("Ana", 28, "111.111.111-11"));
        pessoas.put("222.222.222-22", new Pessoa("Bruno", 19, "222.222.222-22"));
        pessoas.put("333.333.333-33", new Pessoa("Carla", 35, "333.333.333-33"));

        for (Map.Entry<String, Pessoa> par : pessoas.entrySet()) {
            System.out.println(par.getValue());
        }

        Pessoa encontrada = pessoas.get("222.222.222-22");
        System.out.println("Busca: " + encontrada);

        // Inserindo uma nova pessoa com o MESMO CPF de Bruno.
        // put() substitui o valor antigo e retorna o valor que estava lá antes.
        Pessoa bruna = new Pessoa("Bruna", 20, "222.222.222-22");
        Pessoa valorAntigo = pessoas.put("222.222.222-22", bruna);

        System.out.println("Put retornou: " + valorAntigo);
        System.out.println("Tamanho do mapa: " + pessoas.size());
    }
}

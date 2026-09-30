package colecoes.atividade_colecoes;

import java.util.ArrayList;
import java.util.Comparator;

public class q6 {
    public static void main() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 28, "111.111.111-11"));
        pessoas.add(new Pessoa("Bruno", 19, "222.222.222-22"));
        pessoas.add(new Pessoa("Carla", 35, "333.333.333-33"));
        pessoas.add(new Pessoa("Diego", 22, "444.444.444-44"));

        // Ordena pela idade, crescente
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));
        System.out.println("Por idade:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println();

        // Ordena pelo nome, ordem alfabética
        pessoas.sort(Comparator.comparing(Pessoa::getNome));
        System.out.print("Por nome: ");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.print(pessoas.get(i).getNome());
            if (i < pessoas.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

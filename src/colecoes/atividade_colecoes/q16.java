package colecoes.atividade_colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class q16 {
    public static void main() {
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Ana", "Carla", "Bruno", "Diego");

        // LinkedHashSet remove duplicatas e preserva a ordem de inserção,
        // que é justamente a ordem da primeira ocorrência de cada nome.
        List<String> semDuplicatas = new ArrayList<>(new LinkedHashSet<>(nomes));

        System.out.println(semDuplicatas);
    }
}

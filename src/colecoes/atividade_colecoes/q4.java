package colecoes.atividade_colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class q4 {
    public static void main() {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(42);
        numeros.add(7);
        numeros.add(19);
        numeros.add(3);
        numeros.add(25);

        Collections.sort(numeros);
        System.out.println("Crescente:   " + numeros);

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Decrescente: " + numeros);
    }
}

package colecoes.atividade_colecoes;

import java.util.ArrayList;

public class q2 {
    public static void main() {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // remove(int) removeria pelo ÍNDICE.
        // Para remover pelo VALOR, é preciso passar um Integer (objeto),
        // por isso usamos Integer.valueOf(30).
        numeros.remove(Integer.valueOf(30));

        System.out.println(numeros);
    }
}

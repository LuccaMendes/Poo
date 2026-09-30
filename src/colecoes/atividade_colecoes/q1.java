package colecoes.atividade_colecoes;

import java.util.ArrayList;

public class q1 {
    public static void main() {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Laço for tradicional, usando size() e get(i)
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        System.out.println();

        // Mesma impressão, agora usando for-each
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

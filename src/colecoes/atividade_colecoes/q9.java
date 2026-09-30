package colecoes.atividade_colecoes;

import java.util.HashSet;

public class q9 {
    public static void main() {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        if (numeros.contains(15)) {
            System.out.println("15 está no conjunto");
        } else {
            System.out.println("15 não está no conjunto");
        }

        if (numeros.contains(18)) {
            System.out.println("18 está no conjunto");
        } else {
            System.out.println("18 não está no conjunto");
        }
    }
}

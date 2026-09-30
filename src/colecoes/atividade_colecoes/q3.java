package colecoes.atividade_colecoes;

import java.util.ArrayList;

public class q3 {
    public static void main() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");

        int indiceBanana = frutas.indexOf("banana");
        if (indiceBanana != -1) {
            System.out.println("'banana' encontrada no índice " + indiceBanana);
        } else {
            System.out.println("'banana' não foi encontrada na lista");
        }

        int indiceUva = frutas.indexOf("uva");
        if (indiceUva != -1) {
            System.out.println("'uva' encontrada no índice " + indiceUva);
        } else {
            System.out.println("'uva' não foi encontrada na lista");
        }
    }
}

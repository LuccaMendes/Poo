package colecoes.atividade_colecoes;

import java.util.HashMap;

public class q15 {
    public static void main() {
        HashMap<Integer, String> dias = new HashMap<>();
        dias.put(1, "Segunda-feira");
        dias.put(2, "Terça-feira");
        dias.put(3, "Quarta");
        dias.put(4, "Quinta-feira");
        dias.put(5, "Sexta-feira");

        System.out.println("Antes:  " + dias);

        // Corrige o valor da chave 3
        dias.replace(3, "Quarta-feira");
        System.out.println("Depois: " + dias);

        // replace() só atualiza uma chave que já existe no mapa.
        // Como a chave 6 não existe, nada é inserido.
        dias.replace(6, "Sábado");
        System.out.println("A chave 6 passou a existir? " + dias.containsKey(6));
    }
}

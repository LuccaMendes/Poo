package colecoes.atividade_colecoes;

import java.util.HashSet;

public class q7 {
    public static void main() {
        HashSet<Integer> conjunto = new HashSet<>();
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(10);
        conjunto.add(30);
        conjunto.add(40);

        System.out.println("Conjunto: " + conjunto);
        System.out.println("Tamanho: " + conjunto.size());

        // 10 já existe no conjunto, então add() retorna false
        boolean adicionou = conjunto.add(10);
        System.out.println("add(10) retornou: " + adicionou);
    }
}

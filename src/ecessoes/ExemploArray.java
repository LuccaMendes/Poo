package ecessoes;

public class ExemploArray {
    static void main() {
        try {
            String [] nomes = new String[] {"José", "Maria", "Pedro"};

            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice não existente, erro: " + e.getMessage());
        } finally {
            System.out.println("Sempre será executada!");
        }
    }
}

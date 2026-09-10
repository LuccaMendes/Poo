package atv02.q6;

    public class ReferenciaNula {

        public static void executar() {
            System.out.println("\n--- Questao 6: Investigando uma Referencia Nula ---");

            String texto = null; // A variavel nao foi inicializada com um objeto (aponta para "nada")

            try {
                // Como 'texto' e null, chamar um metodo nela (.length()) lanca uma
                // NullPointerException, pois nao existe nenhum objeto na memoria
                // para o qual o metodo possa ser executado.
                int tamanho = texto.length();
                System.out.println("Tamanho do texto: " + tamanho);

            } catch (NullPointerException e) {
                System.out.println("Erro: o valor nao foi definido (esta nulo).");
            }
        }
    }


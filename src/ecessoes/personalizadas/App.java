package ecessoes.personalizadas;

public class App {
    static void main() {

        Cadastro c = new Cadastro();

        try {
            c.cadastrar("Lucca", "09876545395");
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

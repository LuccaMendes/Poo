package revisao;

public class App {
    static void main() {

//        Personagem p1 = new Personagem();
//        p1.setNome("José");
//        p1.setVida(10);
//
//        Personagem p2 = new Personagem("Lucca", 50);
//
//        System.out.println(p1);
//        p1.trocarArma();
//        p1.atacar();
//        System.out.println(p2);
//        p2.trocarArma();
//        p2.atacar();

        try {
            Personagem guerreiro = new Guerreiro("Pedro", 100, true);
            Personagem bruxo = new Bruxo("Ronaldinho", 50, true);


            System.out.println(guerreiro);
            guerreiro.atacar();
            System.out.println(bruxo);
            bruxo.atacar();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

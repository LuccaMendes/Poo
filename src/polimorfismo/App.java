package polimorfismo;

public class App {
    static void main() {

        Gato g = new Gato();
        g.emitirSom();
        g.comer();

        Cachorro c = new Cachorro();
        c.emitirSom();
        c.comer();
    }
}

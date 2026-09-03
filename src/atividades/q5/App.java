package atividades.q5;

public class App {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Rex", 3);
        Animal gato = new Gato("Mimi", 2);

        cachorro.emitirSom();
        cachorro.mover();

        gato.emitirSom();
        gato.mover();
    }
}


package q5;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + ": Au Au!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está correndo atrás da bola.");
    }
}

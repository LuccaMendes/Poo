package q5;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + ": Miau!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está andando no telhado.");
    }
}


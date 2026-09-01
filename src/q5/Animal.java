package q5;

public class Animal {

    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println(nome + " emite um som genérico.");
    }

    public void mover() {
        System.out.println(nome + " está se movendo.");
    }
}

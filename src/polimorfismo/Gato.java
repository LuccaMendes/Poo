package polimorfismo;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void comer() {
        System.out.println("Come ração!");
    }
}

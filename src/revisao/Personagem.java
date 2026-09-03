package revisao;

public class Personagem {
    private String nome;
    private int vida;

    public Personagem(){}
    public Personagem(String nome, int vida) {
        if (nome.length() < 3){
            throw new RuntimeException("O nome deve possuir pelo menos 3 letras!");
        }
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar(){

    }
    public void trocarArma(){
        System.out.println(nome + " trocando de arma...");
    }

    @Override
    public String toString() {
        return "Personagem" +
                "\n Nome: " + nome +
                "\n Vida: " + vida ;
    }
}

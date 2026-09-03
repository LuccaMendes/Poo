package atividades.q7;

public class LampadaInteligente {

    private boolean ligada;
    private int intensidade; // 0 a 100
    private String cor;

    public LampadaInteligente(String cor) {
        this.ligada = false;
        this.intensidade = 0;
        this.cor = cor;
    }

    public void ligar() {
        ligada = true;
        System.out.println("Lâmpada ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Lâmpada desligada.");
    }

    // Só altera a intensidade se a lâmpada estiver ligada
    public void ajustarIntensidade(int valor) {
        if (!ligada) {
            System.out.println("Não é possível ajustar a intensidade: lâmpada está desligada!");
            return;
        }
        if (valor < 0 || valor > 100) {
            System.out.println("Valor de intensidade inválido! Use um valor entre 0 e 100.");
            return;
        }
        intensidade = valor;
        System.out.println("Intensidade ajustada para " + intensidade + ".");
    }

    // Só altera a cor se a lâmpada estiver ligada
    public void mudarCor(String novaCor) {
        if (!ligada) {
            System.out.println("Não é possível mudar a cor: lâmpada está desligada!");
            return;
        }
        cor = novaCor;
        System.out.println("Cor alterada para " + cor + ".");
    }
}


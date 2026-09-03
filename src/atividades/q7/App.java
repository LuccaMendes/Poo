package atividades.q7;

public class App {
    public static void main(String[] args) {

        LampadaInteligente lampada = new LampadaInteligente("branca");

        lampada.ajustarIntensidade(50); // deve falhar, está desligada
        lampada.mudarCor("azul");       // deve falhar, está desligada

        lampada.ligar();
        lampada.ajustarIntensidade(80);
        lampada.mudarCor("azul");
        lampada.ajustarIntensidade(150); // valor inválido

        lampada.desligar();
    }
}


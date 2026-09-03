package atividades.q4;

public class Carro {

    private String modelo;
    private String placa;
    private boolean ligado;
    private Motorista motorista; // referência para um objeto Motorista

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.ligado = false;
        this.motorista = null;
    }

    // Vincula um motorista ao carro
    public void atribuirMotorista(Motorista motorista) {
        this.motorista = motorista;
        System.out.println("Motorista " + motorista.getNome() + " atribuído ao carro " + modelo + ".");
    }

    // Só liga o carro se houver um motorista atribuído
    public void ligar() {
        if (motorista == null) {
            System.out.println("Não é possível ligar o carro: nenhum motorista atribuído!");
            return;
        }
        ligado = true;
        System.out.println("Carro " + modelo + " ligado por " + motorista.getNome() + ".");
    }

    public boolean isLigado() {
        return ligado;
    }
}

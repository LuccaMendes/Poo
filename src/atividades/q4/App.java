package atividades.q4;

public class App {
    public static void main(String[] args) {

        Carro carro = new Carro("Fiat Strada", "ABC-1234");
        carro.ligar(); // deve falhar, sem motorista

        Motorista motorista = new Motorista("João", "ABC-5678");
        carro.atribuirMotorista(motorista);
        carro.ligar(); // agora deve funcionar
    }
}


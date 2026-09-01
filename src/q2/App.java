package q2;


    public class App {
        public static void main(String[] args) {

            Termostato termostato = new Termostato(25, 22, "Resfriar");
            termostato.executarCiclo();   // atual 25 > desejada 22 -> aciona resfriamento

            termostato.setTemperaturaAtual(20);
            termostato.executarCiclo();   // já atingiu a meta

            termostato.alterarModo("Aquecer");
            termostato.definirTemperatura(35); // acima do limite, ajusta para 30
            termostato.executarCiclo();   // atual 20 < desejada 30 -> aciona aquecimento

            termostato.alterarModo("Desligado");
            termostato.executarCiclo();
        }
    }

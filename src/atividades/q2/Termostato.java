package atividades.q2;

    public class Termostato {

        private double temperaturaAtual;
        private double temperaturaDesejada;
        private String modo; // "Resfriar", "Aquecer" ou "Desligado"

        public Termostato(double temperaturaAtual, double temperaturaDesejada, String modo) {
            this.temperaturaAtual = temperaturaAtual;
            this.modo = modo;
            definirTemperatura(temperaturaDesejada);
        }

        // Garante que a temperatura desejada fique entre 16 e 30 graus
        public void definirTemperatura(double temp) {
            if (temp < 16) {
                temperaturaDesejada = 16;
                System.out.println("Valor abaixo do permitido. Temperatura ajustada para 16°C.");
            } else if (temp > 30) {
                temperaturaDesejada = 30;
                System.out.println("Valor acima do permitido. Temperatura ajustada para 30°C.");
            } else {
                temperaturaDesejada = temp;
                System.out.println("Temperatura desejada definida para " + temp + "°C.");
            }
        }

        public void alterarModo(String novoModo) {
            modo = novoModo;
            System.out.println("Modo alterado para: " + modo);
        }

        // Analisa o modo e as temperaturas para informar a ação do sistema
        public void executarCiclo() {
            if (modo.equals("Desligado")) {
                System.out.println("Sistema desligado. Nenhuma ação realizada.");
            } else if (modo.equals("Resfriar")) {
                if (temperaturaAtual > temperaturaDesejada) {
                    System.out.println("Compressor acionado para RESFRIAR o ambiente.");
                } else {
                    System.out.println("Ambiente já atingiu a temperatura desejada.");
                }
            } else if (modo.equals("Aquecer")) {
                if (temperaturaAtual < temperaturaDesejada) {
                    System.out.println("Compressor acionado para AQUECER o ambiente.");
                } else {
                    System.out.println("Ambiente já atingiu a temperatura desejada.");
                }
            } else {
                System.out.println("Modo inválido!");
            }
        }

        public void setTemperaturaAtual(double temperaturaAtual) {
            this.temperaturaAtual = temperaturaAtual;
        }

        public double getTemperaturaAtual() {
            return temperaturaAtual;
        }

        public double getTemperaturaDesejada() {
            return temperaturaDesejada;
        }

        public String getModo() {
            return modo;
        }
    }

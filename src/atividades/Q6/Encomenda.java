package atividades.Q6;

    public class Encomenda {

        private double pesoKg;
        private double distanciaKm;
        private double valorDeclarado;

        public Encomenda(double pesoKg, double distanciaKm, double valorDeclarado) {
            this.pesoKg = pesoKg;
            this.distanciaKm = distanciaKm;
            this.valorDeclarado = valorDeclarado;
        }

        // R$ 5,00 por kg + R$ 0,50 por km rodado
        public double calcularFretePadrao() {
            return (pesoKg * 5.00) + (distanciaKm * 0.50);
        }

        // Frete padrão + taxa fixa de R$ 30,00 + 1% do valor declarado
        public double calcularFreteExpresso() {
            return calcularFretePadrao() + 30.00 + (valorDeclarado * 0.01);
        }
    }


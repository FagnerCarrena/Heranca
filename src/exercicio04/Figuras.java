package exercicio04;


    class Figura {
        public double calcularArea() {

            return 0.0;
        }
    }

     class Circulo extends Figura {
        private double raio;

        public Circulo(double raio) {
            this.raio = raio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * raio * raio;
        }
    }

     class Retangulo extends Figura {
        private double comprimento;
        private double largura;

        public Retangulo(double comprimento, double largura) {
            this.comprimento = comprimento;
            this.largura = largura;
        }

        @Override
        public double calcularArea() {
            return comprimento * largura;
        }
    }



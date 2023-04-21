package Restaurant.Model;

public class Mesa {
        private final int numero;
        private final int capacidad;
        private boolean ocupada;

        public Mesa(int numero, int capacidad) {
            this.numero = numero;
            this.capacidad = capacidad;
            this.ocupada = false;
        }

        public int getNumero() {
            return numero;
        }

        public int getCapacidad() {
            return capacidad;
        }

        public boolean estaOcupada() {
            return ocupada;
        }

        public void ocupar() {
            ocupada = true;
        }

        public void liberar() {
            ocupada = false;
        }

        public double calcularTotal(double precioPlato) {
            return capacidad * precioPlato;
        }
    }



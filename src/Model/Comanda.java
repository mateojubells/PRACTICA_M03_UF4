package Model;

import java.util.ArrayList;

public class  Comanda {
    private ArrayList<Plato> platos;
    private ArrayList<Bebida> bebidas;

    public Comanda() {
        platos = new ArrayList<Plato>();
        bebidas = new ArrayList<Bebida>();
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void agregarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public double calcularTotal() {
        double total = 0;
        for (Plato plato : platos) {
            total += plato.getPrecio();
        }
        for (Bebida bebida : bebidas) {
            total += bebida.getPrecio();
        }
        return total;
    }
}

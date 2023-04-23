package Restaurant.Model;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Plato> platos;
    private ArrayList<Bebida> bebidas;

    public Menu(ArrayList<Plato> platos, ArrayList<Bebida> bebidas) {
        this.platos = platos;
        this.bebidas = bebidas;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void agregarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public void eliminarPlato(Plato plato) {
        platos.remove(plato);
    }

    public void eliminarBebida(Bebida bebida) {
        bebidas.remove(bebida);
    }

    public void mostrarPlatos () {
        for (Plato plato: platos) {
            System.out.println("Plato #" + plato.getId() + ": \t" + plato.getNombre());
        }
    }

    public void mostrarBebidas () {
        for (Bebida bebida: bebidas) {
            System.out.println("Bebida #" + bebida.getId() + ": \t" + bebida.getNombre());
        }
    }
}

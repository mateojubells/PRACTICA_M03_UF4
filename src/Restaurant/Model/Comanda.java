package Restaurant.Model;

import java.util.ArrayList;

public class  Comanda {

    private int idComanda;
    private ArrayList<Plato> platos;
    private ArrayList<Bebida> bebidas;
    private Enum<EstadoComanda> preparado;

    public Comanda() {
        platos = new ArrayList<Plato>();
        bebidas = new ArrayList<Bebida>();
    }

    public Comanda(int idComanda, ArrayList<Plato> platos, ArrayList<Bebida> bebidas, Enum<EstadoComanda> preparado) {
        this.idComanda = idComanda;
        this.platos = platos;
        this.bebidas = bebidas;
        this.preparado = preparado;
    }

    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public Enum<EstadoComanda> isPreparado() {
        return preparado;
    }

    public void setPreparado(Enum<EstadoComanda> preparado) {
        this.preparado = preparado;
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

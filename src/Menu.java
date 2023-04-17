import java.util.List;

public class Menu {
    private List<Plato> platos;
    private List<Bebida> bebidas;

    public Menu(List<Plato> platos, List<Bebida> bebidas) {
        this.platos = platos;
        this.bebidas = bebidas;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public List<Bebida> getBebidas() {
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
}

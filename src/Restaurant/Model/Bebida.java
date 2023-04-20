package Restaurant.Model;

public class Bebida extends Articulo{
    private double centilitros;

    public Bebida(String nombre, String descripcion, double precio, double centilitros) {
        super(nombre, descripcion, precio);
        this.centilitros = centilitros;
    }

    public double getCentilitros() {
        return centilitros;
    }

    public void setCentilitros(double centilitros) {
        this.centilitros = centilitros;
    }
}

package Restaurant.Model;

public class Bebida extends Articulo{
    private double centilitros;

    public Bebida(int id, String nombre, String descripcion, float precio, double centilitros) {
        super(id, nombre, descripcion, precio);
        this.centilitros = centilitros;
    }

    public double getCentilitros() {
        return centilitros;
    }

    public void setCentilitros(double centilitros) {
        this.centilitros = centilitros;
    }
}

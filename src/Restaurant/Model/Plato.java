package Restaurant.Model;

public class Plato extends Articulo {

    private double gramos;

    public Plato(String nombre, String descripcion, double precio, double gramos) {
        super(nombre, descripcion, precio);
        this.gramos = gramos;
    }

    public double getGramos() {
        return gramos;
    }

    public void setGramos(double gramos) {
        this.gramos = gramos;
    }

    @Override
    public String toString() {
        return "Restaurant.Model.Plato{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}

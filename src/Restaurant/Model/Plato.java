package Restaurant.Model;

public class Plato extends Articulo {

    private double gramos;

    public Plato(int id, String nombre, String descripcion, float precio, double gramos) {
        super(id, nombre, descripcion, precio);
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
        return "Plato{" +
                ", id=" + id +'\'' +
                "gramos=" + gramos +'\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                "}\n";
    }
}

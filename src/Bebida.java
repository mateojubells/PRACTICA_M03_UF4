public class Bebida {
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean conAlcohol;

    public Bebida(String nombre, String descripcion, double precio, boolean conAlcohol) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.conAlcohol = conAlcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isConAlcohol() {
        return conAlcohol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setConAlcohol(boolean conAlcohol) {
        this.conAlcohol = conAlcohol;
    }
}

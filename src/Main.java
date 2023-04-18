import Model.*;
import View.*;
import Controller.*;

public class Main {
    public static void main(String[] args) {

        Plato[] platos = new Plato[3];
        platos[0] = new Plato("Macarrones", "Macarrones con salsa de tomate", 8, 10);
        platos[1] = new Plato("Pizza margarita", "Pizza con tomate y queso", 10, 20);

        System.out.println();
        for (Plato plato : platos) {
            System.out.println(plato);
        }
    }
}
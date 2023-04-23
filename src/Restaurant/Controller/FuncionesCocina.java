package Restaurant.Controller;

import Restaurant.Model.Bebida;
import Restaurant.Model.Plato;
import Restaurant.Principal.Database;
import Restaurant.View.RestaurantView;
import Restaurant.Utils.Utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionesCocina {




    public static void GestioArticles(RestaurantView restaurantUI, ArrayList<Plato> primeros, ArrayList<Plato> segundos, ArrayList<Plato> postres, ArrayList<Plato> carta, ArrayList<Bebida>bebidas){
        Scanner llegir = new Scanner(System.in);
        int opcio = Utilities.llegirInt("Escoja una opcion: " +
                "\t\n1. Añadir plato" +
                "\t\n2. Añadir bebida" +
                "\t\n3. Editar plato" +
                "\t\n4. Editar bebida", 1,4);
        switch (opcio){
            case 1:
                añadirPlato(restaurantUI);
                break;
            case 2:
                añadirBebida(restaurantUI, Database.cargarBebida());

        }

    }
    public static void añadirPlato(RestaurantView restaurantUI){

        String nombre = Utilities.llegirString("Introduzca el nombre del nuevo plato: ");
        String descripcion = Utilities.llegirString("Introduzca una descirpcion del plato");
        float precio = Utilities.llegirFloat("Introduce el precio del plato",0, 100);
        float peso = Utilities.llegirFloat("Introduce el peso del plato", 0, 2000);
        Plato nuevo = new Plato(nombre, descripcion, precio, peso);
        Database.cargarCarta(Database.cargarPrimeros(), Database.cargarSegundos(), Database.cargarPostres());

        String respuesta = Utilities.llegirString("Plato correctamente añadido, quieres añadirlo al menu? (yes/no)");
        if (respuesta.toLowerCase()== "yes") {
            int opcio = Utilities.llegirInt("Escoja la opcion:" +
                    "\t\n1. Primer plato" +
                    "\t\n2. Segundo plato" +
                    "\t\n3. Postre ", 1, 3);

            switch (opcio) {
                case 1:
                    Database.cargarPrimeros().add(nuevo);
                    break;
                case 2:
                    Database.cargarSegundos().add(nuevo);
                    break;
                case 3:
                    Database.cargarPostres().add(nuevo);
                    break;
            }
        }
    }
    public static void añadirBebida(RestaurantView restaurantUI, ArrayList<Bebida> Bebidas){

        String nombre = Utilities.llegirString("Introduzca el nombre del nuevo plato: ");
        String descripcion = Utilities.llegirString("Introduzca una descirpcion del plato");
        float precio = Utilities.llegirFloat("Introduce el precio del plato",0, 100);
        float peso = Utilities.llegirFloat("Introduce el peso del plato", 0, 2000);
        Plato nuevo = new Plato(nombre, descripcion, precio, peso);
        Database.cargarCarta(Database.cargarPrimeros(), Database.cargarSegundos(), Database.cargarPostres()).add(nuevo);

        String respuesta = Utilities.llegirString("Plato correctamente añadido, quieres añadirlo al menu? (yes/no)");
        if (respuesta.toLowerCase()== "yes") {
            int opcio = Utilities.llegirInt("Escoja la opcion:" +
                    "\t\n1. Primer plato" +
                    "\t\n2. Segundo plato" +
                    "\t\n3. Postre ", 1, 3);

            switch (opcio) {
                case 1:
                    Database.cargarPrimeros().add(nuevo);
                    break;
                case 2:
                    Database.cargarSegundos().add(nuevo);;
                case 3:
                    Database.cargarPostres().add(nuevo);
                    break;
            }
        }
    }


}

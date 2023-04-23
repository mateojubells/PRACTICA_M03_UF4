package Restaurant.View;

import Restaurant.Controller.ComandaController;
import Restaurant.Model.Bebida;
import Restaurant.Model.Plato;
import Restaurant.Principal.Database;
import Restaurant.Utils.Utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class CocinaView {

    public static void añadirPlato(RestaurantView restaurantUI){

        boolean opcionCorrecte = true;
        int opcio = 0;
        String nombre = Utilities.llegirString("Introduzca el nombre del nuevo plato: ");
        String descripcion = Utilities.llegirString("Introduzca una descirpcion del plato: ");
        float precio = Utilities.llegirFloat("Introduce el precio del plato: ",0, 100);
        float peso = Utilities.llegirFloat("Introduce el peso del plato: ", 0, 2000);
        Plato nuevo = new Plato(Database.cargarBebida().size()+1,nombre, descripcion, precio, peso);
        Database.cargarCarta().add(nuevo);

        String respuesta = Utilities.llegirString("Plato correctamente añadido, quieres añadirlo al menu? (yes/no)");

            do {
            if (respuesta.toLowerCase().equals("yes") ) {
                opcio = Utilities.llegirInt("Escoja la opcion:" +
                        "\t\n1. Primer plato" +
                        "\t\n2. Segundo plato" +
                        "\t\n3. Postre ", 1, 3);
            } else if (respuesta.toLowerCase().equals("no")){
                System.out.println("Ha seleccionado no añadir el plato al menu");
            } else {
                opcionCorrecte = false;
                respuesta = Utilities.llegirString("Opcion invalida, introduzca un valor correcto (yes/no): ");
            }
        }while (opcionCorrecte==false);
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

    public static void añadirBebida(RestaurantView restaurantUI, ArrayList<Bebida> Bebidas){
        boolean opcionCorrecte = true;
        int opcio = 0;
        String nombre = Utilities.llegirString("Introduzca el nombre de la nueva bebida ");
        String descripcion = Utilities.llegirString("Introduzca una descirpcion de la bebida");
        float precio = Utilities.llegirFloat("Introduce el precio de la bebida",0, 100);
        float centilitros = Utilities.llegirFloat("Introduce los centilitros que tiene la bebida", 0, 2000);
        Bebida nueva = new Bebida(Database.cargarBebida().size()+1,nombre, descripcion, precio, centilitros);
        Database.cargarBebida();
        System.out.println("Bebida correctamente añadida.");


        }

    //public static void ver

    public static void editarPlato(){
        Plato platoseleccionado = null;

        for (Plato plato: Database.cargarCarta()){
            System.out.println(Database.cargarCarta());
        }
        int idplato = Utilities.llegirInt("Introduzca el id del plato que quiere editar", 1, Database.cargarCarta().size());
        for (Plato plato: Database.cargarCarta()){
            if (plato.getId() == idplato){
                platoseleccionado = plato;
                break;
            }
        }

    }

    public static void modificarComanda(){
        ComandaController.verComandas();
        Utilities.llegirInt("Introduce el id de la comanda que quierese editar?", 1,Database.cargarComandas().size());
        for ()




    }
    }






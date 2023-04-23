package Restaurant.Controller;

import Restaurant.Model.*;
import Restaurant.Principal.Database;
import Restaurant.Utils.Utilities;
import Restaurant.View.* ;

import java.util.ArrayList;
import java.util.Scanner;

import static Restaurant.View.CocinaView.añadirBebida;
import static Restaurant.View.CocinaView.añadirPlato;

public class CocinaController {


    public static void GestioArticles(RestaurantView restaurantUI, ArrayList<Plato> primeros, ArrayList<Plato> segundos, ArrayList<Plato> postres, ArrayList<Plato> carta, ArrayList<Bebida>bebidas){
        int opcio = Utilities.llegirInt(
                "\t\t\n\n1. Añadir plato" +
                "\t\t\n\n2. Añadir bebida" +
                "\t\t\n\n3. Editar plato" +
                "\t\t\n\n4. Editar bebida"+
                "\t\t\n\n5. Atras" +
                        "\t\t\n\nEscoja una opcion: ", 1,4);
        switch (opcio){
            case 1:
                añadirPlato(restaurantUI);
                break;
            case 2:
                añadirBebida(restaurantUI, Database.cargarBebida());

        }

    }

    public static void GestionComandas(){
        int opcio = Utilities.llegirInt("Escoja una opcion: " +
                "\t\n1. Ver comandas" +
                "\t\n2. Modificar estado de comanda" +
                "\t\n3. Salir", 1,3);
        switch (opcio) {
            case 1:
                // ComandaController.verComandas();
                break;
            case 2:
                break;
        }
        }
    }


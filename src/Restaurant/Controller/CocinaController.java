package Restaurant.Controller;

import Restaurant.Model.Bebida;
import Restaurant.Model.Plato;
import Restaurant.Principal.Database;
import Restaurant.Utils.Utilities;
import Restaurant.View.CocinaView;
import Restaurant.View.RestaurantView;

import java.util.ArrayList;
import java.util.Scanner;

import static Restaurant.Controller.ComandaController.verComandas;
import static Restaurant.View.CocinaView.*;

public class CocinaController {

    public static void GestioArticles( ){
        int opcio = Utilities.llegirInt(
                "\t\t\t\n\n1. Añadir plato" +
                "\t\t\t\n\n2. Añadir bebida" +
                "\t\t\t\n\n3. Editar plato" +
                "\t\t\t\n\n4. Editar bebida"+
                "\t\t\t\n\n5. Atras" +
                        "\t\t\t\n\nEscoja una opcion: ", 1,5);
        switch (opcio){
            case 1:
                añadirPlato();
                break;
            case 2:
                añadirBebida();
                break;
            case 3:
                editarPlato();
                break;
            case 4:
                editarBebida();
                break;
            case 5:
                RestaurantView.cocinaMenu();
        }
    }

    public static void GestionComandas(){
        int opcio = Utilities.llegirInt(
                "\t\t\t\n\n1. Ver comandas" +
                "\t\t\t\n\n2. Modificar estado de comanda" +
                "\t\t\t\n\n3. Salir"+
               "\t\t\t\n\nEscoja una opcion; " , 1,3);
        switch (opcio) {
            case 1:
                verComandas();
                break;
            case 2:
                modificarComanda();
                break;
            case 3:
                RestaurantView.cocinaMenu();

        }
        }
    }


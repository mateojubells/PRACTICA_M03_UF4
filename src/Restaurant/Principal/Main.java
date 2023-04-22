package Restaurant.Principal;

import Restaurant.Controller.RestaurantController;
import Restaurant.Model.Mesa;
import Restaurant.Model.Plato;
import Restaurant.View.RestaurantView;

import utils.Utilities;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        /** CREATING OBJECTS **/

        RestaurantView restaurantUI = new RestaurantView();

        RestaurantController restaurantController = new RestaurantController(restaurantUI);

        System.out.println(restaurantUI);

        ArrayList<Mesa> mesas = new ArrayList<>();
        ArrayList<Plato> primeros = new ArrayList<>();
        ArrayList<Plato> segundos = new ArrayList<>();
        ArrayList<Plato> postres = new ArrayList<>();
        ArrayList<Plato> carta = new ArrayList<>();

        /** LOADING DATABASE **/

        mesas = Database.cargarMesas();
        primeros = Database.cargarPrimeros();
        segundos = Database.cargarSegundos();
        postres = Database.cargarPostres();
        carta = Database.cargarCarta( carta, primeros,segundos, postres);


        /** START PROGRAM **/

        restaurantController.init();








        System.out.println("Bienvenido: Escoja la opcion que desea realizar:" +
                "\t\n1. Comandas" +
                "\t\n2. Recibir mesa"+
                "\t\n3. ");




    }





    }

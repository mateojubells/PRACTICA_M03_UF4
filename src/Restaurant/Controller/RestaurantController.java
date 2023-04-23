package Restaurant.Controller;

import Restaurant.Model.*;
import Restaurant.Principal.Database;
import Restaurant.View.*;


public class RestaurantController {
    private RestaurantView restaurantView;
    ListaMesas listaMesas = new ListaMesas(Database.cargarMesas());

    ListaComandas listaComandas = new ListaComandas(Database.cargarComandas());

    private MesaView mesaView = new MesaView();
    private ComandaView comandaView = new ComandaView();

    private MesaController mesaController;

    private ComandaController comandaController;

    public RestaurantController (RestaurantView restaurantUI) {
        this.restaurantView = restaurantUI;
        mesaController = new MesaController(mesaView, listaMesas);
        comandaController = new ComandaController(comandaView, listaComandas);
    }


    public void init () {

        int option = 0;

        do {
            option = restaurantView.mainMenu();

            switch (option) {
                case 1:
                    initComedor();
                    break;

                case 2:
                    initCocina();
                    break;

                case 3:
                    restaurantView.salir();
                    break;
            }
        } while (option != 3);
    }

    public void initComedor () {
        int option = 0;

        do {
            option = restaurantView.comedorMenu();

            switch (option) {
                case 1:
                    mesaController.initMesas();
                    break;

                case 2:
                    comandaController.initComandasComedor();
                    break;
            }

        } while (option != 3);
    }



    public RestaurantView initCocina() {
        int option = 0;

        do {
            option = restaurantView.cocinaMenu();

            switch (option) {
                case 1:
                    FuncionesCocina.GestioArticles(restaurantView, Database.cargarPrimeros(), Database.cargarSegundos(), Database.cargarPostres(), Database.cargarPostres(), Database.cargarBebida());
                    break;
                case 2:

                    break;

                case 3:

                    break;

            }
        } while (option != 3);
        return restaurantView;
    }

    public void salir() {
        restaurantView.salir();
    }

    public RestaurantView getRestaurantView() {
        return restaurantView;
    }

    public void setRestaurantView(RestaurantView restaurantView) {
        this.restaurantView = restaurantView;
    }
}

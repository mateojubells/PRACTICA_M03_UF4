package Restaurant.Controller;

import Restaurant.Principal.Database;
import Restaurant.View.RestaurantView;
import Restaurant.Principal.Main;
import Restaurant.Principal.Database;


public class RestaurantController {
        private RestaurantView restaurantUI;

    public RestaurantController (RestaurantView restaurantUI) {
        this.restaurantUI = restaurantUI;
    }


    public void init () {

        int option = 0;

        do {
            option = restaurantUI.mainMenu();

            switch (option) {
                case 1:
                    initComedor();
                    break;

                case 2:
                    initCocina();
                    break;

                case 3:
                    restaurantUI.salir();
                    break;
            }
        } while (option != 3);
    }

    public void initComedor () {
        int option = 0;

        do {
            option = restaurantUI.comedorMenu();

            switch (option) {
                case 1:
                    initMesas();
                    break;

                case 2:
                    initComandasComedor();
                    break;

                case 3:
                    restaurantUI.salir();
                    break;
            }

        } while (option != 3);
    }

    public void initMesas() {
        int option = 0;


        do {
            option = restaurantUI.mesasMenu(); // Reservar, librar, ver, salir

            switch (option) {

                case 1:
                    reservarMesa();
            }

        } while (option != 4);
    }

    public void reservarMesa() {

    }

    public void initComandasComedor() {
        int option = 0;

        do {

        } while (option != 4);
    }

    public RestaurantView initCocina() {
        int option = 0;

        do {
            option = restaurantUI.cocinaMenu();

            switch (option) {
                case 1:
                    FuncionesCocina.GestioArticles(restaurantUI, Database.cargarPrimeros(), Database.cargarSegundos(), Database.cargarPostres(), Database.cargarPostres());

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

            }
        } while (option != 3);
        return restaurantUI;
    }

    public void salir() {
        restaurantUI.salir();
    }

    public RestaurantView getRestaurantUI() {
        return restaurantUI;
    }

    public void setRestaurantUI(RestaurantView restaurantUI) {
        this.restaurantUI = restaurantUI;
    }
}

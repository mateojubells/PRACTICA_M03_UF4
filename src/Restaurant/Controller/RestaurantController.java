package Restaurant.Controller;

import Restaurant.View.RestaurantView;

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
                    salir();
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
                    salir();
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

    public void initCocina() {
        int option = 0;

        do {
            option = restaurantUI.cocinaMenu();

            switch (option) {

            }

        } while (option != 3);
    }

    public void salir() {
        restaurantUI.salir();
    }
}
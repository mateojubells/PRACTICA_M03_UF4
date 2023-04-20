import Restaurant.Controller.RestaurantController;
import Restaurant.Model.*;
import Restaurant.View.RestaurantView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /** CREATING OBJECTS **/

        RestaurantView restaurantUI = new RestaurantView();

        RestaurantController restaurantController = new RestaurantController(restaurantUI);

        ArrayList<Mesa> mesas = new ArrayList<>();


        /** LOADING DATABASE **/

        mesas = Database.cargarMesas();

        /** START PROGRAM **/

        restaurantController.init();


    }
}
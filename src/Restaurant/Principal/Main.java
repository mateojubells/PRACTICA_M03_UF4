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

        /** START PROGRAM **/

        restaurantController.init();

    }
    }

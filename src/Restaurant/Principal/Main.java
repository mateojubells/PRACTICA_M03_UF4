package Restaurant.Principal;

import Restaurant.Controller.*;
import Restaurant.Model.*;
import Restaurant.View.*;

public class Main {
    public static void main(String[] args) {




        /** CREATING OBJECTS **/
        RestaurantView restaurantUI = new RestaurantView();

        RestaurantController restaurantController = new RestaurantController(restaurantUI);

        /** START PROGRAM **/

        restaurantController.init();

    }

    public static void creatingObjects () {

    }
}

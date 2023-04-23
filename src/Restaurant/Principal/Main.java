package Restaurant.Principal;

import Restaurant.Controller.*;
import Restaurant.Model.*;
import Restaurant.Utils.Utilities;
import Restaurant.View.*;

public class Main {
    public static void main(String[] args) {





        /** CREATING OBJECTS **/
        RestaurantView restaurantUI = new RestaurantView();

        RestaurantController restaurantController = new RestaurantController(restaurantUI);

        /** START PROGRAM **/

        restaurantController.init();

    }
    public static void editarPlato(){
        Plato platoseleccionado = null;

        System.out.println(Database.cargarCarta());

        int idplato = Utilities.llegirInt("Introduce el id del plato que quieres editar: ", 1, Database.cargarCarta().size());
        for (Plato plato: Database.cargarCarta()){
            if (plato.getId() == idplato){
                platoseleccionado = plato;
                System.out.println("\nEl plato a ediar es el siguiente: \n"+platoseleccionado);
                break;
            }
        }
        String nuevoNombre = Utilities.llegirString("Introduce el nuevo nombre del plato: ");
        String nuevaDescripcion = Utilities.llegirString("Introduce la descripción del plato ");
        Float precioNuevo = Utilities.llegirFloat("Introduce el precio del plato: ",0, 2000);
        Float pesoNuevo = Utilities.llegirFloat("Introduce el precio del plato", 0, 2000);
        Plato actualizacion = new Plato(idplato, nuevoNombre, nuevaDescripcion, precioNuevo, pesoNuevo);
        platoseleccionado = actualizacion;

        Database.cargarCarta().set(idplato, platoseleccionado);




    }

    public static void creatingObjects () {

    }
}

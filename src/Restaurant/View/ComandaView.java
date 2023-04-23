package Restaurant.View;

import Restaurant.Model.ListaComandas;
import Restaurant.Model.ListaMesas;
import Restaurant.Model.Menu;
import Restaurant.Model.Plato;
import Restaurant.Utils.Utilities;

import java.util.ArrayList;

public class ComandaView {

    public static String tituloComanda = "   ____           _   _                ____                                _           \n" +
            "  / ___| ___  ___| |_(_) ___  _ __    / ___|___  _ __ ___   __ _ _ __   __| | __ _ ___ \n" +
            " | |  _ / _ \\/ __| __| |/ _ \\| '_ \\  | |   / _ \\| '_ ` _ \\ / _` | '_ \\ / _` |/ _` / __|\n" +
            " | |_| |  __/\\__ \\ |_| | (_) | | | | | |__| (_) | | | | | | (_| | | | | (_| | (_| \\__ \\\n" +
            "  \\____|\\___||___/\\__|_|\\___/|_| |_|  \\____\\___/|_| |_| |_|\\__,_|_| |_|\\__,_|\\__,_|___/\n";

    public static String opcionesComanda = "\n\n\t1) Añadir Comanda\n\n\t2) Modificar Comanda\n\n\t3) Ver Comandas\n\n\t4) Salir";

    public static String tituloAñadirComanda= "     _     /\\/|           _ _         ____                                _       \n" +
            "    / \\   |/\\/   __ _  __| (_)_ __   / ___|___  _ __ ___   __ _ _ __   __| | __ _ \n" +
            "   / _ \\ | '_ \\ / _` |/ _` | | '__| | |   / _ \\| '_ ` _ \\ / _` | '_ \\ / _` |/ _` |\n" +
            "  / ___ \\| | | | (_| | (_| | | |    | |__| (_) | | | | | | (_| | | | | (_| | (_| |\n" +
            " /_/   \\_\\_| |_|\\__,_|\\__,_|_|_|     \\____\\___/|_| |_| |_|\\__,_|_| |_|\\__,_|\\__,_|\n";

    public static String salir = "\t0) Salir";

    public int comandaMenu () {
        System.out.println(tituloComanda);
        System.out.println(opcionesComanda);
        Utilities.enter(2);
        return Utilities.llegirInt(RestaurantView.askOptions, 1, 4);
    }

    public void añadirComanda(ListaComandas listaComandas) {
        System.out.println(tituloAñadirComanda);
        Utilities.enter(1);
        listaComandas.printComandas();
        Utilities.enter(1);
        System.out.println(salir);
        Utilities.enter(2);
    }

    public ArrayList<Plato> añadirPlato(Menu menu) {
        ArrayList<Plato> platos = new ArrayList<>();

        int option = 0;

        menu.mostrarPlatos();

        do {
            // Ask user to insert plate and return arraylist until he pressed exit
        } while(option != -1);
        return platos;
    }



}

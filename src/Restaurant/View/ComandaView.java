package Restaurant.View;

import Restaurant.Utils.Utilities;

public class ComandaView {

    public static String tituloComanda = "   ____           _   _                ____                                _           \n" +
            "  / ___| ___  ___| |_(_) ___  _ __    / ___|___  _ __ ___   __ _ _ __   __| | __ _ ___ \n" +
            " | |  _ / _ \\/ __| __| |/ _ \\| '_ \\  | |   / _ \\| '_ ` _ \\ / _` | '_ \\ / _` |/ _` / __|\n" +
            " | |_| |  __/\\__ \\ |_| | (_) | | | | | |__| (_) | | | | | | (_| | | | | (_| | (_| \\__ \\\n" +
            "  \\____|\\___||___/\\__|_|\\___/|_| |_|  \\____\\___/|_| |_| |_|\\__,_|_| |_|\\__,_|\\__,_|___/\n";

    public static String opcionesComanda = "\n\n\t1) Añadir Comanda\n\n\t2) Modificar Comanda\n\n\t3) Ver Comandas\n\n\t4) Salir";

    public int comandaMenu () {
        System.out.println(tituloComanda);
        System.out.println(opcionesComanda);
        Utilities.enter(2);
        return Utilities.llegirInt(RestaurantView.askOptions, 1, 4);
    }



}

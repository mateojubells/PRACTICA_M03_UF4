package Restaurant.View;

import Restaurant.Utils.Utilities;

public class RestaurantView {

    public static String logo = "  ____           _                              _     _____           _      _          _ _ _ \n" +
            " |  _ \\ ___  ___| |_ __ _ _   _ _ __ __ _ _ __ | |_  |_   _|__  _ __ (_) ___| |__   ___| | (_)\n" +
            " | |_) / _ \\/ __| __/ _` | | | | '__/ _` | '_ \\| __|   | |/ _ \\| '_ \\| |/ __| '_ \\ / _ \\ | | |\n" +
            " |  _ <  __/\\__ \\ || (_| | |_| | | | (_| | | | | |_    | | (_) | | | | | (__| | | |  __/ | | |\n" +
            " |_| \\_\\___||___/\\__\\__,_|\\__,_|_|  \\__,_|_| |_|\\__|   |_|\\___/|_| |_|_|\\___|_| |_|\\___|_|_|_|\n" +
            "                                                                                              ";

    public static String mainOptions = "\n\n\t1) Gestion de Comedor\n\n\t2) Gestion de Cocina\n\n\t3) Salir";

    public static String askOptions = "Elige una opción: ";

    /***  VARIABLES COMEDOR  ***/

    public static String tituloComedor = " _____           _   _               _____                          _            \n" +
            "|  __ \\         | | (_)             /  __ \\                        | |           \n" +
            "| |  \\/ ___  ___| |_ _  ___  _ __   | /  \\/ ___  _ __ ___   ___  __| | ___  _ __ \n" +
            "| | __ / _ \\/ __| __| |/ _ \\| '_ \\  | |    / _ \\| '_ ` _ \\ / _ \\/ _` |/ _ \\| '__|\n" +
            "| |_\\ \\  __/\\__ \\ |_| | (_) | | | | | \\__/\\ (_) | | | | | |  __/ (_| | (_) | |   \n" +
            " \\____/\\___||___/\\__|_|\\___/|_| |_|  \\____/\\___/|_| |_| |_|\\___|\\__,_|\\___/|_|   \n";

    public static String opcionesComedor = "\n\n\t1) Gestion de Mesas\n\n\t2) Gestion de Comandas\n\n\t3) Atrás";



    /***  VARIABLES COCINA  ***/

    public static String tituloCocina = " _____           _   _               _____            _             \n" +
            "|  __ \\         | | (_)             /  __ \\          (_)            \n" +
            "| |  \\/ ___  ___| |_ _  ___  _ __   | /  \\/ ___   ___ _ _ __   __ _ \n" +
            "| | __ / _ \\/ __| __| |/ _ \\| '_ \\  | |    / _ \\ / __| | '_ \\ / _` |\n" +
            "| |_\\ \\  __/\\__ \\ |_| | (_) | | | | | \\__/\\ (_) | (__| | | | | (_| |\n" +
            " \\____/\\___||___/\\__|_|\\___/|_| |_|  \\____/\\___/ \\___|_|_| |_|\\__,_|\n";

    public static String opcionesCocina = "\n\n\t1) Gestion de Articulos\n\n\t2) Gestion de Comandas\n\n\t3) Atrás";
    public static String adios = "· Adios! Hasta mañana ·";



    public int mainMenu() {
        System.out.println(logo);
        System.out.println(mainOptions);
        Utilities.enter(2);
        return Utilities.llegirInt(askOptions, 1, 3);
    }

    /***  METODOS COMEDOR  ***/
    public int comedorMenu() {
        System.out.println(tituloComedor);
        System.out.println(opcionesComedor);
        Utilities.enter(2);
        return Utilities.llegirInt(askOptions, 1, 3);
    }


    /***  METODOS COCINA  ***/
    public int cocinaMenu() {
        System.out.println(tituloCocina);
        System.out.println(opcionesCocina);
        Utilities.enter(2);
        return Utilities.llegirInt(askOptions, 1, 3);
    }

    public void salir () {
        System.out.println(adios);
    }
}

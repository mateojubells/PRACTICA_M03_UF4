package View;

public class RestaurantUI {

    public static String logo = "  ____           _                              _     _____           _      _          _ _ _ \n" +
            " |  _ \\ ___  ___| |_ __ _ _   _ _ __ __ _ _ __ | |_  |_   _|__  _ __ (_) ___| |__   ___| | (_)\n" +
            " | |_) / _ \\/ __| __/ _` | | | | '__/ _` | '_ \\| __|   | |/ _ \\| '_ \\| |/ __| '_ \\ / _ \\ | | |\n" +
            " |  _ <  __/\\__ \\ || (_| | |_| | | | (_| | | | | |_    | | (_) | | | | | (__| | | |  __/ | | |\n" +
            " |_| \\_\\___||___/\\__\\__,_|\\__,_|_|  \\__,_|_| |_|\\__|   |_|\\___/|_| |_|_|\\___|_| |_|\\___|_|_|_|\n" +
            "                                                                                              ";

    public static String mainOptions = "1) Gestion de Comedor\n\n2) Gestion de Cocina";
    public static String tituloComedor = " _____           _   _               _____                          _            \n" +
            "|  __ \\         | | (_)             /  __ \\                        | |           \n" +
            "| |  \\/ ___  ___| |_ _  ___  _ __   | /  \\/ ___  _ __ ___   ___  __| | ___  _ __ \n" +
            "| | __ / _ \\/ __| __| |/ _ \\| '_ \\  | |    / _ \\| '_ ` _ \\ / _ \\/ _` |/ _ \\| '__|\n" +
            "| |_\\ \\  __/\\__ \\ |_| | (_) | | | | | \\__/\\ (_) | | | | | |  __/ (_| | (_) | |   \n" +
            " \\____/\\___||___/\\__|_|\\___/|_| |_|  \\____/\\___/|_| |_| |_|\\___|\\__,_|\\___/|_|   \n" +
            "                                                                                 \n" +
            "                                                                                 ";

    public static String tituloCocina = " _____           _   _               _____            _             \n" +
            "|  __ \\         | | (_)             /  __ \\          (_)            \n" +
            "| |  \\/ ___  ___| |_ _  ___  _ __   | /  \\/ ___   ___ _ _ __   __ _ \n" +
            "| | __ / _ \\/ __| __| |/ _ \\| '_ \\  | |    / _ \\ / __| | '_ \\ / _` |\n" +
            "| |_\\ \\  __/\\__ \\ |_| | (_) | | | | | \\__/\\ (_) | (__| | | | | (_| |\n" +
            " \\____/\\___||___/\\__|_|\\___/|_| |_|  \\____/\\___/ \\___|_|_| |_|\\__,_|\n" +
            "                                                                    \n" +
            "                                                                    ";

    public void mainMenu() {
        System.out.println(logo);
        System.out.println(mainOptions);
        System.out.println();
    }
}

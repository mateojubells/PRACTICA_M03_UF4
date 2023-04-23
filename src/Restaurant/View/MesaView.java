package Restaurant.View;

import Restaurant.Model.ListaMesas;
import Restaurant.Utils.Utilities;

public class MesaView {

    public static String tituloMesas = "   ____           _   _               __  __                     \n" +
            "  / ___| ___  ___| |_(_) ___  _ __   |  \\/  | ___  ___  __ _ ___ \n" +
            " | |  _ / _ \\/ __| __| |/ _ \\| '_ \\  | |\\/| |/ _ \\/ __|/ _` / __|\n" +
            " | |_| |  __/\\__ \\ |_| | (_) | | | | | |  | |  __/\\__ \\ (_| \\__ \\\n" +
            "  \\____|\\___||___/\\__|_|\\___/|_| |_| |_|  |_|\\___||___/\\__,_|___/\n";

    public static String opcionesMesas = "\n\n\t1) Reservar mesa\n\n\t2) Librar mesa\n\n\t3) Ver mesas\n\n\t4) Atrás";

    public static String tituloReservarMesa = "  ____                                       __  __                     \n" +
            " |  _ \\ ___  ___  ___ _ ____   ____ _ _ __  |  \\/  | ___  ___  __ _ ___ \n" +
            " | |_) / _ \\/ __|/ _ \\ '__\\ \\ / / _` | '__| | |\\/| |/ _ \\/ __|/ _` / __|\n" +
            " |  _ <  __/\\__ \\  __/ |   \\ V / (_| | |    | |  | |  __/\\__ \\ (_| \\__ \\\n" +
            " |_| \\_\\___||___/\\___|_|    \\_/ \\__,_|_|    |_|  |_|\\___||___/\\__,_|___/\n";

    public static String tituloLibrarMesa = "  _     _ _                      __  __                     \n" +
            " | |   (_) |__  _ __ __ _ _ __  |  \\/  | ___  ___  __ _ ___ \n" +
            " | |   | | '_ \\| '__/ _` | '__| | |\\/| |/ _ \\/ __|/ _` / __|\n" +
            " | |___| | |_) | | | (_| | |    | |  | |  __/\\__ \\ (_| \\__ \\\n" +
            " |_____|_|_.__/|_|  \\__,_|_|    |_|  |_|\\___||___/\\__,_|___/\n";

    public static String tituloVerMesa = " __     __          __  __                     \n" +
            " \\ \\   / /__ _ __  |  \\/  | ___  ___  __ _ ___ \n" +
            "  \\ \\ / / _ \\ '__| | |\\/| |/ _ \\/ __|/ _` / __|\n" +
            "   \\ V /  __/ |    | |  | |  __/\\__ \\ (_| \\__ \\\n" +
            "    \\_/ \\___|_|    |_|  |_|\\___||___/\\__,_|___/\n";

    public static String askReservarMesa = "Que mesa desea reservar?";

    public static String askLibrarMesa = "Que mesa desea librar?";

    public static String numeroMesa = "\tNumero de Mesa: ";

    public static String reservarMesaCorrecto = "Se ha reservado esta mesa correctamente!";

    public static String librarMesaCorrecto = "Se ha librado esta mesa correctamente!";

    public static String reservarMesaIncorrecto = "ERROR: No se puede reservar esta mesa! Porfavor, seleccione otra.";

    public static String librarMesaIncorrecto = "ERROR: No se puede librar esta mesa! Porfavor, seleccione otra.";

    public static String salir = "\t0) Salir";

    public int mesasMenu () {
        System.out.println(tituloMesas);
        System.out.println(opcionesMesas);
        Utilities.enter(2);
        return Utilities.llegirInt(RestaurantView.askOptions, 1, 4);
    }

    public void reservarMesa(ListaMesas listaMesas) {
        System.out.println(tituloReservarMesa);
        Utilities.enter(1);
        listaMesas.printMesas();
        Utilities.enter(1);
        System.out.println(salir);
        Utilities.enter(2);
    }

    public int askReservarMesa (ListaMesas listaMesas) {
        int mesaOption = 0;
        boolean correct = true;

        do {
            correct = true;

            Utilities.enter(1);
            System.out.println(askReservarMesa);
            Utilities.enter(1);

            mesaOption =  Utilities.llegirInt(numeroMesa, 0, 10);

            if (mesaOption == 0) {
                mesaOption = -1;
            }
            else mesaOption --;

            if (mesaOption != -1) {
                if (listaMesas.getMesasList().get(mesaOption).isOcupada()) {
                    Utilities.enter(1);
                    System.out.println(reservarMesaIncorrecto);
                    Utilities.enter(1);

                    correct = false;
                }
                else {
                    Utilities.enter(1);
                    System.out.println(reservarMesaCorrecto);
                    Utilities.enter(1);
                }

            }
        } while (!correct);


        return mesaOption;
    }

    public void librarMesa(ListaMesas listaMesas) {
        System.out.println(tituloLibrarMesa);
        Utilities.enter(1);
        listaMesas.printMesas();
        Utilities.enter(1);
        System.out.println(salir);
    }

    public int askLibrarMesa (ListaMesas listaMesas) {
        int mesaOption = 0;
        boolean correct = true;

        do {
            correct = true;

            Utilities.enter(1);
            System.out.println(askLibrarMesa);
            Utilities.enter(1);

            mesaOption =  Utilities.llegirInt(numeroMesa, 0, 10);

            if (mesaOption == 0) {
                mesaOption = -1;
            }
            else mesaOption --;

            if(mesaOption != -1) {
                if (!listaMesas.getMesasList().get(mesaOption).isOcupada()) {
                    Utilities.enter(1);
                    System.out.println(librarMesaIncorrecto);
                    Utilities.enter(1);

                    correct = false;
                }
                else {
                    Utilities.enter(1);
                    System.out.println(librarMesaCorrecto);
                    Utilities.enter(1);
                }
            }
        } while (!correct);


        return mesaOption;
    }

    public void verMesas(ListaMesas listaMesas) {
        System.out.println(tituloVerMesa);
        listaMesas.printMesas();
    }

}

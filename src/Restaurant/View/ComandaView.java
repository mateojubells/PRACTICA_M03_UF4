package Restaurant.View;

import Restaurant.Model.*;
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

    public static String askPlato = "Añadimos el plato: ";

    public static String askBebida = "Añadimos la bebida: ";

    public static String correctaComanda = "Comanda guardada exitosamente!";

    public static String tituloModificarComanda = "  __  __           _ _  __ _                   ____                                _       \n" +
            " |  \\/  | ___   __| (_)/ _(_) ___ __ _ _ __   / ___|___  _ __ ___   __ _ _ __   __| | __ _ \n" +
            " | |\\/| |/ _ \\ / _` | | |_| |/ __/ _` | '__| | |   / _ \\| '_ ` _ \\ / _` | '_ \\ / _` |/ _` |\n" +
            " | |  | | (_) | (_| | |  _| | (_| (_| | |    | |__| (_) | | | | | | (_| | | | | (_| | (_| |\n" +
            " |_|  |_|\\___/ \\__,_|_|_| |_|\\___\\__,_|_|     \\____\\___/|_| |_| |_|\\__,_|_| |_|\\__,_|\\__,_|\n";

    public static String tituloVerComanda = " __     __           ____                                _           \n" +
            " \\ \\   / /__ _ __   / ___|___  _ __ ___   __ _ _ __   __| | __ _ ___ \n" +
            "  \\ \\ / / _ \\ '__| | |   / _ \\| '_ ` _ \\ / _` | '_ \\ / _` |/ _` / __|\n" +
            "   \\ V /  __/ |    | |__| (_) | | | | | | (_| | | | | (_| | (_| \\__ \\\n" +
            "    \\_/ \\___|_|     \\____\\___/|_| |_| |_|\\__,_|_| |_|\\__,_|\\__,_|___/\n";
    public static String askModificarComanda = "Que comanda desea modificar?";

    public static String numeroComanda = "\tComanda #: ";

    public static String askEstadoComanda = "Indica el nuevo estado de la comanda: ";

    public static String estadoCorrecto = "Se ha modificado el estado de la comanda correctamente";
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

        Utilities.enter(1);
        menu.mostrarPlatos();
        Utilities.enter(1);

        do {
            option =  Utilities.llegirInt(askPlato, menu.getMinPlatos(), menu.getMaxPlatos());

            if (option == 0) {
                option = -1;
            }
            else option --;

            if (option != -1) {
                platos.add(menu.getPlatos().get(option));
            }
        } while(option != -1);
        return platos;
    }

    public ArrayList<Bebida> añadirBebida(Menu menu) {
        ArrayList<Bebida> bebidas = new ArrayList<>();

        int option = 0;

        Utilities.enter(1);
        menu.mostrarBebidas();
        Utilities.enter(1);

        do {
            option =  Utilities.llegirInt(askBebida, menu.getMinBebidas(), menu.getMaxBebidas());

            if (option == 0) {
                option = -1;
            }
            else option --;

            if (option != -1) {
                bebidas.add(menu.getBebidas().get(option));
            }
        } while(option != -1);
        return bebidas;
    }

    public void correctaComanda () {
        System.out.println(correctaComanda);
    }

    public void modificarComanda(ListaComandas listaComandas) {
        System.out.println(tituloModificarComanda);
        Utilities.enter(1);
        listaComandas.printComandas();
        Utilities.enter(1);
        System.out.println(salir);
        Utilities.enter(2);
    }

    public int askModificarComanda (ListaComandas listaComandas) {

        int comandaOption = 0;


        Utilities.enter(1);
        System.out.println(askModificarComanda);
        Utilities.enter(1);

        comandaOption =  Utilities.llegirInt(numeroComanda, listaComandas.getMinComandas(), listaComandas.getMaxComandas());

        if (comandaOption == 0) {
            comandaOption = -1;
        }
        else comandaOption--;

        return comandaOption;
    }

    public Enum<EstadoComanda> askModificarEstado (int comandaOption, ListaComandas listaComandas) {
        Enum<EstadoComanda> estadoComanda = EstadoComanda.RECIBIDO;

        printComandaState(comandaOption, listaComandas);

        estadoComanda = askChangeState();

        return estadoComanda;
    }

    public void printComandaState (int index, ListaComandas listaComandas) {
        Enum<EstadoComanda> estado = listaComandas.getComandasList().get(index).isPreparado();
        index ++;

        Utilities.enter(1);
        System.out.println("Comanda #" + index + ": \tEstado: " + estado);
        Utilities.enter(1);
    }

    public Enum<EstadoComanda> askChangeState () {
        int option = 0;
        Enum<EstadoComanda> estado = EstadoComanda.RECIBIDO;

        Utilities.enter(1);
        Utilities.enter(1);
        System.out.println("\t1) " + EstadoComanda.RECIBIDO);
        System.out.println("\t2) " + EstadoComanda.PREPARANDO);
        System.out.println("\t3) " + EstadoComanda.HECHO);
        System.out.println("\t4) " + EstadoComanda.ENTREGADO);
        System.out.println("\t5) " + EstadoComanda.CANCELADO);
        Utilities.enter(1);
        System.out.println(salir);

        option = Utilities.llegirInt(askEstadoComanda, 0, 5);

        switch (option) {
            case 0:
                System.out.println(salir);
                break;

            case 1:
                estado = EstadoComanda.RECIBIDO;
                break;

            case 2:
                estado = EstadoComanda.PREPARANDO;
                break;

            case 3:
                estado = EstadoComanda.HECHO;
                break;

            case 4:
                estado = EstadoComanda.ENTREGADO;
                break;

            case 5:
                estado = EstadoComanda.CANCELADO;
                break;
        }

        return estado;
    }

    public void verComandas (ListaComandas listaComandas) {

        System.out.println(tituloVerComanda);
        Utilities.enter(1);
        listaComandas.printComandas();
        Utilities.enter(1);
        System.out.println(salir);
        Utilities.enter(2);

    }

}

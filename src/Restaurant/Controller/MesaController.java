package Restaurant.Controller;

import Restaurant.View.MesaView;
import Restaurant.Model.ListaMesas;

public class MesaController {

    private MesaView mesaView;

    private ListaMesas listaMesas;

    public MesaController (MesaView view, ListaMesas listaMesas) {
        this.mesaView = view;
        this.listaMesas = listaMesas;
    }

    public void initMesas() {
        int option = 0;

        do {
            option = mesaView.mesasMenu(); // Reservar, librar, ver, salir

            switch (option) {

                case 1:
                    reservarMesa();
                    break;

                case 2:
                    librarMesa();
                    break;

                case 3:
                    verMesas();
                    break;
            }

        } while (option != 4);
    }

    public void reservarMesa () {
        int mesaOption = 0;

        mesaView.reservarMesa(listaMesas); // Muestra todas las mesas

        mesaOption = mesaView.askReservarMesa(listaMesas); // Pregunta mesa para reservar i devuelve

        // Mesa option es -1 cuando el usuario quiere tirar atras
        if (mesaOption != -1 ) {
            listaMesas.getMesasList().get(mesaOption).setOcupada(true); // Marcamos ocupada la mesa deseada
        }
    }

    public void librarMesa () {
        int mesaOption = 0;

        mesaView.librarMesa(listaMesas); // Muestra todas las mesas

        mesaOption = mesaView.askLibrarMesa(listaMesas); // Pregunta mesa para reservar i devuelve

        // Mesa option es -1 cuando el usuario quiere tirar atras
        if (mesaOption != -1) {
            listaMesas.getMesasList().get(mesaOption).setOcupada(false); // Marcamos ocupada la mesa deseada
        }
    }

    public void verMesas () {
        mesaView.verMesas(listaMesas);
    }


}

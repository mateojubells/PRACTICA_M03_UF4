package Restaurant.Controller;

import Restaurant.Model.ListaComandas;
import Restaurant.Model.*;
import Restaurant.View.ComandaView;

import java.util.ArrayList;

public class ComandaController {

    private ComandaView comandaView;

    private ListaComandas listaComandas;

    private Menu menu;

    public ComandaController(ComandaView comandaView, ListaComandas listaComandas, Menu menu) {
        this.comandaView = comandaView;
        this.listaComandas = listaComandas;
        this.menu = menu;
    }

    public ComandaView getComandaView() {
        return comandaView;
    }

    public void setComandaView(ComandaView comandaView) {
        this.comandaView = comandaView;
    }

    public ListaComandas getListaComandas() {
        return listaComandas;
    }

    public void setListaComandas(ListaComandas listaComandas) {
        this.listaComandas = listaComandas;
    }

    public void initComandasComedor() {
        int option = 0;

        do {
            option = comandaView.comandaMenu(); // Añadir, cambiar, ver

            switch (option) {

                case 1:
                    añadirComanda();
                    break;

                case 2:
                    modificarComanda();
                    break;

                case 3:
                    verComandas();
                    break;
            }

        } while (option != 4);
    }

    public void añadirComanda() {

        ArrayList<Plato> platos;
        ArrayList<Bebida> bebidas;

        comandaView.añadirComanda(listaComandas); // Muestra todas las mesas

        platos = comandaView.añadirPlato(menu);

        // FIXME
        // Mesa option es -1 cuando el usuario quiere tirar atras
        //if (mesaOption != -1 ) {
        //    listaMesas.getMesasList().get(mesaOption).setOcupada(true); // Marcamos ocupada la mesa deseada
        //}
    }

    public void modificarComanda(){


    }

    public static void verComandas() {

    }
}

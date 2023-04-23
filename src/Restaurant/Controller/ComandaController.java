package Restaurant.Controller;

import Restaurant.Model.ListaComandas;
import Restaurant.View.ComandaView;

public class ComandaController {

    private ComandaView comandaView;

    private ListaComandas listaComandas;

    public ComandaController(ComandaView comandaView, ListaComandas listaComandas) {
        this.comandaView = comandaView;
        this.listaComandas = listaComandas;
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

    }

    public void modificarComanda(){

    }

    public void verComandas () {

    }
}

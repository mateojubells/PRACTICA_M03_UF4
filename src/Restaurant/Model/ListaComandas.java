package Restaurant.Model;

import java.util.ArrayList;

public class ListaComandas {

    private ArrayList<Comanda> comandasList = new ArrayList<>();

    public ListaComandas(ArrayList<Comanda> comandas) {
        this.comandasList = comandas;
    }

    public ArrayList<Comanda> getComandasList() {
        return comandasList;
    }

    public void setComandasList(ArrayList<Comanda> comandasList) {
        this.comandasList = comandasList;
    }

    public void printComandas () {
        for (Comanda comanda: comandasList) {
            System.out.println("Comanda #" + comanda.getIdComanda() + ": \t" + comanda.isPreparado());
        }
    }
}

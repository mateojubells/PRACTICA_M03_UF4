package Restaurant.Model;

import java.util.ArrayList;
import java.lang.Enum.EnumDesc.*;

import static Restaurant.Model.EstadoComanda.*;

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

    public void añadirComanda(ArrayList<Plato> platos, ArrayList<Bebida> bebidas) {

        int id = comandasList.size() + 1;

        Enum<EstadoComanda> estado = RECIBIDO;

        comandasList.add(new Comanda(id, platos, bebidas, estado));
    }

    public int getMinComandas () {
        if (comandasList.size() == 0) {
            return 0;
        }
        else return 1;
    }

    public int getMaxComandas () {
        return comandasList.size();
    }
}

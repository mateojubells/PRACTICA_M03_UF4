package Restaurant.Model;

import java.util.ArrayList;

public class ListaMesas {

    private ArrayList<Mesa> mesasList = new ArrayList<>();

    public ListaMesas(ArrayList<Mesa> mesas) {
        this.mesasList = mesas;
    }

    public ArrayList<Mesa> getMesasList() {
        return mesasList;
    }

    public void setMesasList(ArrayList<Mesa> mesasList) {
        this.mesasList = mesasList;
    }

    public void printMesas () {
        for (Mesa mesas: mesasList) {
            System.out.println("Mesa #" + mesas.getNumero() + ": \t" + mesas.estaOcupada() + " | Sillas: " + mesas.getCapacidad());
        }
    }


}

import Restaurant.Model.*;

import java.util.ArrayList;

public class Database {

    public static ArrayList<Mesa> cargarMesas () {

        ArrayList<Mesa> mesas = new ArrayList<>();
        mesas.add(new Mesa(1, 2));
        mesas.add(new Mesa(2, 4));
        mesas.add(new Mesa(3, 6));
        mesas.add(new Mesa(4, 8));
        mesas.add(new Mesa(5, 10));
        mesas.add(new Mesa(6, 2));
        mesas.add(new Mesa(7, 4));
        mesas.add(new Mesa(8, 6));
        mesas.add(new Mesa(9, 8));
        mesas.add(new Mesa(10, 10));

        return mesas;
    }
}

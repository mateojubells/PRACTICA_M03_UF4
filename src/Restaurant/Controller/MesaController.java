package Restaurant.Controller;

import Restaurant.Model.Mesa;
import Restaurant.View.MesaView;

public class MesaController {

    private Mesa model;
    private MesaView view;

    public MesaController (Mesa model, MesaView view) {
        this.model = model;
        this.view = view;
    }
}

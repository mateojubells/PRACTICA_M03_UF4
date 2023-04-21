import Model.*;
import View.*;
import Controller.*;

public class Main {
    public static void main(String[] args) {

        Plato[] platos = new Plato[17];
        Bebida[] bebidas = new Bebida[5];

        /** CREATING OBJECTS **/

        RestaurantView restaurantUI = new RestaurantView();

        System.out.println();
        for (Plato plato : platos) {
            System.out.println(plato);
        }

        System.out.println("Bienvenido: Escoja la opcion que desea realizar:" +
                "\t\n1. Comandas" +
                "\t\n2. Recibir mesa"+
                "\t\n3. ");


        //Primeros
        platos[0] = new Plato("Ensalada César", "Lechuga, pollo, tomate, queso parmesano y aderezo César", 12.50, 200);
        platos[1] = new Plato("Gazpacho", "Sopa fría de tomate, pepino, pimiento y cebolla", 8.75, 300);
        platos[2] = new Plato("Crema de calabaza", "Sopa cremosa de calabaza, nata y especias", 9.25, 250);
        platos[3] = new Plato("Hummus", "Puré de garbanzos, tahini, aceite de oliva y especias", 7.50, 150);
        platos[4] = new Plato("Bruschetta", "Pan tostado con tomate, ajo, albahaca y aceite de oliva", 10.00, 180);
        platos[5] = new Plato("Tortilla española", "Tortilla de patata, cebolla y huevo", 11.00, 250);
        platos[6] = new Plato("Croquetas de jamón", "Croquetas de jamón ibérico con bechamel y panko", 9.50, 200);

        // Segundos
        platos[7] = new Plato("Solomillo a la pimienta", "Solomillo de ternera con salsa de pimienta y guarnición de verduras", 24.50, 300);
        platos[8] = new Plato("Merluza en salsa verde", "Merluza con salsa de perejil, ajo y vino blanco y guarnición de patatas", 22.75, 250);
        platos[9] = new Plato("Pollo al curry", "Pollo en salsa de curry con arroz basmati y verduras salteadas", 18.25, 300);
        platos[10] = new Plato("Lasaña de verduras", "Lasaña de verduras con salsa de tomate y queso gratinado", 16.50, 250);
        platos[11] = new Plato("Canelones de carne", "Canelones rellenos de carne y bechamel, gratinados con queso", 17.75, 300);
        platos[12] = new Plato("Paella mixta", "Arroz con marisco y carne, cocinado con azafrán y pimiento rojo", 23.50, 350);

        //postres
        platos[14] = new Plato("Tarta de queso", "Tarta de queso al horno con base de galleta y mermelada de frutos rojos", 7.50, 150);
        platos[15] = new Plato("Crema catalana", "Crema pastelera con caramelo quemado por encima", 6.75, 120);
        platos[16] = new Plato("Helado de vainilla", "Helado de vainilla con sirope de chocolate", 4.50, 100);
        platos[17] = new Plato("Coulant de chocolate", "Bizcocho de chocolate relleno de chocolate líquido, servido caliente", 8.25, 150);

        //bebidas
        bebidas[1] = new Bebida("Agua mineral", "Agua mineral natural o con gas", 2.50, 500);
        bebidas[2] = new Bebida("Coca-Cola", "Refresco de cola", 3.00, 330);
        bebidas[3] = new Bebida("Cerveza", "Cerveza rubia o negra, de barril o botella", 3.50, 500);
        bebidas[4] = new Bebida("Vino tinto", "Vino tinto de la casa", 4.00, 150);
        bebidas[5] = new Bebida("Zumo de naranja", "Zumo de naranja natural exprimido", 3.25, 250);

    }
    public static void menuAjustes(){
        Scanner llegir = new Scanner(System.in);
        int opcio = Utilities.llegirInt("Escoja una opcion: " +
                "\t\n1. Añadir plato" +
                "\t\n2. Añadir bebida" +
                "\t\n3 Editar plato" +
                "\t\n4. Editar bebida", 1,4);
        switch (opcio){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
        }


    }
    public static void añadirPlato(){

        String nom = Utilities.llegirString("Introduzca el nombre del nuevo plato: ");
        String descripcio = Utilities.llegirString("Introduzca una descirpcion del plato");
        float precio = Utilities.llegirFloat("Introduce el precio del plato",0, 100);
        RestaurantController restaurantController = new RestaurantController(restaurantUI);

        ArrayList<Mesa> mesas = new ArrayList<>();


        /** LOADING DATABASE **/

        mesas = Database.cargarMesas();

        /** START PROGRAM **/

        restaurantController.init();


    }
}
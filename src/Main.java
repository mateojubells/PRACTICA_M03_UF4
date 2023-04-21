
import Restaurant.Controller.RestaurantController;
import Restaurant.Model.Bebida;
import Restaurant.Model.Mesa;
import Restaurant.Model.Plato;
import Restaurant.View.RestaurantView;

import utils.Utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RestaurantController restaurantController = new RestaurantController(restaurantUI);

        ArrayList<Mesa> mesas = new ArrayList<>();

        /** LOADING DATABASE **/

        mesas = Database.cargarMesas();

        /** START PROGRAM **/

        restaurantController.init();




         ArrayList<Plato> carta = new ArrayList<Plato>();

        /** CREATING OBJECTS **/

        RestaurantView restaurantUI = new RestaurantView();

        System.out.println("Bienvenido: Escoja la opcion que desea realizar:" +
                "\t\n1. Comandas" +
                "\t\n2. Recibir mesa"+
                "\t\n3. ");

        ArrayList<Plato> primeros = new ArrayList<Plato>();
        primeros.add(new Plato("Ensalada César", "Lechuga, pollo, tomate, queso parmesano y aderezo César", 12.50f, 200));
        primeros.add(new Plato("Gazpacho", "Sopa fría de tomate, pepino, pimiento y cebolla", 8.75f, 300));
        primeros.add(new Plato("Crema de calabaza", "Sopa cremosa de calabaza, nata y especias", 9.25f, 250));
        primeros.add(new Plato("Hummus", "Puré de garbanzos, tahini, aceite de oliva y especias", 7.50f, 150));
        primeros.add(new Plato("Bruschetta", "Pan tostado con tomate, ajo, albahaca y aceite de oliva", 10.00f, 180));
        primeros.add(new Plato("Tortilla española", "Tortilla de patata, cebolla y huevo", 11.00f, 250));
        primeros.add(new Plato("Croquetas de jamón", "Croquetas de jamón ibérico con bechamel y panko", 9.50f, 200));

        ArrayList<Plato> segundos = new ArrayList<Plato>();
        segundos.add(new Plato("Solomillo a la pimienta", "Solomillo de ternera con salsa de pimienta y guarnición de verduras", 24.50f, 300));
        segundos.add(new Plato("Merluza en salsa verde", "Merluza con salsa de perejil, ajo y vino blanco y guarnición de patatas", 22.75f, 250));
        segundos.add(new Plato("Pollo al curry", "Pollo en salsa de curry con arroz basmati y verduras salteadas", 18.25f, 300));
        segundos.add(new Plato("Lasaña de verduras", "Lasaña de verduras con salsa de tomate y queso gratinado", 16.50f, 250));
        segundos.add(new Plato("Canelones de carne", "Canelones rellenos de carne y bechamel, gratinados con queso", 17.75f, 300));
        segundos.add(new Plato("Paella mixta", "Arroz con marisco y carne, cocinado con azafrán y pimiento rojo", 23.50f, 350));

        ArrayList<Plato> postres = new ArrayList<Plato>();
        postres.add(new Plato("Tarta de queso", "Tarta de queso al horno con base de galleta y mermelada de frutos rojos", 7.50f, 150));
        postres.add(new Plato("Crema catalana", "Crema pastelera con caramelo quemado por encima", 6.75f, 120));
        postres.add(new Plato("Helado de vainilla", "Helado de vainilla con sirope de chocolate", 4.50f, 100));
        postres.add(new Plato("Coulant de chocolate", "Bizcocho de chocolate relleno de chocolate líquido, servido caliente", 8.25f, 150));


        carta.addAll(primeros);
        carta.addAll(segundos);
        carta.addAll(postres);

        menuAjustes(restaurantUI, primeros, segundos, postres, carta);

    }
    public static void menuAjustes(RestaurantView restaurantUI,   ArrayList<Plato> primeros, ArrayList<Plato> segundos,ArrayList<Plato> postres,ArrayList<Plato> carta){
        Scanner llegir = new Scanner(System.in);
        int opcio = Utilities.llegirInt("Escoja una opcion: " +
                "\t\n1. Añadir plato" +
                "\t\n2. Añadir bebida" +
                "\t\n3 Editar plato" +
                "\t\n4. Editar bebida", 1,4);

        }



    public void añadirPlato(RestaurantView restaurantUI,  ArrayList<Plato> primeros,ArrayList<Plato> segundos,ArrayList<Plato> postres,ArrayList<Plato> carta){

        String nombre = Utilities.llegirString("Introduzca el nombre del nuevo plato: ");
        String descripcion = Utilities.llegirString("Introduzca una descirpcion del plato");
        float precio = Utilities.llegirFloat("Introduce el precio del plato",0, 100);
        float peso = Utilities.llegirFloat("Introduce el peso del plato", 0, 2000);
        Plato nuevo = new Plato(nombre, descripcion, precio, peso);
        carta.add(nuevo);

        String respuesta = Utilities.llegirString("Plato correctamente añadido, quieres añadirlo al menu? (yes/no)");
        if (respuesta.toLowerCase()== "yes") {
            int opcio = Utilities.llegirInt("Escoja la opcion:" +
                    "\t\n1. Primer plato" +
                    "\t\n2. Segundo plato" +
                    "\t\n3. Postre ", 1, 3);

            switch (opcio) {
                case 1:
                    primeros.add(nuevo);
                    break;
                case 2:
                    segundos.add(nuevo);
                    break;
                case 3:
                    postres.add(nuevo);
                    break;
            }
        }
        }
    }

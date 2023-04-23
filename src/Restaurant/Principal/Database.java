package Restaurant.Principal;

import Restaurant.Model.*;

import java.util.ArrayList;

import static Restaurant.Model.EstadoComanda.*;

public class Database {

    public static ArrayList<Comanda> cargarComandas () {

        ArrayList<Comanda> comandas = new ArrayList<>();
        ArrayList<Plato> platos = new ArrayList<>();
        ArrayList<Bebida> bebidas = new ArrayList<>();
        comandas.add(new Comanda(1, platos, bebidas, RECIBIDO));

        return comandas;
    }

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
    public static ArrayList<Plato> cargarPrimeros(){
        ArrayList<Plato> primeros = new ArrayList<Plato>();
        primeros.add(new Plato( 1, "Ensalada César", "Lechuga, pollo, tomate, queso parmesano y aderezo César", 12.50f, 200));
        primeros.add(new Plato(2, "Gazpacho", "Sopa fría de tomate, pepino, pimiento y cebolla", 8.75f, 300));
        primeros.add(new Plato(3, "Crema de calabaza", "Sopa cremosa de calabaza, nata y especias", 9.25f, 250));
        primeros.add(new Plato(4, "Hummus", "Puré de garbanzos, tahini, aceite de oliva y especias", 7.50f, 150));
        primeros.add(new Plato(5, "Bruschetta", "Pan tostado con tomate, ajo, albahaca y aceite de oliva", 10.00f, 180));
        primeros.add(new Plato(6, "Tortilla española", "Tortilla de patata, cebolla y huevo", 11.00f, 250));
        primeros.add(new Plato(7, "Croquetas de jamón", "Croquetas de jamón ibérico con bechamel y panko", 9.50f, 200));
        return primeros;

    }
    public static ArrayList<Plato> cargarSegundos (){
        ArrayList<Plato> segundos = new ArrayList<Plato>();
        segundos.add(new Plato(8, "Solomillo a la pimienta", "Solomillo de ternera con salsa de pimienta y guarnición de verduras", 24.50f, 300));
        segundos.add(new Plato(9, "Merluza en salsa verde", "Merluza con salsa de perejil, ajo y vino blanco y guarnición de patatas", 22.75f, 250));
        segundos.add(new Plato(10, "Pollo al curry", "Pollo en salsa de curry con arroz basmati y verduras salteadas", 18.25f, 300));
        segundos.add(new Plato(11, "Lasaña de verduras", "Lasaña de verduras con salsa de tomate y queso gratinado", 16.50f, 250));
        segundos.add(new Plato(12, "Canelones de carne", "Canelones rellenos de carne y bechamel, gratinados con queso", 17.75f, 300));
        segundos.add(new Plato(13, "Paella mixta", "Arroz con marisco y carne, cocinado con azafrán y pimiento rojo", 23.50f, 350));
        return segundos;
    }

    public static ArrayList<Plato> cargarPostres (){
        ArrayList<Plato> postres = new ArrayList<Plato>();
        postres.add(new Plato(14, "Tarta de queso", "Tarta de queso al horno con base de galleta y mermelada de frutos rojos", 7.50f, 150));
        postres.add(new Plato(15, "Crema catalana", "Crema pastelera con caramelo quemado por encima", 6.75f, 120));
        postres.add(new Plato(16, "Helado de vainilla", "Helado de vainilla con sirope de chocolate", 4.50f, 100));
        postres.add(new Plato(17, "Coulant de chocolate", "Bizcocho de chocolate relleno de chocolate líquido, servido caliente", 8.25f, 150));
        return postres;
    }
    public static ArrayList<Plato> cargarCarta (){
       ArrayList<Plato> carta = new ArrayList<>();
        carta.addAll(Database.cargarPrimeros());
        carta.addAll(Database.cargarSegundos());
        carta.addAll(Database.cargarPostres());
        return carta;
    }
    public static ArrayList<Bebida> cargarBebida () {
        ArrayList<Bebida> Bebida = new ArrayList<>();
        Bebida.add(new Bebida(1, "Coca-Cola", "Refresco de cola", 1.5f, 330));
        Bebida.add( new Bebida(2, "Sprite", "Refresco de lima-limón", 1.5f, 330));
        Bebida.add( new Bebida(3, "Fanta Naranja", "Refresco de naranja", 1.5f, 330));
        Bebida.add( new Bebida(4, "Agua Mineral", "Agua sin gas", 1.0f, 500));
        Bebida.add( new Bebida(5, "Agua con gas", "Agua con gas", 1.2f, 500));
        Bebida.add( new Bebida(6, "Té Helado", "Té con sabor a limón", 1.8f, 500));
        Bebida.add( new Bebida(7, "Zumo de Naranja", "Zumo de naranja natural", 2.0f, 250));
        Bebida.add( new Bebida(8, "Zumo de Piña", "Zumo de piña natural", 2.0f, 250));
        return Bebida;
    }
}

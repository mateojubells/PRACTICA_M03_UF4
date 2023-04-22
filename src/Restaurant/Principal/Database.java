package Restaurant.Principal;

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
    public static ArrayList<Plato> cargarPrimeros(){
        ArrayList<Plato> primeros = new ArrayList<Plato>();
        primeros.add(new Plato("Ensalada César", "Lechuga, pollo, tomate, queso parmesano y aderezo César", 12.50f, 200));
        primeros.add(new Plato("Gazpacho", "Sopa fría de tomate, pepino, pimiento y cebolla", 8.75f, 300));
        primeros.add(new Plato("Crema de calabaza", "Sopa cremosa de calabaza, nata y especias", 9.25f, 250));
        primeros.add(new Plato("Hummus", "Puré de garbanzos, tahini, aceite de oliva y especias", 7.50f, 150));
        primeros.add(new Plato("Bruschetta", "Pan tostado con tomate, ajo, albahaca y aceite de oliva", 10.00f, 180));
        primeros.add(new Plato("Tortilla española", "Tortilla de patata, cebolla y huevo", 11.00f, 250));
        primeros.add(new Plato("Croquetas de jamón", "Croquetas de jamón ibérico con bechamel y panko", 9.50f, 200));
        return primeros;

    }
    public static ArrayList<Plato> cargarSegundos (){
        ArrayList<Plato> segundos = new ArrayList<Plato>();
        segundos.add(new Plato("Solomillo a la pimienta", "Solomillo de ternera con salsa de pimienta y guarnición de verduras", 24.50f, 300));
        segundos.add(new Plato("Merluza en salsa verde", "Merluza con salsa de perejil, ajo y vino blanco y guarnición de patatas", 22.75f, 250));
        segundos.add(new Plato("Pollo al curry", "Pollo en salsa de curry con arroz basmati y verduras salteadas", 18.25f, 300));
        segundos.add(new Plato("Lasaña de verduras", "Lasaña de verduras con salsa de tomate y queso gratinado", 16.50f, 250));
        segundos.add(new Plato("Canelones de carne", "Canelones rellenos de carne y bechamel, gratinados con queso", 17.75f, 300));
        segundos.add(new Plato("Paella mixta", "Arroz con marisco y carne, cocinado con azafrán y pimiento rojo", 23.50f, 350));
        return segundos;
    }

    public static ArrayList<Plato> cargarPostres (){
        ArrayList<Plato> postres = new ArrayList<Plato>();
        postres.add(new Plato("Tarta de queso", "Tarta de queso al horno con base de galleta y mermelada de frutos rojos", 7.50f, 150));
        postres.add(new Plato("Crema catalana", "Crema pastelera con caramelo quemado por encima", 6.75f, 120));
        postres.add(new Plato("Helado de vainilla", "Helado de vainilla con sirope de chocolate", 4.50f, 100));
        postres.add(new Plato("Coulant de chocolate", "Bizcocho de chocolate relleno de chocolate líquido, servido caliente", 8.25f, 150));
        return postres;
    }
    public static ArrayList<Plato> cargarCarta (ArrayList<Plato> cargarPrimeros, ArrayList<Plato> cargarSegundos, ArrayList<Plato> cargarPostres){
       ArrayList<Plato> carta = new ArrayList<>();
        carta.addAll(cargarPrimeros);
        carta.addAll(cargarSegundos);
        carta.addAll(cargarPostres);
        return carta;
    }
    public static ArrayList<Bebida> cargarBebida () {
        ArrayList<Bebida> Bebida = new ArrayList<>();
        Bebida.add(new Bebida("Coca-Cola", "Refresco de cola", 1.5f, 330));
        Bebida.add( new Bebida("Sprite", "Refresco de lima-limón", 1.5f, 330));
        Bebida.add( new Bebida("Fanta Naranja", "Refresco de naranja", 1.5f, 330));
        Bebida.add( new Bebida("Agua Mineral", "Agua sin gas", 1.0f, 500));
        Bebida.add( new Bebida("Agua con gas", "Agua con gas", 1.2f, 500));
        Bebida.add( new Bebida("Té Helado", "Té con sabor a limón", 1.8f, 500));
        Bebida.add( new Bebida("Zumo de Naranja", "Zumo de naranja natural", 2.0f, 250));
        Bebida.add( new Bebida("Zumo de Piña", "Zumo de piña natural", 2.0f, 250));
        return Bebida;
    }




    }

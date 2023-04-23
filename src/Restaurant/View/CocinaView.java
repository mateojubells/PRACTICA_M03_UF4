package Restaurant.View;

import Restaurant.Controller.ComandaController;
import Restaurant.Controller.RestaurantController;
import Restaurant.Model.Bebida;
import Restaurant.Model.Comanda;
import Restaurant.Model.EstadoComanda;
import Restaurant.Model.Plato;
import Restaurant.Principal.Database;
import Restaurant.Utils.Utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class CocinaView {

    public static void añadirPlato( ){

        boolean opcionCorrecte = true;
        int opcio = 0;
        String nombre = Utilities.llegirString("Introduzca el nombre del nuevo plato: ");
        String descripcion = Utilities.llegirString("Introduzca una descirpcion del plato: ");
        float precio = Utilities.llegirFloat("Introduce el precio del plato: ",0, 100);
        float peso = Utilities.llegirFloat("Introduce el peso del plato: ", 0, 2000);
        Plato nuevo = new Plato(Database.cargarBebida().size()+1,nombre, descripcion, precio, peso);
        Database.cargarCarta().add(nuevo);

        String respuesta = Utilities.llegirString("Plato correctamente añadido, quieres añadirlo al menu? (yes/no)");

            do {
            if (respuesta.toLowerCase().equals("yes") ) {
                opcio = Utilities.llegirInt("Escoja la opcion:" +
                        "\t\n1. Primer plato" +
                        "\t\n2. Segundo plato" +
                        "\t\n3. Postre ", 1, 3);
            } else if (respuesta.toLowerCase().equals("no")){
                System.out.println("Ha seleccionado no añadir el plato al menu");
            } else {
                opcionCorrecte = false;
                respuesta = Utilities.llegirString("Opcion invalida, introduzca un valor correcto (yes/no): ");
            }
        }while (opcionCorrecte==false);
        switch (opcio) {
            case 1:
                Database.cargarPrimeros().add(nuevo);
                break;
            case 2:
                Database.cargarSegundos().add(nuevo);
                break;
            case 3:
                Database.cargarPostres().add(nuevo);
                break;
        }
    }
    public static void añadirBebida(){
        boolean opcionCorrecte = true;
        int opcio = 0;
        String nombre = Utilities.llegirString("Introduzca el nombre de la nueva bebida ");
        String descripcion = Utilities.llegirString("Introduzca una descirpcion de la bebida");
        float precio = Utilities.llegirFloat("Introduce el precio de la bebida",0, 100);
        float centilitros = Utilities.llegirFloat("Introduce los centilitros que tiene la bebida", 0, 2000);
        Bebida nueva = new Bebida(Database.cargarBebida().size()+1,nombre, descripcion, precio, centilitros);
        Database.cargarBebida();
        System.out.println("Bebida correctamente añadida.");


        }
    public static ArrayList<Plato> editarPlato(){
        Plato platoseleccionado = null;
        int numero = 0;

        System.out.println(Database.cargarCarta());

        int idplato = Utilities.llegirInt("Introduce el id del plato que quieres editar: ", 1, Database.cargarCarta().size());
        for (Plato plato: Database.cargarCarta()){
            if (plato.getId() == idplato){
                numero = Database.cargarBebida().indexOf(plato);
                platoseleccionado = plato;
                System.out.println("\nEl plato a ediar es el siguiente: \n"+platoseleccionado);
                break;
            }
        }
        String nuevoNombre = Utilities.llegirString("Introduce el nuevo nombre del plato: ");
        String nuevaDescripcion = Utilities.llegirString("Introduce la descripción del plato ");
        float precioNuevo = Utilities.llegirFloat("Introduce el precio del plato: ",0, 2000);
        float pesoNuevo = Utilities.llegirFloat("Introduce el peso del plato", 0, 2000);
        Plato actualizacion = new Plato(idplato, nuevoNombre, nuevaDescripcion, precioNuevo, pesoNuevo);
        platoseleccionado = actualizacion;
        Database.cargarCarta().remove(idplato);
        Database.cargarCarta().add(actualizacion);
        return Database.cargarCarta();
    }
    public static void editarBebida(){
        Bebida bebidaSeleccionada = null;
        int numero = 0;

        System.out.println(Database.cargarBebida());

        int idbebida = Utilities.llegirInt("Introduce el id de la bebida que quieres editar: ", 1, Database.cargarCarta().size());
        for (Bebida bebida: Database.cargarBebida()){
            if (bebida.getId() == idbebida){
                numero = Database.cargarBebida().indexOf(bebida);
                bebidaSeleccionada = bebida;
                System.out.println("\nLa bebida a editar es la siguiente: \n"+bebidaSeleccionada);
                break;
            }
        }
        String nuevoNombre = Utilities.llegirString("Introduce el nuevo nombre de la bebida: ");
        String nuevaDescripcion = Utilities.llegirString("Introduce la descripción de la bebida ");
        Float precioNuevo = Utilities.llegirFloat("Introduce el precio de la bebida: ",0, 2000);
        Float pesoNuevo = Utilities.llegirFloat("Introduce el precio de la bebida", 0, 2000);
        Bebida actualizacion = new Bebida(idbebida, nuevoNombre, nuevaDescripcion, precioNuevo, pesoNuevo);
        bebidaSeleccionada = actualizacion;
        Database.cargarBebida().set(numero, bebidaSeleccionada);
    }
    public static void modificarComanda(){
        Comanda comandatemporal = null;
        int numero = 0;
        ComandaController.verComandas();
        int idComanda = Utilities.llegirInt("Introduce el id de la comanda que quiere editar?", 1,Database.cargarComandas().size());

        for (Comanda comanda : Database.cargarComandas()){
            if (comanda.getIdComanda() == idComanda){
                numero = Database.cargarBebida().indexOf(comanda);
                comandatemporal = comanda;
            }
        }
        System.out.println("L'estat actual de la comanda es: "+ comandatemporal.getPreparado());

        int opcionEstado = Utilities.llegirInt("En que estado quieres mover la comanda?: " +
                "    1. RECIBIDO,\n" +
                "    2. PREPARANDO,\n" +
                "    3. HECHO,\n" +
                "    4. ENTREGADO,\n" +
                "    5. CANCELADO", 1, 5);
        EstadoComanda estado = null;

        switch (opcionEstado){
            case 1:
            estado = EstadoComanda.RECIBIDO;
            break;
             case 2:
            estado = EstadoComanda.PREPARANDO;
            break;
             case 3:
            estado = EstadoComanda.HECHO;
            break;
             case 4:
            estado = EstadoComanda.ENTREGADO;
            break;
             case 5:
            estado = EstadoComanda.CANCELADO;
            break;
        }
        Comanda actualizacion = new Comanda(comandatemporal.getIdComanda(), comandatemporal.getPlatos(), comandatemporal.getBebidas(), estado);
        Database.cargarComandas().set(numero, actualizacion);
    }}






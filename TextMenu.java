package ejercicios_array;

public class TextMenu {
    public static void main(String[] args) {
        // Crear un objeto de la clase Menu
        menu menu = new menu();

        // Añadir opciones al menú
        menu.creaOpcion("Opción 1: Ver información");
        menu.creaOpcion("Opción 2: Realizar operación");
        menu.creaOpcion("Opción 3: Salir");

        // Mostrar el menú
        menu.muestraMenu();

        // Capturar la opción seleccionada por el usuario
        int opcionSeleccionada = menu.capturaOpcion();

        // Mostrar la opción seleccionada
        System.out.println("Has seleccionado la opción: " + opcionSeleccionada);
    }
}


package ejercicios_array;
import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    // Atributo: ArrayList de String que contiene las opciones del menú
    private ArrayList<String> opciones;

    // Constructor: Inicializa el ArrayList de opciones
    public menu() {
        opciones = new ArrayList<>();
    }

    // Método para crear una nueva opción y añadirla al menú
    public void creaOpcion(String opcion) {
        opciones.add(opcion);
    }

    // Método para mostrar todas las opciones del menú
    public void muestraMenu() {
        System.out.println("Selecciona una opción:");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println((i + 1) + ". " + opciones.get(i));
        }
    }

    // Método para capturar la opción seleccionada por el usuario
    public int capturaOpcion() {
        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada = -1;

        // Asegura que la opción seleccionada esté dentro del rango válido
        while (opcionSeleccionada < 1 || opcionSeleccionada > opciones.size()) {
            System.out.print("Introduce una opción válida: ");
            if (scanner.hasNextInt()) {
                opcionSeleccionada = scanner.nextInt();
            } else {
                scanner.next(); // Limpia el buffer si se introduce un valor no numérico
            }
        }
        return opcionSeleccionada;
    }
}

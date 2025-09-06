/*
 * Clase Configuracion
 * Representa la sección de configuración del menú principal.
 * Permite al usuario modificar datos personales y preferencias.
 * Ejemplo de adaptación a POO con comentarios detallados.
 */
import java.util.Scanner;

public class Configuracion {
    // Atributos para almacenar datos de configuración
    private Usuario usuario; // Referencia al usuario actual
    private Scanner scanner;

    // Constructor: recibe el usuario actual y el scanner para entrada
    public Configuracion(Usuario usuario, Scanner scanner) {
        this.usuario = usuario;
        this.scanner = scanner;
    }

    // Método principal para mostrar la sección de configuración
    // Atributos para configuración extra
    private boolean notificaciones = true; // Estado de notificaciones (activadas por defecto)
    private String idioma = "Español";    // Idioma por defecto

    /**
     * Muestra el menú principal de configuración y permite navegar entre submenús.
     * Cada submenú tiene opciones específicas para editar datos o preferencias.
     */
    public void mostrarConfiguracion() {
        System.out.println("\nConfiguración:");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Perfil");
        System.out.println("2. Datos");
        System.out.println("3. Otros");
        int opcionConfiguracion = pedirOpcion(1, 3);

        switch (opcionConfiguracion) {
            case 1:
                mostrarPerfil();
                break;
            case 2:
                mostrarDatos();
                break;
            case 3:
                mostrarOtros();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    /**
     * Submenú Perfil: muestra los datos y permite cambiar el nombre de usuario.
     */
    private void mostrarPerfil() {
        System.out.println("\n--- Perfil ---");
        System.out.println("Nombre de usuario: " + usuario.getNombre());
        System.out.println("Edad: " + usuario.getEdad());
        System.out.println("Carrera: " + usuario.getCarrera());
        System.out.println("Nickname: " + usuario.getNickname());
        System.out.println("¿Desea cambiar el nombre de usuario?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        int opcion = pedirOpcion(1, 2);
        if (opcion == 1) {
            System.out.print("Ingrese el nuevo nombre de usuario: ");
            String nuevoNombre = scanner.nextLine();
            usuario.setNombre(nuevoNombre); // Usamos el setter
            System.out.println("Nombre de usuario actualizado correctamente.");
        }
    }

    /**
     * Submenú Datos: muestra datos institucionales y permite cambiar el teléfono.
     */
    private void mostrarDatos() {
        System.out.println("\n--- Datos ---");
        System.out.println("Correo institucional: " + usuario.getNombre() + "@cesde.net");
        System.out.println("Teléfono: +57 " + usuario.getTelefono());
        System.out.println("¿Desea cambiar el número de teléfono?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        int opcion = pedirOpcion(1, 2);
        if (opcion == 1) {
            System.out.print("Ingrese el nuevo número de teléfono: ");
            while (!scanner.hasNextLong()) {
                System.out.println("Por favor ingrese un número válido.");
                scanner.nextLine();
            }
            long nuevoTelefono = scanner.nextLong();
            scanner.nextLine();
            usuario.setTelefono(nuevoTelefono); // Usamos el setter
            System.out.println("Número de teléfono actualizado correctamente.");
        }
    }

    /**
     * Submenú Otros: permite activar/desactivar notificaciones y cambiar idioma.
     */
    private void mostrarOtros() {
        System.out.println("\n--- Otros ---");
        System.out.println("Notificaciones: " + (notificaciones ? "Activadas" : "Desactivadas"));
        System.out.println("Idioma: " + idioma);
        System.out.println("1. Activar/Desactivar notificaciones");
        System.out.println("2. Cambiar idioma");
        System.out.println("3. Volver");
        int opcion = pedirOpcion(1, 3);
        switch (opcion) {
            case 1:
                notificaciones = !notificaciones;
                System.out.println("Estado de notificaciones actualizado: " + (notificaciones ? "Activadas" : "Desactivadas"));
                break;
            case 2:
                System.out.println("Seleccione idioma:");
                System.out.println("1. Español");
                System.out.println("2. Inglés");
                int idiomaOpcion = pedirOpcion(1, 2);
                idioma = (idiomaOpcion == 1) ? "Español" : "Inglés";
                System.out.println("Idioma actualizado a: " + idioma);
                break;
            case 3:
                // Volver al menú anterior
                break;
        }
    }

    /**
     * Método auxiliar para pedir una opción numérica válida entre min y max.
     * Valida la entrada y repite hasta que el usuario ingrese un número correcto.
     */
    private int pedirOpcion(int min, int max) {
        int opcion = -1;
        boolean valido = false;
        while (!valido) {
            System.out.print("Opción: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
                if (opcion >= min && opcion <= max) {
                    valido = true;
                } else {
                    System.out.println("Por favor ingrese un número entre " + min + " y " + max + ".");
                }
            } else {
                System.out.println("Por favor ingrese un número válido.");
                scanner.nextLine();
            }
        }
        return opcion;
    }
}

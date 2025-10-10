package com.focusapp.core.ui;

import com.focusapp.core.model.Usuario;
import java.util.Scanner;

/*
 * Clase Configuracion
 * -------------------
 * Esta clase simula la sección de configuración de la app. Está pensada para
 * ejecutarse en consola y muestra cómo organizar menús y sub-menús.
 *
 * Aquí explicamos línea a línea (o bloque a bloque) lo que hace cada parte.
 */
public class Configuracion {
    // Referencia al usuario actual (asociación entre objetos)
    private Usuario usuario;
    // Scanner para leer entrada desde consola
    private Scanner scanner;
    // Estado interno de la configuración: notificaciones e idioma
    private boolean notificaciones = true;
    private String idioma = "Español";

    // Constructor: inyectamos el usuario y el scanner
    public Configuracion(Usuario usuario, Scanner scanner) {
        this.usuario = usuario;
        this.scanner = scanner;
    }

    // Mostrar menú principal de configuración
    public void mostrarConfiguracion() {
        System.out.println("\nConfiguracion:");
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Perfil");
        System.out.println("2. Datos");
        System.out.println("3. Otros");
        int opcionConfiguracion = pedirOpcion(1, 3);

        switch (opcionConfiguracion) {
            case 1: mostrarPerfil(); break; // si el usuario elige 'Perfil'
            case 2: mostrarDatos(); break;  // si elige 'Datos'
            case 3: mostrarOtros(); break;  // si elige 'Otros'
            default: System.out.println("Opcion no valida.");
        }
    }

    // Mostrar información de perfil y permitir cambiar el nombre
    private void mostrarPerfil() {
        System.out.println("\n--- Perfil ---");
        System.out.println("Nombre de usuario: " + usuario.getNombre());
        System.out.println("Edad: " + usuario.getEdad());
        System.out.println("Carrera: " + usuario.getCarrera());
        System.out.println("Nickname: " + usuario.getNickname());
        System.out.println("Desea cambiar el nombre de usuario?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int opcion = pedirOpcion(1, 2);
        if (opcion == 1) {
            System.out.print("Ingrese el nuevo nombre de usuario: ");
            String nuevoNombre = scanner.nextLine();
            // Usamos el setter del objeto Usuario (principio de encapsulación)
            usuario.setNombre(nuevoNombre);
            System.out.println("Nombre de usuario actualizado correctamente.");
        }
    }

    // Mostrar datos institucionales y permitir cambiar teléfono
    private void mostrarDatos() {
        System.out.println("\n--- Datos ---");
        System.out.println("Correo institucional: " + usuario.getNombre() + "@cesde.net");
        System.out.println("Telefono: +57 " + usuario.getTelefono());
        System.out.println("Desea cambiar el numero de telefono?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int opcion = pedirOpcion(1, 2);
        if (opcion == 1) {
            System.out.print("Ingrese el nuevo numero de telefono: ");
            while (!scanner.hasNextLong()) {
                System.out.println("Por favor ingrese un numero valido.");
                scanner.nextLine();
            }
            long nuevoTelefono = scanner.nextLong();
            scanner.nextLine();
            usuario.setTelefono(nuevoTelefono);
            System.out.println("Numero de telefono actualizado correctamente.");
        }
    }

    // Sub-menú para otras preferencias (notificaciones, idioma)
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
                notificaciones = !notificaciones; // alterna el estado de las notificaciones
                System.out.println("Estado de notificaciones actualizado: " + (notificaciones ? "Activadas" : "Desactivadas"));
                break;
            case 2:
                System.out.println("Seleccione idioma:");
                System.out.println("1. Espanol");
                System.out.println("2. Ingles");
                int idiomaOpcion = pedirOpcion(1, 2);
                idioma = (idiomaOpcion == 1) ? "Espanol" : "Ingles";
                System.out.println("Idioma actualizado a: " + idioma);
                break;
            case 3: break; // volver al menú anterior
        }
    }

    // Método auxiliar para pedir una opción entre min y max (validación de entrada)
    private int pedirOpcion(int min, int max) {
        int opcion = -1;
        boolean valido = false;
        while (!valido) {
            System.out.print("Opcion: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
                if (opcion >= min && opcion <= max) {
                    valido = true;
                } else {
                    System.out.println("Por favor ingrese un numero entre " + min + " y " + max + ".");
                }
            } else {
                System.out.println("Por favor ingrese un numero valido.");
                scanner.nextLine();
            }
        }
        return opcion;
    }
}

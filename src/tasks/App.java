package tasks;

import tasks.controllers.UsuarioController;

/*
 * Demo didáctica - App
 * ---------------------
 * Esta clase demuestra cómo un "cliente" (aquí la función main) puede usar el
 * controller para interactuar con la aplicación en memoria.
 *
 * Ejecutar esta clase desde tu IDE para ver el flujo: App -> Controller -> UseCase -> DataSource
 */
public class App {
    public static void main(String[] args) {
        UsuarioController controller = new UsuarioController();

        System.out.println("Lista inicial de usuarios:");
        controller.all().forEach(u -> System.out.println("- " + u.getNombre() + " (" + u.getNickname() + ")"));

        System.out.println("\nCreando un nuevo usuario via controller...");
        controller.create("nuevo", "pass", "nuevonick", 18, 3000000123L, "CarreraX");

        System.out.println("\nLista actualizada:");
        controller.all().forEach(u -> System.out.println("- " + u.getNombre() + " (" + u.getNickname() + ")"));
    }
}

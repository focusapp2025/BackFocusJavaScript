package tasks;

import tasks.models.Usuario;
import tasks.datasource.UsuarioDataSource;
import tasks.useCases.UsuarioUseCase;

/**
 * TesterFocusApp
 * ================
 * Pequeño runner para probar la estructura didáctica de "tasks".
 * Ejecuta operaciones CRUD en memoria para Usuario y muestra resultados en consola.
 */
public class TesterFocusApp {
    public static void main(String[] args) {
        System.out.println("== TesterFocusApp: iniciando pruebas didácticas ==");

        // Crear datasource y usecase (en memoria)
        UsuarioDataSource ds = new UsuarioDataSource();
        UsuarioUseCase uc = new UsuarioUseCase(ds);

        // Crear y añadir usuarios de ejemplo
        Usuario u1 = new Usuario("andres", "123", "andresnick", 20, 3000000000L, "Ingenieria");
        Usuario u2 = new Usuario("juan", "abc", "juanny", 21, 3120000000L, "Sistemas");

        uc.create(u1);
        uc.create(u2);

        // Listar
        System.out.println("Usuarios después de crear:");
        System.out.println(uc.all());

        // Actualizar el segundo usuario
        Usuario u2mod = new Usuario("juan", "abc", "juanny-mod", 22, 3120000001L, "Sistemas");
        uc.update(1, u2mod);
        System.out.println("Usuarios después de actualizar índice 1:");
        System.out.println(uc.all());

        // Eliminar el primero
        uc.delete(0);
        System.out.println("Usuarios después de eliminar índice 0:");
        System.out.println(uc.all());

        System.out.println("== TesterFocusApp: pruebas finalizadas ==");
    }
}

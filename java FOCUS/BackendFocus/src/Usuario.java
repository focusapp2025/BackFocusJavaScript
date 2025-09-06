// Clase que representa un usuario en la aplicación Focus App
public class Usuario {
    // Nombre del usuario
    String nombre;
    // Email del usuario
    String email;
    // Indica si el usuario es administrador
    boolean esAdmin;

    /**
     * Constructor para usuario normal
     * @param nombre Nombre del usuario
     * @param email Email del usuario
     */
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.esAdmin = false;
    }

    /**
     * Constructor para usuario administrador
     * @param nombre Nombre del usuario
     * @param email Email del usuario
     * @param esAdmin true si es administrador
     */
    public Usuario(String nombre, String email, boolean esAdmin) {
        this.nombre = nombre;
        this.email = email;
        this.esAdmin = esAdmin;
    }

    /**
     * Muestra los datos del usuario por consola
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        if (esAdmin) {
            System.out.println("Tipo: Administrador");
        } else {
            System.out.println("Tipo: Usuario normal");
        }
    }

    /**
     * Cambia el email del usuario
     * @param nuevoEmail Nuevo email
     */
    public void cambiarEmail(String nuevoEmail) {
        this.email = nuevoEmail;
    }

    /**
     * Indica si el usuario es administrador
     * @return true si es administrador
     */
    public boolean esAdministrador() {
        return esAdmin;
    }
}

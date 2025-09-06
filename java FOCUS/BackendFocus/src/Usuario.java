// Clase que representa un usuario en la aplicación Focus App
public class Usuario {
    // Nombre del usuario
    private String nombre;
    // Contraseña del usuario
    private String clave;
    // Nickname del usuario
    private String nickname;
    // Edad del usuario
    private int edad;
    // Teléfono del usuario
    private long telefono;
    // Carrera del usuario
    private String carrera;
    // Email del usuario
    private String email;
    // Indica si el usuario es administrador
    private boolean esAdmin;

    /**
     * Constructor completo para usuario
     */
    public Usuario(String nombre, String clave, String nickname, int edad, long telefono, String carrera) {
        this.nombre = nombre;
        this.clave = clave;
        this.nickname = nickname;
        this.edad = edad;
        this.telefono = telefono;
        this.carrera = carrera;
        this.email = nombre + "@email.com"; // Email por defecto
        this.esAdmin = false;
    }

    /**
     * Constructor para usuario con email y admin
     */
    public Usuario(String nombre, String email, boolean esAdmin) {
        this.nombre = nombre;
        this.email = email;
        this.esAdmin = esAdmin;
        this.clave = "";
        this.nickname = "";
        this.edad = 0;
        this.telefono = 0;
        this.carrera = "";
    }

    // Método para validar el inicio de sesión
    public boolean iniciarSesion(String nombre, String clave) {
        return this.nombre.equals(nombre) && this.clave.equals(clave);
    }


    // Getters para los atributos
    public String getNombre() { return nombre; }
    public String getClave() { return clave; }
    public String getNickname() { return nickname; }
    public int getEdad() { return edad; }
    public long getTelefono() { return telefono; }
    public String getCarrera() { return carrera; }
    public String getEmail() { return email; }
    public boolean isAdmin() { return esAdmin; }

    // Setters para modificar nombre y teléfono
    /**
     * Permite cambiar el nombre del usuario
     */
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    /**
     * Permite cambiar el número de teléfono del usuario
     */
    public void setTelefono(long nuevoTelefono) {
        this.telefono = nuevoTelefono;
    }

    /**
     * Muestra los datos del usuario por consola
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Nickname: " + nickname);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Carrera: " + carrera);
        if (esAdmin) {
            System.out.println("Tipo: Administrador");
        } else {
            System.out.println("Tipo: Usuario normal");
        }
    }

    /**
     * Cambia el email del usuario
     */
    public void cambiarEmail(String nuevoEmail) {
        this.email = nuevoEmail;
    }

    /**
     * Indica si el usuario es administrador
     */
    public boolean esAdministrador() {
        return esAdmin;
    }
}

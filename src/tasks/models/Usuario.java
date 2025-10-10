package tasks.models; // Declaramos el paquete donde vive esta clase. Un paquete agrupa clases relacionadas.

/*
 * Clase: Usuario (explicación detallada línea a línea)
 * ---------------------------------------------------
 * En Programación Orientada a Objetos (POO) una 'clase' es como un molde o plantilla
 * que define cómo son los objetos (instancias) que crearemos a partir de ella.
 *
 * A continuación verás la definición de la clase Usuario. Leeremos cada parte para
 * entender conceptos básicos de POO: clase, atributo, constructor, encapsulación,
 * getters/setters y responsabilidad única.
 */
public class Usuario {
    private String nombre;
    private String clave;
    private String nickname;
    private int edad;
    private long telefono;
    private String carrera;

    /**
     * Constructor vacío
     * - ¿Qué hace? Crea un objeto Usuario sin inicializar sus atributos.
     * - ¿Por qué sirve? A veces queremos crear primero el objeto y rellenar
     *   sus campos después (por ejemplo, leyendo datos del usuario uno a uno).
     */
    public Usuario() {}

    /**
     * Constructor con parámetros
     * - Permite crear un Usuario y asignar todos los atributos en una sola línea.
     * - 'this.nombre = nombre' significa: asigna al atributo 'nombre' de este objeto
     *   el valor del parámetro 'nombre' que se recibió en el constructor.
     */
    public Usuario(String nombre, String clave, String nickname, int edad, long telefono, String carrera) {
        this.nombre = nombre;       // 'this' se refiere al objeto actual (la instancia)
        this.clave = clave;         // guardamos la contraseña (en producción la deberías cifrar)
        this.nickname = nickname;   // nombre corto o alias
        this.edad = edad;           // edad del usuario
        this.telefono = telefono;   // número telefónico (long porque puede ser grande)
        this.carrera = carrera;     // carrera o programa académico
    }

    // --------------------
    // Setters (mutadores)
    // --------------------
    // Los setters permiten cambiar el estado interno del objeto. Es parte de la
    // 'encapsulación', un principio de POO que dice: mantiene los datos privados
    // y proporciona métodos públicos para acceder o modificarlos.
    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setClave(String clave){ this.clave = clave; }
    public void setNickname(String nickname){ this.nickname = nickname; }
    public void setEdad(int edad){ this.edad = edad; }
    public void setTelefono(long telefono){ this.telefono = telefono; }
    public void setCarrera(String carrera){ this.carrera = carrera; }

    // --------------------
    // Getters (accesores)
    // --------------------
    // Los getters permiten leer los valores de los atributos desde fuera de la clase.
    // Así controlamos el acceso a los datos, otra parte de la encapsulación.
    public String getNombre(){ return this.nombre; }
    public String getClave(){ return this.clave; }
    public String getNickname(){ return this.nickname; }
    public int getEdad(){ return this.edad; }
    public long getTelefono(){ return this.telefono; }
    public String getCarrera(){ return this.carrera; }
}

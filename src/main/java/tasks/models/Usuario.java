package tasks.models;

public class Usuario {
    private String nombre;
    private String clave;
    private String nickname;
    private int edad;
    private long telefono;
    private String carrera;

    public Usuario() {}

    public Usuario(String nombre, String clave, String nickname, int edad, long telefono, String carrera) {
        this.nombre = nombre;
        this.clave = clave;
        this.nickname = nickname;
        this.edad = edad;
        this.telefono = telefono;
        this.carrera = carrera;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public long getTelefono() { return telefono; }
    public void setTelefono(long telefono) { this.telefono = telefono; }
    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
}

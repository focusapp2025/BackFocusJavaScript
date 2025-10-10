package com.focusapp.core.model;

public class Usuario {
    private String nombre;
    private String clave;
    private String nickname;
    private int edad;
    private long telefono;
    private String carrera;
    private String email;
    private boolean esAdmin;

    public Usuario() {}

    public Usuario(String nombre, String clave, String nickname, int edad, long telefono, String carrera) {
        this.nombre = nombre;
        this.clave = clave;
        this.nickname = nickname;
        this.edad = edad;
        this.telefono = telefono;
        this.carrera = carrera;
        this.email = nombre + "@email.com";
        this.esAdmin = false;
    }

    public boolean iniciarSesion(String nombre, String clave) {
        return this.nombre != null && this.nombre.equals(nombre) && this.clave != null && this.clave.equals(clave);
    }

    // getters and setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getClave() { return clave; }
    public String getNickname() { return nickname; }
    public int getEdad() { return edad; }
    public long getTelefono() { return telefono; }
    public void setTelefono(long telefono) { this.telefono = telefono; }
    public String getCarrera() { return carrera; }
    public String getEmail() { return email; }
    public boolean isAdmin() { return esAdmin; }
}

package com.focusapp.core.entity;

import javax.persistence.*;

/*
 * UsuarioEntity
 * -------------
 * Esta clase representa la entidad JPA que se mapeará a la tabla 'usuarios' en la
 * base de datos. En POO es una clase (molde) y aquí la usamos para persistir datos.
 *
 * Comentarios por línea/bloque:
 */
@Entity // Indica a JPA/Hibernate que esta clase es una entidad persistente
@Table(name = "usuarios") // Opcional: especifica el nombre de la tabla en la BD
public class UsuarioEntity {
    // Identificador único (clave primaria)
    @Id // Marca este campo como la clave primaria en la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment en la BD
    private Long id; // Tipo Long porque los ids suelen ser números grandes

    // El nombre debe ser único y no nulo en la base de datos
    @Column(nullable = false, unique = true)
    private String nombre;

    // La clave (contraseña) es obligatoria
    @Column(nullable = false)
    private String clave;

    // Campos adicionales (opcionales)
    private String nickname; // alias del usuario
    private Integer edad;    // edad como Integer (puede ser null)
    private Long telefono;   // número telefónico
    private String carrera;  // carrera o programa del usuario
    private String email;    // correo electrónico

    // Constructor vacío: necesario para JPA (el framework crea instancias vía reflexión)
    public UsuarioEntity() {}

    // ---------------------------
    // Getters y Setters
    // ---------------------------
    // Los métodos get/set permiten acceder a los campos desde otras capas
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public Long getTelefono() { return telefono; }
    public void setTelefono(Long telefono) { this.telefono = telefono; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

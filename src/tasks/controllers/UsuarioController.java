package tasks.controllers;

import tasks.useCases.UsuarioUseCase;
import tasks.models.Usuario;

import java.util.List;

/*
 * Controller didáctico - capa de coordinación
 * -------------------------------------------
 * El controller actúa como punto de entrada para la "interfaz" (puede ser una UI,
 * o una clase demo). No contiene lógica de negocio compleja; delega en los use cases.
 *
 * En la práctica escolar, el controller sirve para mostrar cómo se usan los use cases.
 */
public class UsuarioController {
    public UsuarioUseCase usuarioUseCase;

    public UsuarioController(){ this.usuarioUseCase = new UsuarioUseCase(); }

    // Devuelve todos los usuarios
    public List<Usuario> all(){ return this.usuarioUseCase.all(); }

    // Devuelve un usuario por índice
    public Usuario findByIndex(int index){ return this.usuarioUseCase.findByIndex(index); }

    // Crea un usuario a partir de parámetros simples (útil para demos)
    public String create(String nombre, String clave, String nickname, int edad, long telefono, String carrera){
        return this.usuarioUseCase.create(new Usuario(nombre, clave, nickname, edad, telefono, carrera));
    }

    // Actualiza un usuario
    public String update(int index, String nombre, String clave, String nickname, int edad, long telefono, String carrera){
        return this.usuarioUseCase.update(index, new Usuario(nombre, clave, nickname, edad, telefono, carrera));
    }

    // Elimina un usuario por índice
    public String delete(int index){ return this.usuarioUseCase.delete(index); }
}


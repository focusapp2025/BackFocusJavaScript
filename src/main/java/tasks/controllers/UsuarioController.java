package tasks.controllers;

import tasks.useCases.UsuarioUseCase;
import tasks.models.Usuario;

import java.util.List;

public class UsuarioController {
    public UsuarioUseCase usuarioUseCase;

    public UsuarioController(){ this.usuarioUseCase = new UsuarioUseCase(); }

    public List<Usuario> all(){ return this.usuarioUseCase.all(); }
    public Usuario findByIndex(int index){ return this.usuarioUseCase.findByIndex(index); }
    public String create(String nombre, String clave, String nickname, int edad, long telefono, String carrera){
        return this.usuarioUseCase.create(new Usuario(nombre, clave, nickname, edad, telefono, carrera));
    }
    public String update(int index, String nombre, String clave, String nickname, int edad, long telefono, String carrera){
        return this.usuarioUseCase.update(index, new Usuario(nombre, clave, nickname, edad, telefono, carrera));
    }
    public String delete(int index){ return this.usuarioUseCase.delete(index); }
}

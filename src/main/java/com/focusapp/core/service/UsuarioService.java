package com.focusapp.core.service;

import com.focusapp.core.entity.UsuarioEntity;
import com.focusapp.core.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * UsuarioService
 * --------------
 * Capa de servicio: en arquitecturas bien estructuradas se usa una capa intermedia
 * entre el controlador y el repositorio. Su propósito es:
 * - Encapsular la lógica de negocio (validaciones, transformaciones, reglas).
 * - Mantener el controlador ligero (solo orquesta peticiones/respuestas).
 * - Facilitar pruebas unitarias (mockear el repo en tests del servicio).
 */
@Service
public class UsuarioService {
    private final UsuarioRepository repo; // Repositorio inyectado por Spring

    // Constructor con inyección de dependencias (Spring inyecta UsuarioRepository)
    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    // Lista todos los usuarios (READ - parte de CRUD)
    public List<UsuarioEntity> listar() { return repo.findAll(); }

    // Busca por id (READ)
    public Optional<UsuarioEntity> findById(Long id) { return repo.findById(id); }

    // Busca por nombre (READ) utilizando el método declarado en UsuarioRepository
    public Optional<UsuarioEntity> findByNombre(String nombre) { return repo.findByNombre(nombre); }

    // Guarda un usuario (CREATE o UPDATE dependiendo si tiene id)
    public UsuarioEntity guardar(UsuarioEntity u) { return repo.save(u); }

    // Actualiza un usuario existente: buscamos por id, cambiamos campos y guardamos
    // Retornamos Optional para indicar si el usuario existía o no.
    public Optional<UsuarioEntity> update(Long id, UsuarioEntity u) {
        return repo.findById(id).map(existing -> {
            // Actualizamos manualmente cada campo que queremos permitir cambiar
            existing.setNombre(u.getNombre());
            existing.setClave(u.getClave());
            existing.setNickname(u.getNickname());
            existing.setEdad(u.getEdad());
            existing.setTelefono(u.getTelefono());
            existing.setCarrera(u.getCarrera());
            existing.setEmail(u.getEmail());
            return repo.save(existing); // Guardamos los cambios
        });
    }

    // Elimina por id (DELETE)
    public void eliminar(Long id) { repo.deleteById(id); }

    // Verifica existencia por id
    public boolean existsById(Long id) { return repo.existsById(id); }
}

package com.focusapp.core.repository;

import com.focusapp.core.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/*
 * UsuarioRepository
 * -----------------
 * Repositorio JPA: es la interfaz que Spring Data usa para generar
 * automáticamente el código que accede a la base de datos.
 *
 * - Extiende JpaRepository<T, ID> donde T es la entidad y ID es el tipo de la clave primaria.
 * - Proporciona métodos listos para usar: save, findAll, findById, deleteById, etc.
 * - Podemos declarar métodos con nombres especiales (findByNombre) y Spring
 *   Data implementará la consulta por nosotros.
 */
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    // Busca un usuario por nombre (devuelve Optional para indicar que puede no existir)
    Optional<UsuarioEntity> findByNombre(String nombre);
}

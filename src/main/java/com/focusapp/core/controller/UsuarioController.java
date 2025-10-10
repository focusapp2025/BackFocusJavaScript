package com.focusapp.core.controller;

import com.focusapp.core.entity.UsuarioEntity;
import com.focusapp.core.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) { this.service = service; }

    @GetMapping
    public List<UsuarioEntity> listar() { return service.listar(); }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioEntity> getById(@PathVariable Long id) {
        Optional<UsuarioEntity> u = service.findById(id);
        return u.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/search")
    public ResponseEntity<UsuarioEntity> buscarPorNombre(@RequestParam String nombre) {
        Optional<UsuarioEntity> u = service.findByNombre(nombre);
        return u.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UsuarioEntity> crear(@RequestBody UsuarioEntity u) {
        UsuarioEntity saved = service.guardar(u);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioEntity> actualizar(@PathVariable Long id, @RequestBody UsuarioEntity u) {
        Optional<UsuarioEntity> updated = service.update(id, u);
        return updated.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (service.existsById(id)) {
            service.eliminar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

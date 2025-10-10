package com.focusapp.core.config;

import com.focusapp.core.entity.UsuarioEntity;
import com.focusapp.core.service.UsuarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final UsuarioService usuarioService;

    public DataLoader(UsuarioService usuarioService) { this.usuarioService = usuarioService; }

    @Override
    public void run(String... args) throws Exception {
        // Este método se ejecuta al arrancar la aplicación Spring Boot.
        // CommandLineRunner es una interfaz que permite ejecutar código cuando la app inicia.
        // Aquí insertamos datos de ejemplo solo si la tabla de usuarios está vacía.
        if (usuarioService.listar().isEmpty()) {
            UsuarioEntity u1 = new UsuarioEntity();
            // Seteamos campos básicos del usuario de ejemplo
            u1.setNombre("andres");
            u1.setClave("123");
            u1.setNickname("andresnick");
            u1.setEdad(20);
            u1.setTelefono(3000000000L);
            u1.setCarrera("Ingenieria");
            u1.setEmail("andres@email.com");
            // Guardamos usando el servicio (que a su vez usa el repositorio)
            usuarioService.guardar(u1);
        }
    }
}

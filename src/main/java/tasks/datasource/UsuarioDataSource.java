package tasks.datasource;

import tasks.models.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDataSource {
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioDataSource() {
        // datos de ejemplo
        usuarios.add(new Usuario("andres", "123", "andresnick", 20, 3000000000L, "Ingenieria"));
    }

    public List<Usuario> all() { return usuarios; }
    public Usuario get(int index) { return usuarios.get(index); }
    public void add(Usuario u){ usuarios.add(u); }
    public void set(int index, Usuario u){ usuarios.set(index, u); }
    public void remove(int index){ usuarios.remove(index); }
}

package tasks.useCases;

import tasks.datasource.UsuarioDataSource;
import tasks.models.Usuario;

import java.util.List;

public class UsuarioUseCase {
    private UsuarioDataSource ds;

    public UsuarioUseCase(){ this.ds = new UsuarioDataSource(); }

    public List<Usuario> all(){ return ds.all(); }
    public Usuario findByIndex(int index){ return ds.get(index); }
    public String create(Usuario u){ ds.add(u); return "Usuario creado"; }
    public String update(int index, Usuario u){ ds.set(index, u); return "Usuario actualizado"; }
    public String delete(int index){ ds.remove(index); return "Usuario eliminado"; }
}

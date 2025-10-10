package tasks.useCases;

import tasks.datasource.UsuarioDataSource;
import tasks.models.Usuario;

import java.util.List;

/*
 * UseCase didáctico - lógica de negocio
 * -------------------------------------
 * El "use case" contiene la lógica que resuelve una necesidad específica
 * (por ejemplo: crear un usuario, listar usuarios). En proyectos reales esta
 * capa se encarga de validar reglas de negocio antes de tocar la base de datos.
 *
 * En esta versión simple el UseCase delega en UsuarioDataSource para realizar
 * las operaciones básicas.
 */
public class UsuarioUseCase {
    private UsuarioDataSource ds;

    public UsuarioUseCase(){ this.ds = new UsuarioDataSource(); }

    // Devuelve la lista completa de usuarios
    public List<Usuario> all(){ return ds.all(); }

    // Devuelve un usuario por índice (posición en la lista)
    public Usuario findByIndex(int index){ return ds.get(index); }

    // Crea un usuario y devuelve un mensaje simple (en la vida real se retornaría el objeto o su id)
    public String create(Usuario u){ ds.add(u); return "Usuario creado"; }

    // Actualiza un usuario por índice
    public String update(int index, Usuario u){ ds.set(index, u); return "Usuario actualizado"; }

    // Elimina un usuario por índice
    public String delete(int index){ ds.remove(index); return "Usuario eliminado"; }
}


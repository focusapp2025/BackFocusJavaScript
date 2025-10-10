package tasks.datasource;

import tasks.models.Usuario;
import java.util.ArrayList;
import java.util.List;

/*
 * DataSource didáctico - almacenamiento en memoria
 * ------------------------------------------------
 * Esta clase simula una base de datos utilizando una lista (ArrayList).
 * Cada método corresponde a una operación básica (CRUD). A continuación
 * explicamos cada parte y algunos conceptos de POO aplicados.
 */
public class UsuarioDataSource {

    // Lista interna que mantiene los usuarios en memoria
    // - Cohesión: esta clase tiene una única responsabilidad: almacenar usuarios.
    // - Bajo acoplamiento: solo expone métodos simples para acceder/modificar la lista.
    private List<Usuario> usuarios = new ArrayList<>();

    // Constructor: se ejecuta cuando creamos una instancia de UsuarioDataSource
    // Aquí colocamos algunos usuarios de ejemplo para que la demo tenga datos.
    public UsuarioDataSource() {
        usuarios.add(new Usuario("andres", "123", "andresnick", 20, 3000000000L, "Ingenieria"));
        usuarios.add(new Usuario("maria", "abc", "mariita", 19, 3000000001L, "Sistemas"));
    }

    /**
     * all()
     * - Qué hace: devuelve la lista completa de usuarios.
     * - Uso didáctico: simula un SELECT * FROM usuarios.
     * - Nota POO: devolvemos la referencia a la lista; en proyectos más grandes
     *   podríamos retornar una copia para proteger el estado interno.
     */
    public List<Usuario> all() { return usuarios; }

    /**
     * get(index)
     * - Qué hace: devuelve el usuario ubicado en la posición 'index' de la lista.
     * - Advertencia: aquí asumimos que el índice es válido; en producción debemos validar.
     */
    public Usuario get(int index) { return usuarios.get(index); }

    /**
     * add(u)
     * - Qué hace: agrega un nuevo usuario al final de la lista.
     * - Corresponde a la operación CREATE en CRUD.
     */
    public void add(Usuario u){ usuarios.add(u); }

    /**
     * set(index, u)
     * - Qué hace: reemplaza el usuario en la posición 'index' por el nuevo objeto 'u'.
     * - Corresponde a UPDATE en CRUD.
     */
    public void set(int index, Usuario u){ usuarios.set(index, u); }

    /**
     * remove(index)
     * - Qué hace: elimina el usuario en la posición indicada.
     * - Corresponde a DELETE en CRUD.
     */
    public void remove(int index){ usuarios.remove(index); }
}

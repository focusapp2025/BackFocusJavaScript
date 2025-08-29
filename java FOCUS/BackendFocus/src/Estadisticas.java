public class Estadisticas {
    int tareasCompletadas;
    int tareasPendientes;

    public Estadisticas(int completadas, int pendientes) {
        this.tareasCompletadas = completadas;
        this.tareasPendientes = pendientes;
    }

    public void mostrarEstadisticas() {
        System.out.println("Tareas completadas: " + tareasCompletadas);
        System.out.println("Tareas pendientes: " + tareasPendientes);
    }
}

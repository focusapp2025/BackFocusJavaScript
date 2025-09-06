// Clase que representa la sección "Estadísticas" en la app Focus
// Esta clase encapsula la lógica y datos relacionados con el progreso del usuario
public class Estadisticas {
    // Atributos para tareas (puedes seguir usándolos si lo deseas)
    int tareasCompletadas;
    int tareasPendientes;

    // Atributos para porcentajes de avance en cada materia
    private int porcentajeIntro;
    private int porcentajeLogica;
    private int porcentajeAgilismo;

    // Constructor para tareas
    public Estadisticas(int completadas, int pendientes) {
        this.tareasCompletadas = completadas;
        this.tareasPendientes = pendientes;
        // Valores por defecto para porcentajes
        this.porcentajeIntro = 40;
        this.porcentajeLogica = 72;
        this.porcentajeAgilismo = 80;
    }

    // Constructor para solo porcentajes
    public Estadisticas() {
        this.porcentajeIntro = 40;
        this.porcentajeLogica = 72;
        this.porcentajeAgilismo = 80;
    }

    // Método que muestra toda la información relevante de estadísticas
    public void mostrarEstadisticas() {
        System.out.println("\n--- Estadísticas ---");
        System.out.println("Intro: " + porcentajeIntro + "%");
        System.out.println("Lógica: " + porcentajeLogica + "%");
        System.out.println("Agilismo: " + porcentajeAgilismo + "%");
        int promedio = (porcentajeIntro + porcentajeLogica + porcentajeAgilismo) / 3;
        System.out.println("Promedio general: " + promedio + "%");
    }

    // Método para mostrar tareas (si lo necesitas en otra parte)
    public void mostrarTareas() {
        System.out.println("Tareas completadas: " + tareasCompletadas);
        System.out.println("Tareas pendientes: " + tareasPendientes);
    }
}

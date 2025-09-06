// Clase que representa la sección "Metodologías ágiles de programación" en la app Focus
// Esta clase encapsula toda la lógica y datos relacionados con la materia
public class MetodologiasAgiles {
    // Atributos que representan la información de la materia
    private String profesor;
    private int progreso;
    private String proximaEntrega;

    // Constructor: inicializa los datos de la materia
    public MetodologiasAgiles() {
        this.profesor = "Juan Jose Gallego Mesa";
        this.progreso = 72; // Porcentaje de avance
        this.proximaEntrega = "Primeras 10 HU listas (M2)";
    }

    // Método que muestra toda la información relevante de la materia
    public void mostrarInformacion() {
        System.out.println("\n--- Metodologías ágiles para la programación ---");
        System.out.println("Profesor: " + profesor);
        System.out.println("Progreso: " + progreso + "%");
        System.out.println("Próxima entrega: " + proximaEntrega);
    }

    // Puedes agregar más métodos si quieres mostrar tareas, recursos, etc.
}

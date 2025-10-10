// Clase para "Introducción a la programación" en la app Focus
// Esta clase encapsula toda la lógica y datos relacionados con la materia
public class IntroduccionProgramacion {
    // Atributos que representan la información de la materia
    private String profesor;
    private int progreso;
    private String proximaEntrega;

    // Constructor: inicializa los datos de la materia
    public IntroduccionProgramacion() {
        this.profesor = "Jossy Reinaldo Tello Landazuri";
        this.progreso = 40; // Porcentaje de avance
        this.proximaEntrega = "Taller de CSS (M2)";
    }

    // Método que muestra toda la información relevante de la materia
    public void mostrarInformacion() {
        System.out.println("\n--- Introducción a la programación ---");
        System.out.println("Profesor: " + profesor);
        System.out.println("Progreso: " + progreso + "%");
        System.out.println("Próxima entrega: " + proximaEntrega);
    }

    // Puedes agregar más métodos si quieres mostrar tareas, recursos, etc.
}

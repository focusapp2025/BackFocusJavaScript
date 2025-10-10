// Clase que representa la sección "Lógica de programación" en la app Focus
// Esta clase encapsula toda la lógica y datos relacionados con la materia
import java.util.Scanner;

public class LogicaProgramacion {
    // Atributos que representan la información de la materia
    private String profesor;
    private int progreso;

    // Constructor: inicializa los datos de la materia
    public LogicaProgramacion() {
        this.profesor = "Jaime Alberto Zapata Valencia";
        this.progreso = 80; // Porcentaje de avance
    }

    // Método que muestra el menú y la información relevante de la materia
    public void mostrarMenu(Scanner sc) {
        System.out.println("\n--- Lógica de programación ---");
        System.out.println("Profesor: " + profesor);
        System.out.println("Progreso: " + progreso + "%");
        System.out.println("Seleccione una opción para ver próximas entregas:");
        System.out.println("1. momento 1");
        System.out.println("2. momento 2");
        System.out.println("3. momento 3");
        System.out.print("Opción: ");
        int opcionDeLogica = sc.nextInt();
        sc.nextLine();

        // Según la opción elegida, mostramos información específica
        switch (opcionDeLogica) {
            case 1:
                System.out.println("Ejercicios básicos de lógica, quiz de conocimiento y desempeño.");
                break;
            case 2:
                System.out.println("Quiz de conocimiento y sustentación de desempeño. Entrega evidencias de Condicionales y JAVA en el proyecto integrador");
                break;
            case 3:
                System.out.println("Tema: Aun no sabemos. Que Dios nos ampare :P");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}

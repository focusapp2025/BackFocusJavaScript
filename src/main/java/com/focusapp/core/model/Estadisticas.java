package com.focusapp.core.model;

/*
 * Clase Estadisticas (versión didáctica)
 * ------------------------------------
 * Esta clase contiene datos de ejemplo sobre el progreso del usuario en
 * las tres materias fijas. Aquí se muestran conceptos básicos:
 * - Atributos privados o package-private
 * - Constructores sobrecargados
 * - Método que calcula y muestra información derivada
 */
public class Estadisticas {
    // Atributos que representan tareas (ejemplo simple)
    int tareasCompletadas; // número de tareas terminadas
    int tareasPendientes;  // número de tareas pendientes

    // Porcentajes de avance por materia
    private int porcentajeIntro;
    private int porcentajeLogica;
    private int porcentajeAgilismo;

    // Constructor con parámetros para inicializar tareas
    public Estadisticas(int completadas, int pendientes) {
        this.tareasCompletadas = completadas;
        this.tareasPendientes = pendientes;
        // Valores por defecto para porcentajes (ejemplo)
        this.porcentajeIntro = 40;
        this.porcentajeLogica = 72;
        this.porcentajeAgilismo = 80;
    }

    // Constructor sin parámetros: asigna porcentajes por defecto
    public Estadisticas() {
        this.porcentajeIntro = 40;
        this.porcentajeLogica = 72;
        this.porcentajeAgilismo = 80;
    }

    // Método que muestra las estadísticas por consola
    // - Calcula un promedio simple a partir de los porcentajes
    // - En POO, los métodos encapsulan comportamiento relacionado con los datos
    public void mostrarEstadisticas() {
        System.out.println("\n--- Estadisticas ---");
        System.out.println("Intro: " + porcentajeIntro + "%");
        System.out.println("Logica: " + porcentajeLogica + "%");
        System.out.println("Agilismo: " + porcentajeAgilismo + "%");
        int promedio = (porcentajeIntro + porcentajeLogica + porcentajeAgilismo) / 3;
        System.out.println("Promedio general: " + promedio + "%");
    }
}

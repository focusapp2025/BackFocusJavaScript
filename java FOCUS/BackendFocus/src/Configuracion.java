public class Configuracion {
    String idioma;
    boolean notificaciones;

    public Configuracion(String idioma, boolean notificaciones) {
        this.idioma = idioma;
        this.notificaciones = notificaciones;
    }

    public void mostrarConfiguracion() {
        System.out.println("Idioma: " + idioma);
        System.out.println("Notificaciones activadas: " + notificaciones);
    }
}

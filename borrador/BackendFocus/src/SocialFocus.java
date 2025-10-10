// Clase que representa la sección "Social Focus" en la app Focus
// Esta clase encapsula la lógica y datos relacionados con la interacción social
public class SocialFocus {
    private String usuario;

    // Constructor: recibe el nombre del usuario para personalizar el mensaje
    public SocialFocus(String usuario) {
        this.usuario = usuario;
    }

    // Método que muestra la información y mensajes de Social Focus
    public void mostrarSocialFocus() {
        System.out.println("\n--- Social Focus :D ---");
        System.out.println("¡Bienvenidos a Social Focus! Comparte tus logros y dudas, es un espacio para que compartas con tu comunidad del CESDE");
        System.out.println("\nChat general:");
        System.out.println("1. DonAndres escribió: Que vamos a hacer para mañana que no hemos hecho el trabajo?? D:");
        System.out.println("2. la-divina respondió: Mijo para eso está chatGPT. LOL!");
        System.out.println("3. " + usuario + " reaccionó al mensaje de la-divina con un corazón");
    }

    // Puedes agregar más métodos para publicar mensajes, responder, etc.
}

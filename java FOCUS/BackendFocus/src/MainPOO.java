// Clase principal del proyecto orientado a objetos Focus App
public class MainPOO {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("¡Bienvenido al proyecto de Programación Orientada a Objetos!");

    // Inicio de sesión simulado con datos predefinidos
    Usuario usuario = new Usuario("UsuarioDemo", "demo@email.com");
    System.out.println("Inicio de sesión exitoso. Usuario: " + usuario.nombre);

    // Opción de registro
        boolean registroCompletado = false;
        String usuarioRegistrado = "a";
        String contrasenaRegistrada = "1";
        while (!registroCompletado) {
            String opcionRegistro = "";
            do {
                System.out.print("¿Desea registrarse con sus propios datos? (si/no): ");
                opcionRegistro = sc.nextLine().trim().toLowerCase();
            } while (!(opcionRegistro.equals("si") || opcionRegistro.equals("no") || opcionRegistro.equals("s") || opcionRegistro.equals("n")));
            if (opcionRegistro.equals("si") || opcionRegistro.equals("s")) {
                int intentos = 0;
                boolean logueado = false;
                while (intentos < 4 && !logueado) {
                    System.out.print("Ingrese el nombre de usuario para iniciar sesión (debe ser '" + usuarioRegistrado + "'): ");
                    String nombreLogin = sc.nextLine();
                    System.out.print("Ingrese la contraseña para iniciar sesión (debe ser '" + contrasenaRegistrada + "'): ");
                    String contrasenaLogin = sc.nextLine();
                    if (nombreLogin.equals(usuarioRegistrado) && contrasenaLogin.equals(contrasenaRegistrada)) {
                        System.out.println("Inicio de sesión exitoso.");
                        logueado = true;
                        registroCompletado = true;
                    } else {
                        intentos++;
                        if (intentos < 4) {
                            System.out.println("Usuario o contraseña incorrectos. Intento " + intentos + " de 3.");
                        } else {
                            System.out.println("Demasiados intentos fallidos. Volviendo al inicio de sesión.");
                        }
                    }
                }
            } else {
                // Si responde 'no', pide datos de registro y luego pide inicio de sesión con esos datos
                System.out.println("Ingrese sus datos para crear el usuario:");
                System.out.print("Nombre de usuario: ");
                usuarioRegistrado = sc.nextLine();
                System.out.print("Contraseña: ");
                contrasenaRegistrada = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                String esAdminStr = "";
                do {
                    System.out.print("¿Es administrador? (si/no): ");
                    esAdminStr = sc.nextLine().trim().toLowerCase();
                } while (!(esAdminStr.equals("si") || esAdminStr.equals("no") || esAdminStr.equals("s") || esAdminStr.equals("n")));
                boolean esAdmin = esAdminStr.equals("si") || esAdminStr.equals("s");
                usuario = new Usuario(usuarioRegistrado, email, esAdmin);
                System.out.println("Usuario creado con los datos ingresados:");
                usuario.mostrarDatos();

                // Ahora pide inicio de sesión con los datos recién ingresados
                int intentos = 0;
                boolean logueado = false;
                while (intentos < 4 && !logueado) {
                    System.out.print("Ingrese el nombre de usuario para iniciar sesión: ");
                    String nombreLogin = sc.nextLine();
                    System.out.print("Ingrese la contraseña para iniciar sesión: ");
                    String contrasenaLogin = sc.nextLine();
                    if (nombreLogin.equals(usuarioRegistrado) && contrasenaLogin.equals(contrasenaRegistrada)) {
                        System.out.println("Inicio de sesión exitoso.");
                        logueado = true;
                        registroCompletado = true;
                    } else {
                        intentos++;
                        if (intentos < 4) {
                            System.out.println("Usuario o contraseña incorrectos. Intento " + intentos + " de 3.");
                        } else {
                            System.out.println("Demasiados intentos fallidos. Volviendo al inicio de registro.");
                        }
                    }
                }
            }
        }

    // Menú principal de opciones de la aplicación
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Ver resumen");
            System.out.println("2. Ver estadísticas");
            System.out.println("3. Ver Social Focus");
            System.out.println("4. Ver configuración");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            String opcion = sc.nextLine();

            // Resumen de la aplicación
            if (opcion.equals("1")) {
                System.out.print("Escriba el mensaje de resumen: ");
                String mensaje = sc.nextLine();
                Resumen resumen = new Resumen(mensaje);
                resumen.mostrarResumen();
            // Estadísticas de tareas
            } else if (opcion.equals("2")) {
                System.out.print("¿Cuántas tareas completadas?: ");
                int completadas = Integer.parseInt(sc.nextLine());
                System.out.print("¿Cuántas tareas pendientes?: ");
                int pendientes = Integer.parseInt(sc.nextLine());
                Estadisticas estadisticas = new Estadisticas(completadas, pendientes);
                estadisticas.mostrarEstadisticas();
            // Funcionalidad social
            } else if (opcion.equals("3")) {
                System.out.print("Escriba su publicación: ");
                String publicacion = sc.nextLine();
                SocialFocus social = new SocialFocus(publicacion);
                social.mostrarPublicacion();
            // Configuración de usuario
            } else if (opcion.equals("4")) {
                System.out.print("Idioma preferido: ");
                String idioma = sc.nextLine();
                String notifStr = "";
                do {
                    System.out.print("¿Activar notificaciones? (si/no): ");
                    notifStr = sc.nextLine().trim().toLowerCase();
                } while (!(notifStr.equals("si") || notifStr.equals("no") || notifStr.equals("s") || notifStr.equals("n")));
                boolean notificaciones = notifStr.equals("si") || notifStr.equals("s");
                Configuracion config = new Configuracion(idioma, notificaciones);
                config.mostrarConfiguracion();
            // Salir de la aplicación
            } else if (opcion.equals("5")) {
                System.out.println("¡Hasta luego!");
                break;
            } else {
                // Opción inválida
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

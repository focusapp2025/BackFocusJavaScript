
// Clase principal del proyecto orientado a objetos Focus App
public class MainPOO {
    public static void main(String[] args) {
        // Se crea el objeto Scanner para leer la entrada del usuario por consola
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Se crea un usuario por defecto, útil para pruebas o para permitir inicio rápido
    // Se usa long para el teléfono, ya que el valor es muy grande para int
    Usuario usuario = new Usuario("a", "1", "Blindprogrammer", 30, 3123784290L, "Técnico en Desarrollo de Software");

        // Inicio de sesión y registro
        System.out.println("=================================");
        System.out.println("          Focus App");
        System.out.println("=================================");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Registrarse");
        // Validación de entrada para evitar un error que me salio: InputMismatchException
        int opcionInicio = -1;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.print("Opción: ");
            if (sc.hasNextInt()) {
                opcionInicio = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
                if (opcionInicio == 1 || opcionInicio == 2) {
                    entradaValida = true;
                } else {
                    System.out.println("Por favor ingrese 1 para iniciar sesión o 2 para registrarse.");
                }
            } else {
                System.out.println("Por favor ingrese un número válido (1 o 2).");
                sc.nextLine(); // Limpiar entrada incorrecta
            }
        }

        // Si el usuario elige registrarse, se le piden los datos y se crea un nuevo objeto Usuario
        if (opcionInicio == 2) {
            System.out.println("Ingrese un nombre de usuario:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese una contraseña:");
            String clave = sc.nextLine();
            System.out.println("Ingrese su edad:");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese su nickname:");
            String nickname = sc.nextLine();
            System.out.println("Ingrese su teléfono:");
            long telefono = sc.nextLong();
            sc.nextLine();
            System.out.println("Ingrese su carrera:");
            String carrera = sc.nextLine();

            // Se crea el usuario con los datos ingresados
            usuario = new Usuario(nombre, clave, nickname, edad, telefono, carrera);
            System.out.println("\n¡¡Te registraste correctamente!! :D\nAhora puedes iniciar sesión.");
        }

        // Proceso de inicio de sesión: se solicita usuario y contraseña
        System.out.println("\nIngrese su usuario:");
        String nombreUsuario = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        String claveLogin = sc.nextLine();

        // Se valida el inicio de sesión usando el método de la clase Usuario
        if (usuario.iniciarSesion(nombreUsuario, claveLogin)) {
            System.out.println("¡Inicio de sesión exitoso! Bienvenido, " + usuario.getNombre() + ":D");
            // Mostrar los datos del usuario tras el inicio de sesión
            System.out.println("\n--- Datos del usuario ---");
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Nickname: " + usuario.getNickname());
            System.out.println("Edad: " + usuario.getEdad());
            System.out.println("Teléfono: " + usuario.getTelefono());
            System.out.println("Carrera: " + usuario.getCarrera());

            // Menú principal de la aplicación: pantalla de resumen
            // Este menú se muestra inmediatamente después del inicio de sesión exitoso
            // Aquí el usuario puede elegir entre las diferentes secciones de la app
            boolean salir = false;
            while (!salir) {
                // Mostramos el menú de opciones de la pantalla de resumen
                System.out.println("\n==================== RESUMEN ====================");
                System.out.println("Por favor, seleccione una opción:");
                System.out.println("1. Introducción a la programación");
                System.out.println("2. Metodologías ágiles de programación");
                System.out.println("3. Lógica de programación");
                System.out.println("4. Estadísticas");
                System.out.println("5. Social Focus");
                System.out.println("6. Configuración");
                System.out.println("0. Salir");
                System.out.print("Opción: ");
                int opcionResumen = sc.nextInt();
                sc.nextLine(); // Limpiamos el buffer

                // Dependiendo de la opción elegida, llamamos a la funcionalidad correspondiente
                switch (opcionResumen) {
                    case 1:
                        // Opción 1: Introducción a la programación
                        // Creamos una instancia de la clase IntroduccionProgramacion
                        // Esta clase encapsula toda la lógica y datos de la materia
                        IntroduccionProgramacion intro = new IntroduccionProgramacion();
                        // Llamamos al método mostrarInformacion para mostrar los datos al usuario
                        intro.mostrarInformacion();
                        // Así el código es más organizado y fácil de mantener
                        break;
                    case 2:
                        // Opción 2: Metodologías ágiles de programación
                        // Creamos una instancia de la clase MetodologiasAgiles
                        // Esta clase encapsula toda la lógica y datos de la materia
                        MetodologiasAgiles agiles = new MetodologiasAgiles();
                        // Llamamos al método mostrarInformacion para mostrar los datos al usuario
                        agiles.mostrarInformacion();
                        // Así el código es más organizado y fácil de mantener
                        break;
                    case 3:
                        // Opción 3: Lógica de programación
                        // Creamos una instancia de la clase LogicaProgramacion
                        // Esta clase encapsula toda la lógica y datos de la materia
                        LogicaProgramacion logica = new LogicaProgramacion();
                        // Llamamos al método mostrarMenu y le pasamos el Scanner para leer la opción del usuario
                        logica.mostrarMenu(sc);
                        // Así el código es más organizado y fácil de mantener
                        break;
                    case 4:
                        // Opción 4: Estadísticas
                        // Creamos una instancia de la clase Estadisticas
                        // Esta clase encapsula la lógica y datos de progreso del usuario
                        Estadisticas estadisticas = new Estadisticas();
                        // Llamamos al método mostrarEstadisticas para mostrar los datos al usuario
                        estadisticas.mostrarEstadisticas();
                        // Así el código es más organizado y fácil de mantener
                        break;
                    case 5:
                        // Opción 5: Social Focus
                        // Creamos una instancia de la clase SocialFocus, pasando el nombre del usuario
                        // Esta clase encapsula la lógica y datos de interacción social
                        SocialFocus social = new SocialFocus(usuario.getNombre());
                        // Llamamos al método mostrarSocialFocus para mostrar el chat general y mensajes
                        social.mostrarSocialFocus();
                        // Así el código es más organizado y fácil de mantener
                        break;
                    case 6:
                        // Opción 6: Configuración
                        // Creamos una instancia de la clase Configuracion, pasando el usuario y el scanner
                        // Esta clase encapsula la lógica para modificar datos personales
                        Configuracion config = new Configuracion(usuario, sc);
                        // Llamamos al método mostrarConfiguracion para mostrar el menú de configuración
                        config.mostrarConfiguracion();
                        // Así el código es más organizado y fácil de mantener
                        break;
                    case 0:
                        // Opción 0: Salir
                        // El usuario decide salir de la aplicación
                        System.out.println("¡Hasta luego! Gracias por usar Focus App.");
                        salir = true;
                        break;
                    default:
                        // Si el usuario ingresa una opción no válida, mostramos un mensaje de error
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            }
        } else {
            // Si el usuario o contraseña no son correctos, se muestra un mensaje de error
            System.out.println("\nUsuario o contraseña incorrectos. Por favor reinicia el proceso.");
        }
    }
}


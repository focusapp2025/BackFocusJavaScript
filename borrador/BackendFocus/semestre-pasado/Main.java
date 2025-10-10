/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definicion de variables.

        String usuarioRegistrado = "a";
        String claveRegistrada = "1";
        String nombreUsuario = "a";
        String nickname = "Blindprogrammer";
        int edad = 30;
        int telefonoEstudiante = 3123784290;
        String carrera = "Técnico en Desarrollo de Software";

        //Inicio de sesión y registro.

        System.out.println("=================================");
        System.out.println("          Focus App");
        System.out.println("=================================");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Registrarse");
        int opcionInicio = sc.nextInt();
        sc.nextLine();

        // Si selecciona  registrarse debe ingresar los datos que le piden y si l o hace le d ecimos que ya puede inicar sesion, pantalla siguiente pide que inice sesion, como si hubiera escogido la opcion 1 o si se hubiera registrado

        if (opcionInicio == 2) {
            System.out.println("Ingrese un nombre de usuario:");
            usuarioRegistrado = sc.nextLine();
            System.out.println("Ingrese una contraseña:");
            claveRegistrada = sc.nextLine();
            System.out.println("Ingrese su edad:");
            edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese su nickname:");
            nickname = sc.nextLine();
            System.out.println("Ingrese su teléfono:");
            telefonoEstudiante = sc.nextInt();
            sc.nextLine();
            System.out.println("\n¡¡Te registraste correctamente!! :D\nAhora puedes iniciar sesión.");
        }

        System.out.println("\nIngrese su usuario:");
        nombreUsuario = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        String claveLogin = sc.nextLine();

            // Desde aqui empieza todo lo que puede ver y las opciones que tiene dentro de la app

        if (nombreUsuario.equals(usuarioRegistrado) && claveLogin.equals(claveRegistrada)) {
            // Si el usuario inicia sesión correctamente, mostramos un mensaje de bienvenida
            System.out.println("¡Inicio de sesión exitoso! Bienvenido, " + nombreUsuario);

            // Aquí comienza la pantalla principal de la app, llamada "Resumen"
            // En esta pantalla, el usuario puede elegir entre varias opciones para navegar por la aplicación
            // Usamos un bucle para que el usuario pueda realizar varias acciones hasta que decida salir
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
                        // Aquí mostramos información relevante sobre la materia
                        System.out.println("\n--- Introducción a la programación ---");
                        System.out.println("Profesor: Jossy Reinaldo Tello Landazuri");
                        System.out.println("Progreso: 40%");
                        System.out.println("Próxima entrega: Taller de CSS (M2)");
                        break;
                    case 2:
                        // Opción 2: Metodologías ágiles de programación
                        System.out.println("\n--- Metodologías ágiles para la programación ---");
                        System.out.println("Profesor: Juan Jose Gallego Mesa");
                        System.out.println("Progreso: 72%");
                        System.out.println("Próxima entrega: Primeras 10 HU listas (M2)");
                        break;
                    case 3:
                        // Opción 3: Lógica de programación
                        System.out.println("\n--- Lógica de programación ---");
                        System.out.println("Profesor: Jaime Alberto Zapata Valencia");
                        System.out.println("Progreso: 80%");
                        System.out.println("Seleccione una opción para ver próximas entregas:");
                        System.out.println("1. momento 1");
                        System.out.println("2. momento 2");
                        System.out.println("3. momento 3");
                        System.out.print("Opción: ");
                        int opcionDeLogica = sc.nextInt();
                        sc.nextLine();
                        // Según la opción elegida, mostramos información específica
                        if (opcionDeLogica == 1) {
                            System.out.println("Ejercicios básicos de lógica, quiz de conocimiento y desempeño.");
                        } else if (opcionDeLogica == 2) {
                            System.out.println("Quiz de conocimiento y sustentación de desempeño. Entrega evidencias de Condicionales y JAVA en el proyecto integrador");
                        } else if (opcionDeLogica == 3) {
                            System.out.println("Tema: Aun no sabemos. Que Dios nos ampare :P");
                        } else {
                            System.out.println("Opción no válida.");
                        }
                        break;
                    case 4:
                        // Opción 4: Estadísticas
                        // Aquí mostramos el progreso en las diferentes materias y el promedio general
                        System.out.println("\n--- Estadísticas ---");
                        int porcentaje1 = 40;
                        int porcentaje2 = 72;
                        int porcentaje3 = 80;
                        System.out.println("Intro: " + porcentaje1 + "%");
                        System.out.println("Lógica: " + porcentaje2 + "%");
                        System.out.println("Agilismo: " + porcentaje3 + "%");
                        int promedio = (porcentaje1 + porcentaje2 + porcentaje3) / 3;
                        System.out.println("Promedio general: " + promedio + "%");
                        break;
                    case 5:
                        // Opción 5: Social Focus
                        // Espacio para compartir logros y dudas con la comunidad
                        System.out.println("\n--- Social Focus ---");
                        System.out.println("¡Bienvenidos a Social Focus! Comparte tus logros y dudas, es un espacio para que compartas con tu comunidad del CESDE");
                        System.out.println("Chat general:");
                        System.out.println("1. DonAndres escribió: Que vamos a hacer para mañana que no hemos hecho el trabajo?? D:");
                        System.out.println("2. la-divina respondió: Mijo para eso está chatGPT. LOL!");
                        System.out.println("3. " + nombreUsuario + " reaccionó al mensaje de la-divina con un corazón");
                        break;
                    case 6:
                        // Opción 6: Configuración
                        // Permite ver y modificar datos del usuario y otras configuraciones
                        System.out.println("\n--- Configuración ---");
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Perfil");
                        System.out.println("2. Datos");
                        System.out.println("3. Otros");
                        System.out.print("Opción: ");
                        int opcionConfiguracion = sc.nextInt();
                        sc.nextLine();
                        if (opcionConfiguracion == 1) {
                            System.out.println("\nPerfil:");
                            System.out.println("Nombre de usuario: " + nombreUsuario);
                            System.out.println("Edad: " + edad);
                            System.out.println("Carrera: " + carrera);
                            System.out.println("Nickname: " + nickname);
                        } else if (opcionConfiguracion == 2) {
                            System.out.println("\nDatos:");
                            System.out.println("Correo institucional: " + nombreUsuario + "@cesde.net");
                            System.out.println("Teléfono: +57 " + telefonoEstudiante);
                        } else if (opcionConfiguracion == 3) {
                            System.out.println("\nOtros:");
                            System.out.println("Notificaciones: Activadas");
                            System.out.println("Idioma: Español");
                            System.out.println("Cerrar sesión");
                        } else {
                            System.out.println("Opción no válida.");
                        }
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

            switch (opcionResumen) {
                case 1:
                    System.out.println("\nIntroducción a la programación");
                    System.out.println("Profesor: Jossy Reinaldo Tello Landazuri");
                    System.out.println("Progreso: 40%");
                    System.out.println("Próxima entrega: Taller de CSS (M2)");
                    break;
                case 2:
                    System.out.println("\nMetodologías ágiles para la programación");
                    System.out.println("Profesor: Juan Jose Gallego Mesa");
                    System.out.println("Progreso: 72%");
                    System.out.println("Próxima entrega: Primeras 10 HU listas (M2)");
                    break;
                case 3:
                    System.out.println("\nLógica de programación:");
                    System.out.println("\nProfesor: Jaime Alberto Zapata Valencia");
                    System.out.println("Progreso: 80%");
                    System.out.println("\nSeleccione una opción para ver próximas entregas:");
                    System.out.println("\n1. momento 1");
                    System.out.println("2. momento 2");
                    System.out.println("3. momento 3");
                    int opcionDeLogica = sc.nextInt();
                    sc.nextLine();

                    //Desde aqui se desglosa las opciones que hay dentro de Logica (Solo simulamos este, aunque la idea es que los otros tengan un display parecido)

                    if (opcionDeLogica == 1) {
                        System.out.println("\nEjercicios básicos de lógica, quiz de conocimiento y desempeño.");
                    } else if (opcionDeLogica == 2) {
                        System.out.println("\nQuiz de  conocimeinto y sustentación de desempeño. Entrega evidencias de Condicionales y JAVA en el proyecto integrador");
                    } else if (opcionDeLogica == 3) {
                        System.out.println("\nTema: Aun no sabemos. Que Dios nos ampare :P");
                    } else {
                        System.out.println("Opción no válida.");
                    }

                    break;

                // Desde aqui podemos ver la opcion de Estadisticas a la que ingresamos desde resumen

                case 4:
                    System.out.println("\nEstadísticas");
                    int porcentaje1 = 40;
                    int porcentaje2 = 72;
                    int porcentaje3 = 80;
                    System.out.println("\nIntro: " + porcentaje1 + "%");
                    System.out.println("Logica: " + porcentaje2 + "%");
                    System.out.println("Agilismo: " + porcentaje3 + "%");
                    int promedio = (porcentaje1 + porcentaje2 + porcentaje3) / 3;
                    System.out.println("Promedio general: " + promedio + "%");
                    break;

                    //Aqui podemos ver la red social de Focus App, se accede desde resumen

                case 5:
                    System.out.println("\nSocial Focus :D");
                    System.out.println("\n¡Bienvenidos a Social Focus! Comparte tus logros y dudas, es un espacio para que compartas con tu comunidad del CESDE");
                    System.out.println("\nChat general:");
                    System.out.println("1. DonAndres escribió: Que vamos a hacer para mañana que no hemos hecho el trabajo?? D:");
                    System.out.println("2. la-divina respondió: Mijo para eso está chatGPT. LOL!");
                    System.out.println("3. " + nombreUsuario + " reaccionó al mensaje de la-divina con un corazón");
                    
                    break;

                    //Pantalla de config, se accede desde resumen

                case 6:
                    System.out.println("\nConfiguración:");
                    System.out.println("\nSeleccione una opción:");
                    System.out.println("\n1. Perfil");
                    System.out.println("2. Datos");
                    System.out.println("3. Otros");
                    int opcionConfiguracion = sc.nextInt();
                    sc.nextLine();

                    if (opcionConfiguracion == 1) {
                        System.out.println("\nPerfil:");
                        System.out.println("\nNombre de usuario: " + nombreUsuario);
                        System.out.println("Edad: " + edad);
                        System.out.println("Carrera: " + carrera);
                        System.out.println("Nickname: " + nickname);
                    } else if (opcionConfiguracion == 2) {
                        System.out.println("\nDatos:");
                        System.out.println("\nCorreo institucional: " + nombreUsuario + "@cesde.net"); 
                        System.out.println("Teléfono: +57 "+ telefonoEstudiante);
                    } else if (opcionConfiguracion == 3) {
                        System.out.println("\nOtros:");
                        System.out.println("\nNotificaciones: Activadas");
                        System.out.println("Idioma: Español");
                        System.out.println("Cerrar sesión");
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
            }


            //Hasta aqui va todo el if desde el inicio de sesion, si ingresa bien los datos, le permite continuar, si no procedemos con el else.
            
        } else {
            System.out.println("\nUsuario o contraseña incorrectos. Por favor reinicia el proceso.");
        }

        System.out.println("\nGracias por usar Focus App. ¡Hasta pronto!");
    }
}

*/
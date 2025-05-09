import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definicion de variables.

        String usuarioRegistrado = "";
        String claveRegistrada = "";
        String nombreUsuario = "";
        String nickname = "";
        int edad = 0;
        int telefonoEstudiante = 0;
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
            System.out.println("\n¡¡Te registraste!! :D\nAhora puedes iniciar sesión.");
        }

        System.out.println("\nIngrese su usuario:");
        nombreUsuario = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        String claveLogin = sc.nextLine();

            // Desde aqui empieza todo lo que puede ver y las opciones que tiene dentro de la app

        if (nombreUsuario.equals(usuarioRegistrado) && claveLogin.equals(claveRegistrada)) {
            System.out.println("¡Inicio de sesión exitoso! Bienvenido, " + nombreUsuario);

            // Resumen

            System.out.println("\nResumen");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Introducción a la programación");
            System.out.println("2. Metodologías ágiles de programación");
            System.out.println("3. Lógica de programación");
            System.out.println("4. Estadísticas");
            System.out.println("5. Social Focus");
            System.out.println("6. Configuración");
            int opcionResumen = sc.nextInt();
            sc.nextLine();

            //Desde aqui ya empiezan adesglosarse las opciones de Resumen

            switch (opcionResumen) {
                case 1:
                    System.out.println("\nIntroducción a la programación");
                    System.out.println("Profesor: Jossy Reinaldo Tello Landazuri");
                    System.out.println("Progreso: 40%");
                    System.out.println("Próxima entrega: Taller de CSS (S2)");
                    break;
                case 2:
                    System.out.println("\nMetodologías ágiles para la programación");
                    System.out.println("Profesor: Juan Jose Gallego Mesa");
                    System.out.println("Progreso: 72%");
                    System.out.println("Próxima entrega: Primeras 10 HU listas (S2)");
                    break;
                case 3:
                    System.out.println("\nLógica de programación");
                    System.out.println("Profesor: Jaime Alberto Zapata Valencia");
                    System.out.println("Progreso: 80%");
                    System.out.println("Seleccione una opción para ver próximas entregas:");
                    System.out.println("1. PSE");
                    System.out.println("2. JAVA");
                    System.out.println("3. Git");
                    int opcionDeLogica = sc.nextInt();
                    sc.nextLine();

                    //Desde aqui se desglosa las opciones que hay dentro de Logica (Solo simulamos este, aunque la idea es que los otros tengan un display parecido)

                    if (opcionDeLogica == 1) {
                        System.out.println("Bienvenido a tu progreso en PSE.");
                    } else if (opcionDeLogica == 2) {
                        System.out.println("Bienvenido a tu progreso en JAVA.");
                    } else if (opcionDeLogica == 3) {
                        System.out.println("Bienvenido a tu progreso en Git y GitHub.");
                    } else {
                        System.out.println("Opción no válida.");
                    }

                    System.out.println("Seleccione el momento:");
                    System.out.println("1. Momento 1");
                    System.out.println("2. Momento 2");
                    System.out.println("3. Momento 3");
                    int opcionMomento = sc.nextInt();
                    sc.nextLine();

                    if (opcionMomento == 1) {
                        System.out.println("Ejercicios básicos de lógica.");
                        sc.nextLine();  
                    
                } else if(opcionMomento == 2) {
                    System.out.println("Condicionales y JAVA.");

                } else if(opcionMomento == 3){
                    System.out.println("Que Dios nos ampare :P");
                    
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
                    System.out.println("Intro: " + porcentaje1 + "%");
                    System.out.println("Logica: " + porcentaje2 + "%");
                    System.out.println("Agilismo: " + porcentaje3 + "%");
                    int promedio = (porcentaje1 + porcentaje2 + porcentaje3) / 3;
                    System.out.println("Promedio general: " + promedio + "%");
                    break;

                    //Aqui podemos ver la red social de Focus App, se accede desde resumen

                case 5:
                    System.out.println("\nSocial Focus :D");
                    System.out.println("Integrantes del grupo:");
                    System.out.println("1. DonAndres");
                    System.out.println("2. la-divina");
                    System.out.println("3. " + nombreUsuario);
                    System.out.println("¡Bienvenidos a Social Focus! Comparte tus logros y dudas, es un espacio poara que compartas con tu comunidad del CESDE!");
                    break;

                    //Pantalla de config, se accede desde resumen

                case 6:
                    System.out.println("\nConfiguración");
                    System.out.println("Seleccione una opción:");
                    System.out.println("1. Perfil");
                    System.out.println("2. Datos");
                    System.out.println("3. Otros");
                    int opcionConfiguracion = sc.nextInt();
                    sc.nextLine();

                    if (opcionConfiguracion == 1) {
                        System.out.println("Perfil:");
                        System.out.println("Nombre de usuario: " + nombreUsuario);
                        System.out.println("Edad: " + edad);
                        System.out.println("Carrera: " + carrera);
                        System.out.println("Genero: " + nickname);
                    } else if (opcionConfiguracion == 2) {
                        System.out.println("Datos:");
                        System.out.println("Correo institucional: " + nombreUsuario + "@cesde.net"); 
                        System.out.println("Teléfono: +57 "+ telefonoEstudiante);
                    } else if (opcionConfiguracion == 3) {
                        System.out.println("Otros:");
                        System.out.println("Notificaciones: activadas");
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


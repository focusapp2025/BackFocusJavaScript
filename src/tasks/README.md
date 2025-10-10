Estructura didáctica - carpeta `tasks`
=====================================

Esta carpeta contiene una versión sencilla y didáctica de la arquitectura que usamos como referencia.
Está pensada para que estudiantes de primer semestre entiendan el flujo de datos sin depender de Spring o bases de datos.

Organización
------------

- `tasks.models` — modelos/POJOs simples (ej. `Usuario`).
- `tasks.datasource` — una fuente de datos en memoria (listas) para pruebas rápidas.
- `tasks.useCases` — lógica de negocio simple que opera sobre la datasource.
- `tasks.controllers` — controladores que actúan como "puente" entre la UI (o tests) y los use cases.

Cómo usarlo (rápido)
--------------------

1) Leer las clases en los paquetes anteriores para entender el flujo: Model -> DataSource -> UseCase -> Controller.

2) Ejemplo rápido (clase demo incluida `tasks.App`) muestra cómo instanciar `UsuarioController` y llamar a sus métodos.

3) Para ejecutar en tu IDE (recomendado):
   - Abre el proyecto en VS Code o IntelliJ como proyecto Maven.
   - Ejecuta la clase `tasks.App` (si tu IDE permite ejecutar clases con main) o ejecuta `com.focusapp.core.MainCLI` para probar la versión CLI.

Nota sobre compilación desde terminal
-----------------------------------

Si prefieres usar la terminal, lo más fácil es construir el proyecto con Maven y luego ejecutar la clase CLI:

    mvn -DskipTests package
    java -cp target\backfocus-0.0.1-SNAPSHOT.jar com.focusapp.core.MainCLI

Esto ejecuta la versión CLI que interactúa por consola. `tasks.App` es una demo local que puedes ejecutar desde el IDE o usar como referencia para crear otros pequeños programas de prueba.

Qué puedes hacer en clase
-------------------------

- Modificar `tasks.models.Usuario` para agregar más campos.
- Añadir validaciones sencillas en `tasks.useCases.UsuarioUseCase`.
- Implementar una interfaz de consola que use `tasks.controllers.UsuarioController`.
- Una vez comprendido, migrar casos de `tasks.*` a la estructura `com.focusapp` con JPA y controladores REST.

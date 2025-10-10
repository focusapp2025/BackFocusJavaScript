# BackFocus (FocusApp)

Proyecto reorganizado para empezar a adaptar el ejemplo CRUD (task-api-java-saturday-focusapp) hacia FocusApp.

Estructura inicial creada:

- pom.xml — proyecto Maven con dependencias Spring Boot
- src/main/java/com/focusapp — clases organizadas en paquetes:
  - model — `Usuario`, `Estadisticas`
  - ui — `SocialFocus`, `Configuracion`
  - courses — `IntroduccionProgramacion`, `LogicaProgramacion`, `MetodologiasAgiles`
  - `MainCLI` — versión CLI para pruebas locales
  - `BackFocusApplication` — entrypoint Spring Boot (por ahora sin controladores)

Siguientes pasos recomendados:

1. Clonar/inspeccionar el repositorio base (task-api-java-saturday-focusapp) y copiar la capa de entidades, repositorios y controladores.
2. Crear entidades JPA y repositorios para `Usuario` y otras entidades.
3. Implementar servicios y controladores REST.
4. Configurar la base de datos MySQL local y probar con `mvn spring-boot:run`.

Arquitecturas incluidas en este repo
-----------------------------------

1) Estructura didáctica (`tasks.*`)

- Ubicada en `src/main/java/tasks` y contiene:
  - `tasks.models` — modelos sencillos (ej. `Usuario`, `Task`)
  - `tasks.datasource` — implementación en memoria para ejemplos
  - `tasks.useCases` — lógica de negocio simple
  - `tasks.controllers` — controladores estilo didáctico que llaman a los useCases

Esta estructura es útil para entender el flujo (modelo -> datasource -> useCase -> controller) sin depender de Spring/JPA.

2) Estructura Spring Boot / JPA (`com.focusapp`)

- Ubicada en `src/main/java/com/focusapp` y contiene:
  - `entity`, `repository`, `service`, `controller` — arquitectura típica CRUD con JPA
  - `BackFocusApplication` — entrypoint Spring Boot
  - `DataLoader` — datos de ejemplo al inicio

Usa esta estructura cuando quieras un backend real, persistente y listo para exponer APIs REST.

Cómo probar los endpoints REST (ejemplos PowerShell)
--------------------------------------------------

Abre PowerShell y, si ejecutas la app con `mvn spring-boot:run` (o desde tu IDE), usa los siguientes comandos:

Get all usuarios:

  Invoke-RestMethod -Method Get -Uri http://localhost:8080/api/usuarios

Get usuario por id (ej: id=1):

  Invoke-RestMethod -Method Get -Uri http://localhost:8080/api/usuarios/1

Buscar por nombre:

  Invoke-RestMethod -Method Get -Uri 'http://localhost:8080/api/usuarios/search?nombre=andres'

Crear un usuario (JSON):

  $body = @{ nombre='juan'; clave='abc'; nickname='juanny'; edad=21; telefono=3120000000; carrera='Sistemas' } | ConvertTo-Json
  Invoke-RestMethod -Method Post -Uri http://localhost:8080/api/usuarios -Body $body -ContentType 'application/json'

Actualizar usuario (PUT):

  $body = @{ nombre='juan'; clave='nuevo'; nickname='juanny'; edad=22; telefono=3120000001; carrera='Sistemas' } | ConvertTo-Json
  Invoke-RestMethod -Method Put -Uri http://localhost:8080/api/usuarios/1 -Body $body -ContentType 'application/json'

Eliminar usuario:

  Invoke-RestMethod -Method Delete -Uri http://localhost:8080/api/usuarios/1

Nota sobre compilación y ejecución
---------------------------------

- Si `mvn` no está disponible en tu PATH la compilación fallará; instala Maven o ejecuta desde tu IDE (IntelliJ/VSCode) abriendo el `pom.xml`.
- Mantendremos la carpeta `tasks` como ejemplos didácticos. Cuando quieras, puedo ayudarte a migrar casos concretos de `tasks.*` hacia `com.focusapp` y crear pruebas automatizadas.

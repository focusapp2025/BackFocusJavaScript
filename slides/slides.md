# FocusApp — Presentación para clase

## Slide 1 — Fundamentos POO (con ejemplos)

- Qué es una clase: molde que define atributos y métodos.
- Qué es un objeto: instancia creada a partir de una clase.
- Encapsulación: mantener los datos privados y exponer getters/setters.
- Abstracción: modelar sólo lo necesario (Ej: `Usuario` tiene nombre, clave, nickname).
- Herencia (mención breve): permitir que una clase herede código de otra.
- Polimorfismo (mención breve): métodos que se comportan distinto según la clase.

Ejemplo (pseudo-código):
```
class Usuario {
  private String nombre;
  public String getNombre() { return nombre; }
}
Usuario u = new Usuario();
```

---

## Slide 2 — Arquitectura didáctica (src/tasks)

- Objetivo: entender el flujo sin instalar base de datos.
- Componentes:
  - `models` (POJOs): `Usuario` (atributos, getters/setters)
  - `datasource`: almacenamiento en memoria (lista)
  - `useCases`: lógica de negocio (create/read/update/delete)
  - `controllers`: punto de entrada para la UI o demos
  - `App`: demo que muestra el flujo

Flujo:
`App -> Controller -> UseCase -> DataSource`

---

## Slide 3 — Arquitectura real (com.focusapp)

- Objetivo: cómo sería un backend real listo para producción.
- Componentes:
  - `entity` (JPA): clases anotadas que se guardan en la BD (`UsuarioEntity`)
  - `repository`: abstracción para consultas (Spring Data JpaRepository)
  - `service`: lógica del negocio y validaciones
  - `controller`: API REST (endpoints HTTP)

Operaciones básicas: CRUD -> Create, Read, Update, Delete

---

## Slide 4 — Ejemplo práctico (qué mostrar en clase)

1. Ejecutar `tasks.App` desde el IDE y mostrar salida.
2. Mostrar `Usuario` didáctico y `UsuarioEntity` real para comparar.
3. Explicar un endpoint: GET /api/usuarios -> listar usuarios (si estuviera la BD).
4. Conclusión: POO + separación de responsabilidades = código más fácil de mantener.

---

## Slide 5 — Conceptos extra y buenas prácticas

- Separación de capas (Controller / Service / Repository)
- Principio de responsabilidad única (SRP)
- Validación de entrada y manejo de errores
- Documentación mínima y pruebas unitarias

---

## Slide 6 — Cómo convertir esto a PDF

1. Abrir `slides/slides.html` en Chrome/Edge.
2. O usar `scripts/generate-slides-pdf.ps1` (requiere Chrome o Edge instalado).

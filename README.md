// README.md
/**
# Task Manager API

## Descripción
Task Manager es una API REST desarrollada en **Spring Boot** para la gestión de tareas. Permite crear, leer, actualizar y eliminar tareas de manera eficiente. Además, implementa un manejador global de errores para garantizar buenas prácticas en el desarrollo.

## Características
- API RESTful para tareas.
- Gestión de errores con **ControllerAdvice**.
- Validación de entradas con **Bean Validation**.
- Manejo de recursos no encontrados y excepciones generales.

## Estructura del Proyecto
```
com.example.taskmanager
│   ├── controller         # Controladores de la API
│   ├── service            # Lógica de negocio
│   ├── repository         # Acceso a la base de datos
│   ├── model              # Modelos de datos
│   ├── config             # Configuraciones globales (Manejador de errores)
│   └── TaskManagerApplication.java  # Clase principal
```

## Ejemplo de Error Handling
### Validación de Entradas
**Request:**
```json
POST /api/tasks
{
  "title": "",
  "description": "Test description"
}
```

**Response:**
```json
{
  "title": "Title must not be empty"
}
```

### Recurso No Encontrado
**Request:** `GET /api/nonexistent`

**Response:**
```json
{
  "error": "Resource not found",
  "details": "uri=/api/nonexistent"
}
```

## Cómo Ejecutar
1. Clona el repositorio.
2. Configura la base de datos en `application.properties`.
3. Ejecuta la aplicación con Maven:
   ```bash
   gradlew bootRun
   ```
4. La API estará disponible en `http://localhost:8080`.

## Tecnologías Utilizadas
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database (en desarrollo)**
- **Bean Validation**
- **ControllerAdvice**

---


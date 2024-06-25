# tasks-manager

Micro para gestión de Tasks con Mongo utilizando la arquitectura hexagonal y DDD.

## Requisitos

- Java 17
- Maven 3.x
- Docker (MongoDB Container)

## Estructura del Proyecto

El proyecto sigue la arquitectura hexagonal con las siguientes capas:

- **Domain**: Tasks.
- **Aplicación**: Tasks Services.
- **Infraestructura**: MongoDB, Rest API
## Configuración

### 1. Clonar el repositorio

```sh
git clone https://github.com/eliucinho/tasks-manager.git
cd tasks-manager
```
### 2. Configurar MongoDB con Docker

```sh
docker run -d -p 27017:27017 --name mongodb mongo:latest
```

### 3. Configurar el archivo de propiedades

```sh
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=fintech-test
```
### 4. Construir y ejecutar el proyecto

```sh
mvn clean install
mvn spring-boot:run
```
### 5. Acceder API: Crear task
POST /tasks: Crear una nueva tarea.
```sh
http://localhost:8080/swagger-ui/index.html#/task-controller/createTask
```
Body:
```json
{
  "title": "Tittle Task",
  "description": "Any Description",
  "dueDate": "2024-06-25",
  "tags": ["prod", "bug", "2.7"],
  "status": "PENDING"
}
```

### 6. Acceder API: Consultar todas tasks
GET /tasks: Obtener todas las tareas.
```sh
http://localhost:8080/swagger-ui/index.html#/task-controller/getAllTasks
```
Response:
```json
[
  {
    "id": "667a87dade991e751815193e",
    "title": "Tittle Task",
    "description": "Any Description",
    "dueDate": [
      2024,
      6,
      25
    ],
    "tags": [
      "prod",
      "bug",
      "2.7"
    ],
    "status": "PENDING"
  }
]
```
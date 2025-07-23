# 🎓 Microservicio de Estudiantes con Spring Boot

Este proyecto forma parte de un sistema de microservicios desarrollado con **Spring Boot**, que gestiona información sobre estudiantes y cursos. La arquitectura incluye los siguientes servicios:

## 🧱 Estructura del Proyecto

```
microservicio-estudiantes/
│
├── config-server/           # Servidor de configuración centralizado (Spring Cloud Config)
├── eureka-server/           # Servidor Eureka para descubrimiento de servicios
├── gateway/                 # API Gateway (Spring Cloud Gateway)
├── course-service/          # Microservicio para gestión de cursos
├── student-service/         # Microservicio para gestión de estudiantes
```

## 📦 Tecnologías utilizadas

- Java 17+ ☕
- Spring Boot
- Spring Cloud (Eureka, Config, Gateway)
- JPA/Hibernate
- Maven
- IntelliJ IDEA

---

## 📚 Documentación con JavaDoc

Este proyecto está documentado con JavaDoc. Para generar y visualizar la documentación localmente en IntelliJ IDEA.

### 👁️ Ver en IntelliJ:
- Colocá el cursor sobre un método o clase y presioná `Ctrl + Q`.

### 📦 Generar JavaDoc HTML:

1. Hacé clic derecho sobre el proyecto → `Generate JavaDoc...`
2. Configurá la ruta de salida y hacé clic en `OK`
3. Abrí el archivo `index.html` generado con tu navegador

---

## 🚪 Endpoints Principales

### 🎓 Student Service

| Método | Endpoint                                 | Descripción                        |
|--------|------------------------------------------|------------------------------------|
| GET    | `/api/student/all`                       | Obtener todos los estudiantes      |
| GET    | `/api/student/search/{id}`               | Buscar estudiante por ID           |
| POST   | `/api/student/create`                    | Crear nuevo estudiante             |
| GET    | `/api/student/searchByCourse/{idCourse}` | Buscar estudiantes por ID de curso |

### 📘 Course Service

| Método | Endpoint                         | Descripción                      |
|--------|----------------------------------|----------------------------------|
| GET    | `/api/course/all`                | Obtener todos los cursos         |
| GET    | `/api/course/search/{id}`        | Buscar curso por ID              |
| POST   | `/api/course/create`             | Crear nuevo curso                |
| GET    | `/api/course/students/{id}`      | Obtener estudiantes de un curso  |

---

## 🚀 Cómo ejecutar el proyecto

1. Clonar el repositorio
2. Levantar el **Config Server**
3. Levantar el **Eureka Server**
4. Levantar el **Gateway**
5. Levantar los microservicios (`student-service` y `course-service`)
6. Acceder a los endpoints desde el gateway: `http://localhost:8080/api/...`

---

## 🧠 Autor

- Juan Simón Zubigaray

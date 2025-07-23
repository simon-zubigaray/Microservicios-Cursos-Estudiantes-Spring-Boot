package js.zubigaray.course.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad JPA que representa un curso.
 *
 * <p>
 * Mapea la tabla "courses" en la base de datos.
 * </p>
 *
 * <ul>
 *   <li><b>id:</b> Identificador único del curso (clave primaria, autogenerada).</li>
 *   <li><b>name:</b> Nombre del curso.</li>
 *   <li><b>teacher:</b> Nombre del docente responsable del curso.</li>
 * </ul>
 *
 * <p>
 * Anotaciones:
 * <ul>
 *   <li>{@code @Entity}: Marca la clase como una entidad JPA.</li>
 *   <li>{@code @Table(name = "courses")}: Especifica la tabla en la base de datos.</li>
 *   <li>{@code @Id}: Indica la clave primaria.</li>
 *   <li>{@code @GeneratedValue(strategy = GenerationType.IDENTITY)}: Estrategia de generación automática de ID.</li>
 *   <li>Usa Lombok para generar constructores, getters, setters y builder.</li>
 * </ul>
 * </p>
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String teacher;
}
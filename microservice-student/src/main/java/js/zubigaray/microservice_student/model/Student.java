package js.zubigaray.microservice_student.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad JPA que representa un estudiante.
 *
 * <p>
 * Mapea la tabla "students" en la base de datos.
 * </p>
 *
 * <ul>
 *   <li><b>id:</b> Identificador único del estudiante (clave primaria, autogenerada).</li>
 *   <li><b>name:</b> Nombre del estudiante.</li>
 *   <li><b>lastName:</b> Apellido del estudiante (mapeado a la columna "last_name").</li>
 *   <li><b>email:</b> Correo electrónico del estudiante.</li>
 *   <li><b>courseId:</b> Identificador del curso asociado (mapeado a la columna "course_id").</li>
 * </ul>
 *
 * <p>
 * Anotaciones:
 * <ul>
 *   <li>{@code @Entity}: Marca la clase como una entidad JPA.</li>
 *   <li>{@code @Table(name = "students")}: Especifica la tabla en la base de datos.</li>
 *   <li>{@code @Id}: Indica la clave primaria.</li>
 *   <li>{@code @GeneratedValue(strategy = GenerationType.IDENTITY)}: Estrategia de generación automática de ID.</li>
 *   <li>{@code @Column}: Mapea atributos a columnas con nombre distinto al del atributo.</li>
 *   <li>Usa Lombok para generar constructores, getters, setters y builder.</li>
 * </ul>
 * </p>
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "last_name")
    private String lastName;
    private String email;

    @Column(name = "course_id")
    private Long courseId;
}

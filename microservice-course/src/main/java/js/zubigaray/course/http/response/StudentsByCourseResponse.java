package js.zubigaray.course.http.response;

import js.zubigaray.course.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * Objeto de respuesta para listar estudiantes por curso.
 *
 * <p>
 * Contiene información del curso junto con la lista de estudiantes asociados.
 * </p>
 *
 * <ul>
 *   <li><b>courseName:</b> Nombre del curso.</li>
 *   <li><b>teacher:</b> Nombre del docente responsable del curso.</li>
 *   <li><b>studentDTOList:</b> Lista de objetos {@link StudentDTO} con los datos de los estudiantes.</li>
 * </ul>
 *
 * <p>
 * Anotaciones Lombok:
 * <ul>
 *   <li>{@code @Data}: Genera getters, setters, equals, hashCode y toString.</li>
 *   <li>{@code @Builder}: Permite construir objetos con patrón builder.</li>
 *   <li>{@code @AllArgsConstructor}: Constructor con todos los campos.</li>
 *   <li>{@code @NoArgsConstructor}: Constructor sin argumentos.</li>
 * </ul>
 * </p>
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentsByCourseResponse {
    private String courseName;
    private String teacher;
    private List<StudentDTO> studentDTOList;
}
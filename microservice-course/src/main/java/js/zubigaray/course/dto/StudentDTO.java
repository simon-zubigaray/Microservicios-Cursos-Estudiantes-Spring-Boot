package js.zubigaray.course.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data Transfer Object (DTO) que representa a un estudiante.
 *
 * <p>
 * Contiene los datos básicos de un estudiante para la transferencia entre capas o servicios.
 * </p>
 *
 * <ul>
 *   <li><b>name:</b> Nombre del estudiante.</li>
 *   <li><b>lastName:</b> Apellido del estudiante.</li>
 *   <li><b>email:</b> Correo electrónico del estudiante.</li>
 *   <li><b>courseId:</b> Identificador del curso al que está asociado el estudiante.</li>
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
public class StudentDTO {
    private String name;
    private String lastName;
    private String email;
    private Long courseId;
}

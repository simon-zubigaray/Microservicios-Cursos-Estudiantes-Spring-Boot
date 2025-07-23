package js.zubigaray.course.client;

import js.zubigaray.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Cliente Feign para consumir el microservicio de estudiantes (msvc-student).
 *
 * <p>
 * Define la comunicación REST con el servicio externo mediante HTTP.
 * </p>
 *
 * <p>
 * Anotaciones:
 * <ul>
 *   <li>{@code @FeignClient}: Indica que esta interfaz es un cliente Feign para el servicio "msvc-student".</li>
 *   <li>Se configura la URL base donde se encuentra el servicio.</li>
 * </ul>
 * </p>
 */
@FeignClient(name = "msvc-student", url = "localhost:8090/api/student")
public interface StudentClient {

    /**
     * Obtiene la lista de estudiantes asociados a un curso específico.
     *
     * @param idCourse el ID del curso para buscar estudiantes
     * @return lista de objetos {@link StudentDTO} correspondientes al curso
     */
    @GetMapping("/searchByCourse/{idCourse}")
    List<StudentDTO> findAllStudentsByCourse(@PathVariable Long idCourse);
}
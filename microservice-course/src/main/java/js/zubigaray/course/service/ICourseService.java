package js.zubigaray.course.service;

import js.zubigaray.course.http.response.StudentsByCourseResponse;
import js.zubigaray.course.model.Course;

import java.util.List;

/**
 * Interfaz de servicio para la gestión de cursos.
 *
 * <p>
 * Define los métodos para operaciones comunes sobre cursos y para obtener estudiantes por curso.
 * </p>
 */
public interface ICourseService {

    /**
     * Obtiene la lista de todos los cursos.
     *
     * @return lista de objetos {@link Course}
     */
    List<Course> findAll();

    /**
     * Busca un curso por su ID.
     *
     * @param id ID del curso a buscar
     * @return objeto {@link Course} correspondiente al ID
     */
    Course findByid(Long id);

    /**
     * Guarda un curso nuevo o actualizado.
     *
     * @param course objeto {@link Course} a guardar
     */
    void save(Course course);

    /**
     * Obtiene la información del curso junto con sus estudiantes asociados.
     *
     * @param idCourse ID del curso para obtener los estudiantes
     * @return objeto {@link StudentsByCourseResponse} con los datos del curso y lista de estudiantes
     */
    StudentsByCourseResponse findStudentsByIdCourse(Long idCourse);
}

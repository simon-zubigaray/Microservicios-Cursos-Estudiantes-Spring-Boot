package js.zubigaray.microservice_student.service;

import js.zubigaray.microservice_student.model.Student;

import java.util.List;

/**
 * Interfaz de servicio para la gestión de estudiantes.
 *
 * <p>
 * Define los métodos para realizar operaciones comunes sobre estudiantes.
 * </p>
 */
public interface IStudentService {

    /**
     * Obtiene la lista de todos los estudiantes.
     *
     * @return lista de objetos {@link Student}
     */
    List<Student> findAll();

    /**
     * Busca un estudiante por su ID.
     *
     * @param idStudent ID del estudiante a buscar
     * @return objeto {@link Student} correspondiente al ID
     */
    Student findById(Long idStudent);

    /**
     * Guarda un estudiante nuevo o actualizado.
     *
     * @param student objeto {@link Student} a guardar
     */
    void save(Student student);

    /**
     * Obtiene la lista de estudiantes asociados a un curso específico.
     *
     * @param idCourse ID del curso para filtrar estudiantes
     * @return lista de objetos {@link Student} que pertenecen al curso
     */
    List<Student> findByIdCourse(Long idCourse);
}

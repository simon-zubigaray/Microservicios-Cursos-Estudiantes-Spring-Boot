package js.zubigaray.microservice_student.repository;

import js.zubigaray.microservice_student.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio para la entidad {@link Student}.
 *
 * <p>
 * Proporciona operaciones CRUD básicas y consultas personalizadas para estudiantes.
 * </p>
 *
 * <p>
 * Extiende {@link CrudRepository} parametrizado con {@link Student} y su clave primaria {@link Long}.
 * </p>
 */
@Repository
public interface IStudentRepository extends CrudRepository<Student, Long> {

    /**
     * Busca la lista de estudiantes asociados a un curso específico.
     *
     * @param courseId ID del curso para filtrar estudiantes
     * @return lista de {@link Student} que pertenecen al curso indicado
     */
    List<Student> findByCourseId(Long courseId);
}

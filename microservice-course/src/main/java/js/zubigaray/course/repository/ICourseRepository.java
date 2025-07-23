package js.zubigaray.course.repository;

import js.zubigaray.course.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad {@link Course}.
 *
 * <p>
 * Proporciona operaciones CRUD básicas para la entidad {@link Course} usando Spring Data.
 * </p>
 *
 * <p>
 * Extiende {@link CrudRepository} parametrizado con {@link Course} y su clave primaria {@link Long}.
 * </p>
 *
 */
@Repository
public interface ICourseRepository extends CrudRepository<Course, Long> {
}
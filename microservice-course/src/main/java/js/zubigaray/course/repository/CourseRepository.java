package js.zubigaray.course.repository;

import js.zubigaray.course.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    Long id(Long id);
}

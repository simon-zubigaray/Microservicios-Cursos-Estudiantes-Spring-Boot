package js.zubigaray.microservice_student.repository;

import js.zubigaray.microservice_student.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByCourseId(Long courseId);
}

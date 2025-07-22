package js.zubigaray.microservice_student.service;

import js.zubigaray.microservice_student.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    Student findById(Long idStudent);
    void save(Student student);
    List<Student> findByIdCourse(Long idCourse);
}

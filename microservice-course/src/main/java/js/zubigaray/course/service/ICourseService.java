package js.zubigaray.course.service;

import js.zubigaray.course.model.Course;

import java.util.List;

public interface ICourseService {
    List<Course> findAll();
    Course findByid(Long id);
    void save(Course course);
}

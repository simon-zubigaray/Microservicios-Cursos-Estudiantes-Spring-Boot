package js.zubigaray.course.service;

import js.zubigaray.course.model.Course;
import js.zubigaray.course.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService{

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findAll() {
        return (List<Course>) this.courseRepository.findAll();
    }

    @Override
    public Course findByid(Long id) {
        return this.courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        this.courseRepository.save(course);
    }
}

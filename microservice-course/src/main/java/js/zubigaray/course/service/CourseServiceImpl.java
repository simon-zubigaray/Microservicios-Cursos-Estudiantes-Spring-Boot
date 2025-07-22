package js.zubigaray.course.service;

import js.zubigaray.course.client.StudentClient;
import js.zubigaray.course.dto.StudentDTO;
import js.zubigaray.course.http.response.StudentsByCourseResponse;
import js.zubigaray.course.model.Course;
import js.zubigaray.course.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService{

    private final CourseRepository courseRepository;
    private final StudentClient studentClient;

    public CourseServiceImpl(CourseRepository courseRepository, StudentClient studentClient){
        this.courseRepository = courseRepository;
        this.studentClient = studentClient;
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

    @Override
    public StudentsByCourseResponse findStudentsByIdCourse(Long idCourse) {
        Course course = courseRepository.findById(idCourse).orElse(new Course());
        List<StudentDTO> studentDTOList = this.studentClient.findAllStudentsByCourse(idCourse);
        return StudentsByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }
}

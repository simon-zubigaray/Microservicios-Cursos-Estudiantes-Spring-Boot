package js.zubigaray.course.service;

import js.zubigaray.course.client.StudentClient;
import js.zubigaray.course.dto.StudentDTO;
import js.zubigaray.course.http.response.StudentsByCourseResponse;
import js.zubigaray.course.model.Course;
import js.zubigaray.course.repository.ICourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementación del servicio {@link ICourseService} para la gestión de cursos.
 *
 * <p>
 * Esta clase provee la lógica de negocio para operaciones sobre cursos y
 * la integración con el cliente Feign para obtener estudiantes asociados.
 * </p>
 *
 * <p>
 * Anotaciones:
 * <ul>
 *   <li>{@code @Service}: Marca esta clase como un componente de servicio de Spring.</li>
 * </ul>
 * </p>
 */
@Service
public class CourseServiceImpl implements ICourseService {

    private final ICourseRepository courseRepository;
    private final StudentClient studentClient;

    /**
     * Constructor que inyecta el repositorio de cursos y el cliente Feign de estudiantes.
     *
     * @param courseRepository repositorio para acceso a datos de cursos
     * @param studentClient cliente Feign para consultar estudiantes asociados a un curso
     */
    public CourseServiceImpl(ICourseRepository courseRepository, StudentClient studentClient) {
        this.courseRepository = courseRepository;
        this.studentClient = studentClient;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Course> findAll() {
        return (List<Course>) this.courseRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Course findByid(Long id) {
        return this.courseRepository.findById(id).orElseThrow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Course course) {
        this.courseRepository.save(course);
    }

    /**
     * {@inheritDoc}
     */
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
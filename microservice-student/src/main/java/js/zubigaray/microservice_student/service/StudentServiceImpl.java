package js.zubigaray.microservice_student.service;

import js.zubigaray.microservice_student.model.Student;
import js.zubigaray.microservice_student.repository.IStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementación del servicio {@link IStudentService} para la gestión de estudiantes.
 *
 * <p>
 * Esta clase provee la lógica de negocio para operaciones sobre estudiantes
 * y se apoya en el repositorio {@link IStudentRepository} para acceder a datos.
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
public class StudentServiceImpl implements IStudentService {

    private final IStudentRepository studentRepository;

    /**
     * Constructor que inyecta el repositorio de estudiantes.
     *
     * @param studentRepository repositorio para acceso a datos de estudiantes
     */
    public StudentServiceImpl(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Student findById(Long idStudent) {
        return studentRepository.findById(idStudent).orElseThrow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return studentRepository.findByCourseId(idCourse);
    }
}
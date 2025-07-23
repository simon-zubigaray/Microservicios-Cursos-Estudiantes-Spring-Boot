package js.zubigaray.course.controller;

import js.zubigaray.course.model.Course;
import js.zubigaray.course.service.ICourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para la gestión de cursos.
 *
 * <p>
 * Expone endpoints para consultar, crear y buscar cursos,
 * así como para obtener estudiantes asociados a un curso.
 * </p>
 *
 * <p>
 * Las rutas base comienzan con <code>/api/course</code>.
 * </p>
 *
 * @author TuNombre
 */
@RestController
@RequestMapping("/api/course")
public class CourseController {

    private final ICourseService courseService;

    /**
     * Constructor que inyecta el servicio de cursos.
     *
     * @param courseService servicio para operaciones de cursos
     */
    public CourseController(ICourseService courseService){
        this.courseService = courseService;
    }

    /**
     * Obtiene la lista de todos los cursos.
     *
     * @return ResponseEntity con la lista de cursos y estado HTTP 200 OK
     */
    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(this.courseService.findAll());
    }

    /**
     * Busca un curso por su ID.
     *
     * @param id ID del curso a buscar
     * @return ResponseEntity con el curso encontrado y estado HTTP 200 OK
     */
    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(this.courseService.findByid(id));
    }

    /**
     * Crea un nuevo curso.
     *
     * <p>
     * Si el objeto curso no es nulo, se guarda en la base de datos.
     * </p>
     *
     * @param course objeto curso recibido en el cuerpo de la petición
     */
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Course course){
        if(course != null){
            this.courseService.save(course);
        }
    }

    /**
     * Obtiene la lista de estudiantes asociados a un curso específico.
     *
     * @param idCourse ID del curso para obtener los estudiantes
     * @return ResponseEntity con la lista de estudiantes y estado HTTP 200 OK
     */
    @GetMapping("/searchStudents/{idCourse}")
    public ResponseEntity<?> findStudentsByIdCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(courseService.findStudentsByIdCourse(idCourse));
    }
}
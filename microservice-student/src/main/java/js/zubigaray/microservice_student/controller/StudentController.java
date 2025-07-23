package js.zubigaray.microservice_student.controller;

import js.zubigaray.microservice_student.model.Student;
import js.zubigaray.microservice_student.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para la gestión de estudiantes.
 *
 * <p>
 * Expone endpoints para consultar, buscar y crear estudiantes,
 * así como para obtener estudiantes filtrados por curso.
 * </p>
 *
 * <p>
 * Las rutas base comienzan con <code>/api/student</code>.
 * </p>
 *
 */
@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final IStudentService studentService;

    /**
     * Constructor que inyecta el servicio de estudiantes.
     *
     * @param studentService servicio para operaciones de estudiantes
     */
    public StudentController(IStudentService studentService){
        this.studentService = studentService;
    }

    /**
     * Obtiene la lista de todos los estudiantes.
     *
     * @return ResponseEntity con la lista de estudiantes y estado HTTP 200 OK
     */
    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(this.studentService.findAll());
    }

    /**
     * Busca un estudiante por su ID.
     *
     * @param id ID del estudiante a buscar
     * @return ResponseEntity con el estudiante encontrado y estado HTTP 200 OK
     */
    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(this.studentService.findById(id));
    }

    /**
     * Crea un nuevo estudiante.
     *
     * <p>
     * Si el objeto estudiante no es nulo, se guarda en la base de datos.
     * </p>
     *
     * @param student objeto estudiante recibido en el cuerpo de la petición
     */
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        if(student != null){
            this.studentService.save(student);
        }
    }

    /**
     * Obtiene la lista de estudiantes asociados a un curso específico.
     *
     * @param idCourse ID del curso para obtener los estudiantes
     * @return ResponseEntity con la lista de estudiantes y estado HTTP 200 OK
     */
    @GetMapping("/searchByCourse/{idCourse}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(this.studentService.findByIdCourse(idCourse));
    }
}
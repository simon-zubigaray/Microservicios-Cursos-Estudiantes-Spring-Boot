package js.zubigaray.microservice_student.controller;

import js.zubigaray.microservice_student.model.Student;
import js.zubigaray.microservice_student.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final IStudentService studentService;

    public StudentController(IStudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(this.studentService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(this.studentService.findById(id));
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        if(student != null){
            this.studentService.save(student);
        }
    }

    @GetMapping("/searchByCourse/{idCourse}")
    public ResponseEntity<?> findByCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(this.studentService.findByIdCourse(idCourse));
    };
}

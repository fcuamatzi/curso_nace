package mx.com.cuamatziinc.students.controllers;

import mx.com.cuamatziinc.students.entities.Student;
import mx.com.cuamatziinc.students.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {

        studentService.save(student);
    }

    @GetMapping
    public ResponseEntity<?> findAllStudents() {

        return ResponseEntity.ok(studentService.findAllStudents());
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<?> findStudentById(@PathVariable Long studentId) {

        return ResponseEntity.ok(studentService.findStudentById(studentId));
    }

    @GetMapping("/courses/{courseId}")
    public ResponseEntity<?> findStudentsByCourseId(@PathVariable Long courseId) {

        return ResponseEntity.ok(studentService.findStudentByCourseId(courseId));
    }
}

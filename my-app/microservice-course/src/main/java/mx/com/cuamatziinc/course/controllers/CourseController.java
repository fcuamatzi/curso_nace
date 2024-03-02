package mx.com.cuamatziinc.course.controllers;

import mx.com.cuamatziinc.course.entities.Course;
import mx.com.cuamatziinc.course.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@RequestBody Course course) {

        courseService.saveCourse(course);

    }

    @GetMapping
    public ResponseEntity<?> findALlCourses() {

        return ResponseEntity.ok(courseService.findAllCourses());
    }

    @GetMapping("/{courseId}")
    public ResponseEntity<?> findCourseById(@PathVariable Long courseId) {

        return ResponseEntity.ok(courseService.findCourseById(courseId));
    }

    @GetMapping("/students/{courseId}")
    public ResponseEntity<?> findStudentsByCourseId(@PathVariable Long courseId) {

        return ResponseEntity.ok(courseService.findStudentsByCourseId(courseId));

    }

}

package mx.com.cuamatziinc.course.clients;

import mx.com.cuamatziinc.course.controllers.dto.StudentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-students", url = "localhost:8081/students")
public interface StudentClient {

    @GetMapping("/courses/{courseId}")
    List<StudentResponse> findStudentsByCourseId(@PathVariable Long courseId);

}

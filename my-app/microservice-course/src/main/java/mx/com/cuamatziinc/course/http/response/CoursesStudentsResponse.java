package mx.com.cuamatziinc.course.http.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.com.cuamatziinc.course.controllers.dto.StudentResponse;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoursesStudentsResponse {

    private String courseName;
    private String teacher;
    private List<StudentResponse> students;

}

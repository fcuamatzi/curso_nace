package mx.com.cuamatziinc.course.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

    private String name;
    private String lastName;
    private String email;
    private Long courseId;
}

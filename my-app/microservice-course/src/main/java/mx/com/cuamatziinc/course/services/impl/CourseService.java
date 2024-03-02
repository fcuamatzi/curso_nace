package mx.com.cuamatziinc.course.services.impl;

import mx.com.cuamatziinc.course.clients.StudentClient;
import mx.com.cuamatziinc.course.controllers.dto.StudentResponse;
import mx.com.cuamatziinc.course.entities.Course;
import mx.com.cuamatziinc.course.http.response.CoursesStudentsResponse;
import mx.com.cuamatziinc.course.repositories.CourseRepository;
import mx.com.cuamatziinc.course.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentClient studentClient;
    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course findCourseById(Long courseId) {
        return courseRepository.findById(courseId).orElseThrow();
    }

    @Override
    public void saveCourse(Course course) {

        courseRepository.save(course);
    }

    @Override
    public CoursesStudentsResponse findStudentsByCourseId(Long courseId) {

        Course course = courseRepository.findById(courseId).orElse(new Course());

        List<StudentResponse> studentsResponse = studentClient.findStudentsByCourseId(courseId);

        return CoursesStudentsResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .students(studentsResponse)
                .build();
    }
}

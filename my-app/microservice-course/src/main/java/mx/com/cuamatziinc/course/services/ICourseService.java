package mx.com.cuamatziinc.course.services;

import mx.com.cuamatziinc.course.entities.Course;
import mx.com.cuamatziinc.course.http.response.CoursesStudentsResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAllCourses();
    Course findCourseById(Long courseId);

    void saveCourse(Course course);

    CoursesStudentsResponse findStudentsByCourseId(Long courseId);

}

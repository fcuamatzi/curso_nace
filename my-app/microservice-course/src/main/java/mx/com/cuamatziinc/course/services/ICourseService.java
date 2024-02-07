package mx.com.cuamatziinc.course.services;

import mx.com.cuamatziinc.course.entities.Course;

import java.util.List;

public interface ICourseRepository {

    List<Course> findAllCourses();
    Course findCourseById(Long courseId);

    void saveCourse(Course course);

}

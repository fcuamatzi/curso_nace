package mx.com.cuamatziinc.course.repositories;

import mx.com.cuamatziinc.course.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

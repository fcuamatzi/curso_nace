package mx.com.cuamatziinc.students.services;

import mx.com.cuamatziinc.students.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAllStudents();

    Student findStudentById(Long studentId);

    void save(Student student);

    List<Student> findStudentByCourseId(Long courseId);
}

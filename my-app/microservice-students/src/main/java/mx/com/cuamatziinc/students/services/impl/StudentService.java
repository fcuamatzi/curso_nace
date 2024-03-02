package mx.com.cuamatziinc.students.services.impl;

import mx.com.cuamatziinc.students.entities.Student;
import mx.com.cuamatziinc.students.repository.StudentRepository;
import mx.com.cuamatziinc.students.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudentById(Long studentId) {
        return studentRepository.findById(studentId).orElseThrow();
    }

    @Override
    public void save(Student student) {

        studentRepository.save(student);
    }

    @Override
    public List<Student> findStudentByCourseId(Long courseId) {
        return studentRepository.findAllByCourseId(courseId);
    }
}

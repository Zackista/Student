package students.test.service;

import students.test.model.entity.Student;

import java.util.List;


public interface StudentService {
    List<Student> getStudent();

    void registerStudent(Student student);
}

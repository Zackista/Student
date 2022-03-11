package students.test.service;

import students.test.model.entity.Student;
import students.test.model.entity.response.ResponseDefault;

import java.util.List;


public interface StudentService {
    List<Student> getStudent();

    ResponseDefault registerStudent(Student student);
}

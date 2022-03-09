package students.test.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import students.test.model.entity.Student;
import students.test.repository.StudentRepository;
import students.test.service.StudentService;

import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }
}

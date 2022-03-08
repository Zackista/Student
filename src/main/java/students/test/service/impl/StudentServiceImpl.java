package students.test.service.impl;

import org.springframework.stereotype.Service;
import students.test.model.entity.Student;
import students.test.service.StudentService;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    public List<Student> getStudent(){
        return Arrays.asList(new Student());
    }
}

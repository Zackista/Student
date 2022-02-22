package students.test.service.impl;

import org.springframework.stereotype.Service;
import students.test.model.Student;
import students.test.service.StudentService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    public List<Student> getStudent(){
        return Arrays.asList(new Student(
                "18766617-1",
                "Cristóbal Olivares",
                "cop.olivares@gmail.com",
                27,
                LocalDate.of(1994,4,19 )));
    }
}

package students.test.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import students.test.model.Student;
import students.test.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path="api/v1/")
public class studentController {

    private StudentService studentService;

    @GetMapping("getStudent")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }
}

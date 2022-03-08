package students.test.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import students.test.model.entity.Student;
import students.test.service.StudentService;

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

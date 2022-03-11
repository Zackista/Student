package students.test.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("registerStudent")
    public void registerStudent(@RequestBody Student student){
        studentService.registerStudent(student);
    }
}

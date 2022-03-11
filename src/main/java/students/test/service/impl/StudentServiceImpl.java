package students.test.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import students.test.model.entity.Student;
import students.test.model.entity.response.ResponseDefault;
import students.test.model.entity.response.ServiceStatus;
import students.test.repository.StudentRepository;
import students.test.service.StudentService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Log4j2
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    static Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public ResponseDefault registerStudent(Student student){

        ResponseDefault responseDefault = new ResponseDefault();
        ServiceStatus status = new ServiceStatus();

        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("email ya existente");
        }
        studentRepository.save(student);
        status.setCode("200");
        status.setDescription("estudiante ingresado");
        responseDefault.setService(status);

        return responseDefault;
    }
}

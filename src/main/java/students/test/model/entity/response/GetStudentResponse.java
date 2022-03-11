package students.test.model.entity.response;

import lombok.Data;
import students.test.model.entity.Student;

import java.util.List;

@Data
public class GetStudentResponse {
    ServiceStatus serviceStatus;
    List<Student> student;
}

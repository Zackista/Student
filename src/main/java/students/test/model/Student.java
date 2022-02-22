package students.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Student {
    String rut;
    String nombre;
    String email;
    Number edad;
    LocalDate fechaNaciemiento;
}

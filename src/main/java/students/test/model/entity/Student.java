package students.test.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tblUsuario",  schema="public")
public class Student {
    @Id
    @Column(name = "vchRut")
    String rut;

    @Column(name = "vchNombre")
    String nombre;

    @Column(name = "vchEmail")
    String email;

    @Column(name = "intEdad")
    Number edad;

    @Column(name = "dtFechaNacimiento")
    LocalDate fechaNaciemiento;
}

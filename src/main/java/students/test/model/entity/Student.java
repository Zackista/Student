package students.test.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "tbl_student",  schema="public")
public class Student {
    @Id
    @Column(name = "vchrut")
    String rut;

    @Column(name = "vchnombre")
    String nombre;

    @Column(name = "vchemail")
    String email;

    @Column(name = "intedad")
    Integer edad;

    @Column(name = "dtfechanacimiento")
    Date fechaNaciemiento;

    @Column(name = "dtmfechacreacion")
    Timestamp fechacreacion;

    @Column(name = "dtmfechaactualizacion")
    Timestamp fechaactualizacion;
}

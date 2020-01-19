package valnec.calendar.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import valnec.calendar.enums.Role;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "users")
@Data
public class User implements Serializable {
    @Id
    @Autowired
    private Long id;

    private String email;

    private Role role;
}

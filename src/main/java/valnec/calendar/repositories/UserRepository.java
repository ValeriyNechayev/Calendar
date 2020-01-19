package valnec.calendar.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import valnec.calendar.dao.User;

public interface UserRepository extends JpaRepository<User,Long> {
}

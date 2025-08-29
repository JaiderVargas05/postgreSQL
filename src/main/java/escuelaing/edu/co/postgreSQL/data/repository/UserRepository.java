package escuelaing.edu.co.postgreSQL.data.repository;

import escuelaing.edu.co.postgreSQL.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

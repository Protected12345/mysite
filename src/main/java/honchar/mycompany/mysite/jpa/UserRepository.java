package honchar.mycompany.mysite.jpa;

import honchar.mycompany.mysite.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String query);
}

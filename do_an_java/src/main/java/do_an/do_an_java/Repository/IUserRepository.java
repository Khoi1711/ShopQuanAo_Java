package do_an.do_an_java.Repository;

import do_an.do_an_java.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.username = ?1")
    User findByUsername(String username);
    @Query("SELECT r.id FROM Role r WHERE r.name = ?1")
    Long getRoleIdByName(String roleName);
//    Optional<User> findByUsername(String username);
/*
    Boolean existsByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    boolean existsByUsername(String username);*/
}

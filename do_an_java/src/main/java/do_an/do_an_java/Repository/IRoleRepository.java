package do_an.do_an_java.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository {
    @Query("SELECT r.id FROM Role r WHERE r.name = ?1")
    Long getRoleIdByName(String roleName);
}

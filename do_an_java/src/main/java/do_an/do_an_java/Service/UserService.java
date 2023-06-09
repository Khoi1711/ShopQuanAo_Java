package do_an.do_an_java.Service;

import do_an.do_an_java.Model.User;
import do_an.do_an_java.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public void save(User user){
        userRepository.save(user);
    }
}

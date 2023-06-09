package do_an.do_an_java.Validator;

import do_an.do_an_java.Validator.annotation.ValidUsername;
import do_an.do_an_java.Repository.IUserRepository;
import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context){
        if(userRepository == null)
            return true;
        return userRepository.findByUsername(username) == null;
    }
}

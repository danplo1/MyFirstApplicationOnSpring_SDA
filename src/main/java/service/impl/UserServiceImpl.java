package service.impl;


import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    //@Override
    public User create(User user) {

        if (user.getId() == null) {
            return userRepository.save(user);
        }
        return null;
    }

}

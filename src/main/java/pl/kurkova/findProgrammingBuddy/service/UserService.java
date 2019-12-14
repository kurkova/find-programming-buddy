package pl.kurkova.findProgrammingBuddy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.kurkova.findProgrammingBuddy.domain.User;
import pl.kurkova.findProgrammingBuddy.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class DbService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User saveUser(final User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}

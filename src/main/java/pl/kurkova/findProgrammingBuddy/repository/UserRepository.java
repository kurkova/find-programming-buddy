package pl.kurkova.findProgrammingBuddy.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kurkova.findProgrammingBuddy.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    List<User> findAll();

    Optional<User> findById(Long id);

    @Override
    User save(User user);

    @Override
    void deleteById (Long id);
}


package fr.foodiefriends.repository;

import fr.foodiefriends.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    @Query("SELECT yucks FROM User u WHERE u.login = ?1")
    public Iterable<User> findYucksByLogin(String login);
}

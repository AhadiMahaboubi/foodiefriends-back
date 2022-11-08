package fr.foodiefriends.repository;

import fr.foodiefriends.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}

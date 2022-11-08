package fr.foodiefriends.rest;

import fr.foodiefriends.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import fr.foodiefriends.entities.User;


@RestController
@CrossOrigin("*")
public class UserRest {
    @Autowired
    private UserRepository UserRepos;

    @GetMapping("allusers")
    public Iterable<User> getAllUsers() {
        return UserRepos.findAll();
    }

    @GetMapping("yucks/{login}")
    public Iterable<User> getUserYucksByLogin(@PathVariable String login) {
        return UserRepos.findYucksByLogin(login);
    }

}
package fr.foodiefriends.rest;

import fr.foodiefriends.entities.Yuck;
import fr.foodiefriends.repository.YuckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class YuckRest {
    @Autowired
    private YuckRepository YuckRepos;

    @GetMapping("allyucks")
    public Iterable<Yuck> getAllYucks() {
        return YuckRepos.findAll();
    }
}

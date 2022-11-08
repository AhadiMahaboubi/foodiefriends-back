package fr.foodiefriends;

import fr.foodiefriends.entities.User;
import fr.foodiefriends.entities.Yuck;
import fr.foodiefriends.repository.UserRepository;
import fr.foodiefriends.repository.YuckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

@SpringBootApplication
public class FoodiefriendsApplication implements CommandLineRunner{
	@Autowired
	private UserRepository UserRepos;

	@Autowired
	private YuckRepository YuckRepos;

	DateFormat d = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		SpringApplication.run(FoodiefriendsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Ahadi", "Mahaboubi", d.parse("02/04/1999"), "amahaboubi", "amahaboubi", "ahadimahaboubi@consultants-solutec.fr", null);
		User u2 = new User(null, "Caroline", " Martinez", d.parse("11/02/1997"), "cmartinez", "cmartinez", "carolimemartinez@consultants-solutec.fr", null);
		Stream.of(u1, u2).forEach(u -> {
			UserRepos.save(u);
		});

		Yuck y1 = new Yuck(null, "tomate");
		Yuck y2 = new Yuck(null, "thon");
		Stream.of(y1, y2).forEach(y -> {
			YuckRepos.save(y);
		});

		System.out.println("Application opérationnelle !!");
	}
}

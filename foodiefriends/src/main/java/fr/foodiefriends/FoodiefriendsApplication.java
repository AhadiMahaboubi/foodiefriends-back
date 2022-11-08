package fr.foodiefriends;

import fr.foodiefriends.entities.User;
import fr.foodiefriends.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class FoodiefriendsApplication implements CommandLineRunner{
	@Autowired
	private UserRepository UserRepos;

	public static void main(String[] args) {
		SpringApplication.run(FoodiefriendsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Ahadi", "Mahaboubi", new Date(99,03,03), "amahaboubi", "amahaboubi", "ahadimahaboubi@consultants-solutec.fr" );
		User u2 = new User(null, "Caroline", " Martinez", new Date(97,01,12), "cmartinez", "cmartinez", "carolimemartinez@consultants-solutec.fr");

		Stream.of(u1, u2).forEach(u -> {
			UserRepos.save(u);
		});


		System.out.println("Application opérationnelle !!");


	}
}

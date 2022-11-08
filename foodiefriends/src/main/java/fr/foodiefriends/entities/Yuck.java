package fr.foodiefriends.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Yuck {
	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true)
	private String ingredients;
}

package fr.foodiefriends.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	
	private String first_name;
	private String middle_name;

	@Temporal(TemporalType.DATE)
	private Date birthdate;

	@Column(unique = true)
	private String login;
	private String password;

	@Column(unique = true)
	private String email;

	@ManyToMany
	@JoinTable(
			name="user_yuck",
			joinColumns = @JoinColumn(name="user.id"),
			inverseJoinColumns = @JoinColumn(name="yuck.id")
	)
	private Set<Yuck> yucks = new HashSet<>();
}
package ro.studentconnect.entities;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "prenume")
	private String firstName;

	@Column(name = "nume")
	private String lastName;

	
}

package business.entite;

import java.util.List;

public class Person {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private List<Animal> animaux;

	public Person(long id, String firstName, String lastName, int age,List<Animal> animaux) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.animaux = animaux;
	}
	public Person() {
		
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Animal> getAnimaux() {
		return animaux;
	}
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", animaux=" + animaux
				+ ", age=" + age + "]";
	}
}

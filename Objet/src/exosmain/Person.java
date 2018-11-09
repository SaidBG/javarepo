package exosmain;

public class Person {

	private  String nom;
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	

	public void setAge(int age) {
		this.age = age;
	}


	private  String prenom;
	private int age;







	public Person(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}


	


	public  void Grandir () {
		age++;

	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}




}

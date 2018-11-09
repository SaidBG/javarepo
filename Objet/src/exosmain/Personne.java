package exosmain;

public class Personne {

	
	
	public Personne clonePersonne() {
		Personne clone = new Personne();
		clone.setAge(this.age);
		clone.setNom(this.nom);
		clone.setPrenom(this.prenom);
		clone.setPays(this.pays);
		return clone;
	}
	
	private String pays;
	
	
	
	
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

	public Personne() {
	
	}






	public Personne(String nom, String prenom, int age, String pays) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.pays= pays;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub











	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Personne [Pays = " + pays + ", Nom = " + nom + ", Prenom = " + prenom + ", Age = " + age + "]";
	}

}

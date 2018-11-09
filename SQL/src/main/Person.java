package main;

import java.util.ArrayList;
import java.util.List;

public class Person implements IObject {
	
	
	
	
	
	

	@Override
	public void processStringFromFile(List<String> list) {
		List<String> u = stringToFile();
		
		
		
		setNom(u.get(0));
		setPrenom(u.get(1));
		setAge(Integer.parseInt(u.get(2)));
		
		setAdresse(new Address ());
		
		getAdresse().setAdresse(u.get(3));
		getAdresse().setCodePostal(Integer.parseInt(u.get(4)));
		getAdresse().setVille(u.get(5));

	}	
	
	public List<String> stringToFile() {
		List <String> liste = new ArrayList();
		
		liste.add(nom);
		liste.add(prenom);
		liste.add(""+age);
		liste.add(getAdresse().getAdresse());
		liste.add(""+ getAdresse().getCodePostal());
		liste.add(getAdresse().getVille());
		
		
		return liste;
	}	

	private int id;
	private  String prenom;
	private int age;
	private  String nom;
	private Address Adresse;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public Person () {

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






	public Person(String nom, String prenom, int age,  Address Adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.Adresse = Adresse;
	}





	@Override
	public String toString() {
		return "########### \r\n" + "Personne numéro " + id + "\r\n " +  "|Nom = " + nom + " \r\n |Prenom = " + prenom + " \r\n |Age = " + age +" " + Adresse +"\r\n ~~~~~~~~~~~~~~~~~~\r\n";
	}

	public Address getAdresse() {
		return Adresse;
	}

	public void setAdresse(Address adresse) {
		Adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
































}



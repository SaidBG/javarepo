package main;

public class Address {
	private String Adresse;
	private int CodePostal;
	private String Ville;
	
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getCodePostal() {
		return CodePostal;
	}
	public void setCodePostal(int codePostal) {
		CodePostal = codePostal;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	
	public Address (String Address, int CodePostal, String Ville) {
		this.Adresse = Address;
		this.CodePostal = CodePostal;
		this.Ville = Ville;
	}
	@Override
	public String toString() {
		return "\r\n |Adresse = " + Adresse + "\r\n |CodePostal = " + CodePostal + "\r\n |Ville=" + Ville ;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}


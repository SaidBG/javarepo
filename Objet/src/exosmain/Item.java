package exosmain;

public class Item {
	public String nom;
	private double prixHT;
	private int id;

	
	public int getId() {
		return id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public double getPrixHT() {
		return prixHT;	}



	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String nom, double prixHT) {
		super();
		this.id = id;
		this.nom = nom;
		this.prixHT = prixHT;
	}
	
	
	
	
	
	



	@Override
	public String toString() {
		return "ID = "+ id + " nom =  " + nom + ", prixHT=  " + prixHT ;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

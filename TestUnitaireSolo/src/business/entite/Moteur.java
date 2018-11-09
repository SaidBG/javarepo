package business.entite;

public class Moteur {
	private long idMoteur;
	private String marqueMoteur;
	private String modeleMoteur;
	private int cylindreMoteur;
	public long getIdMoteur() {
		return idMoteur;
	}
	public void setIdMoteur(long idMoteur) {
		this.idMoteur = idMoteur;
	}
	public String getMarqueMoteur() {
		return marqueMoteur;
	}
	public void setMarqueMoteur(String marqueMoteur) {
		this.marqueMoteur = marqueMoteur;
	}
	public String getModeleMoteur() {
		return modeleMoteur;
	}
	public void setModeleMoteur(String modeleMoteur) {
		this.modeleMoteur = modeleMoteur;
	}
	public int getCylindreMoteur() {
		return cylindreMoteur;
	}
	public void setCylindreMoteur(int cylindreMoteur) {
		this.cylindreMoteur = cylindreMoteur;
	}
	public Moteur(long idMoteur, String marqueMoteur, String modeleMoteur, int cylindreMoteur) {
		super();
		this.idMoteur = idMoteur;
		this.marqueMoteur = marqueMoteur;
		this.modeleMoteur = modeleMoteur;
		this.cylindreMoteur = cylindreMoteur;
	}
	public Moteur() {
		
	}
	
}

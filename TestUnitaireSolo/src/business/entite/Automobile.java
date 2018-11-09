package business.entite;

public class Automobile {

	public Automobile(long idAuto, String marqueAuto, String modeleAuto, Frein frein, Moteur moteur) {
		super();
		this.idAuto = idAuto;
		this.marqueAuto = marqueAuto;
		this.modeleAuto = modeleAuto;
		
		this.frein = frein;
		this.moteur = moteur;
	}
	private long idAuto;
	private String marqueAuto;
	private String modeleAuto;
	private int cylindreAuto;
	private Frein frein;
	private Moteur moteur;
	public long getIdAuto() {
		return idAuto;
	}
	public void setIdAuto(long idAuto) {
		this.idAuto = idAuto;
	}
	public String getMarqueAuto() {
		return marqueAuto;
	}
	public void setMarqueAuto(String marqueAuto) {
		this.marqueAuto = marqueAuto;
	}
	public String getModeleAuto() {
		return modeleAuto;
	}
	public void setModeleAuto(String modeleAuto) {
		this.modeleAuto = modeleAuto;
	}	
	public Frein getFrein() {
		return frein;
	}
	public void setFrein(Frein frein) {
		this.frein = frein;
	}
	public Moteur getMoteur() {
		return moteur;
	}
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
}
	
package business.entite;

public class Frein {
	private long idFrein;
	private String marqueFrein;
	private String modeleFrein;
	
	
	public long getIdFrein() {
		return idFrein;
	}
	public void setIdFrein(long idFrein) {
		this.idFrein = idFrein;
	}
	public String getMarqueFrein() {
		return marqueFrein;
	}
	public void setMarqueFrein(String marqueFrein) {
		this.marqueFrein = marqueFrein;
	}
	public String getModeleFrein() {
		return modeleFrein;
	}
	public void setModeleFrein(String modeleFrein) {
		this.modeleFrein = modeleFrein;
	}
	public Frein() {
		
	}
	public Frein(long idFrein, String marqueFrein, String modeleFrein) {
		super();
		this.idFrein = idFrein;
		this.marqueFrein = marqueFrein;
		this.modeleFrein = modeleFrein;
	}
	
	
	
	
	
	
	
	
	
	
}

package exosmain;

public class SellableItem extends Item implements ISellableItem {
	private double tva;
	public SellableItem() {
		super();

		// TODO Auto-generated constructor stub
	}

	public SellableItem(int id, String nom, double prixHT, double tva) {
		super(id,nom, prixHT);
		this.tva = tva;
		// TODO Auto-generated constructor stub
	}

	

	
	
	@Override
	public String toString() {
		 String s =  super.toString() + " Tva =" + tva + " TTC = " + getPrixTTC(); ;
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getPrixTTC() {
		double ttc = getPrixHT() * (1+  tva);
		return ttc;
	}

}

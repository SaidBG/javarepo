package main;

public class Berline extends Voiture {
	
	
	
	
	
	
	
	

	
	public void demarrer() {
		// TODO Auto-generated method stub
		super.demarrer();
		System.out.println("Je suis le plus");
	}

	public Berline() {
		super();
		System.out.println("Je suis 'Berline' le fils de 'Voiture' et le petit-fils de 'Vehicule'");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Berline ber = new Berline();
		
		ber.demarrer();
		
		
		
		
		
		
	}

}

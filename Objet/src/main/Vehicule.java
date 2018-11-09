package main;

public class Vehicule {
	Motor moteur = new Motor();
	
	public void demarrer() {
		
			moteur.demarre();
			System.out.println("La voiture démarre");
			
			}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Moto moto = new Moto();
		Camion camion = new Camion();
		Voiture voiture = new Voiture();
		Berline ber = new Berline();
		
		Vehicule v = new Camion();
		
		v.demarrer();		
		
		
		
	}

}

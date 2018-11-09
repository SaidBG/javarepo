package main;

public class Camion extends Vehicule {

	
	public  void demarrer () {
		super.demarrer();
		
		System.out.println("Je suis le plus");
	}
	
	
	
	public Camion() {
		
		System.out.println("Je suis 'Camion' le fils de Vehicule");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camion camion =  new Camion();
		
		camion.demarrer(); 
	}



}
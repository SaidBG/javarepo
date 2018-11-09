package main;

public class Motor {
	public boolean isStarted = false;
	



	public boolean  demarre () {
		if (isStarted == false) {
			System.out.println("Le moteur demarre");
			return true;
		}
		else {
			System.out.println("Le moteur est deja demarrer");
			return false;
		}
	}
 public void accelere() {
	 System.out.println("La moteur accelere");
 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

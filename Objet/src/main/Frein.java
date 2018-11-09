package main;

public class Frein {
	public boolean isBrake = true;
	
	public void enclencher () {
		if (isBrake == false) {
			System.out.println("Le frein est enclenché");
			return;
		}
	}
	
	public void relacher () {
		if (isBrake == true) {
			System.out.println("Le frein est relaché");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package main;

public class Frein {
	public boolean isBrake = true;
	
	public void enclencher () {
		if (isBrake == false) {
			System.out.println("Le frein est enclench�");
			return;
		}
	}
	
	public void relacher () {
		if (isBrake == true) {
			System.out.println("Le frein est relach�");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

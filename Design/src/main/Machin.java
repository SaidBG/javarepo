package main;

public class Machin implements IBidule {

	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Singleton.getInstance().display();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getValeur() {
		// TODO Auto-generated method stub
		return Singleton.getInstance().getValeur();
	}

	@Override
	public void setValeur(int i) {
		// TODO Auto-generated method stub
	 Singleton.getInstance().setValeur(i);
	}

}

package main;

public class Observateur1 implements IObservateur {

	@Override
	public void actualiser(int temp, int hum) {
		// TODO Auto-generated method stub
		System.out.println("Temperature de l'Observateur numéro 1  =  "+ temp);
		System.out.println("Humidité de l'Observateur numéro 1  = " + hum);
	}
	
	
	public Observateur1 (Sujet subject) {
		subject.addObserver(this);
	}

}

package main;

public class Observateur2 implements IObservateur {

	@Override
	public void actualiser(int temp, int hum) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("#################################################### ");
		System.out.println("");
		System.out.println("Temperature de l'Observateur num�ro 2  =  "+ temp);
		System.out.println("Humidit� de l'Observateur num�ro 2  = " + hum);
	}
	
	
	
	public Observateur2 (Sujet subject) {
		subject.addObserver(this);
	}

	
	
}

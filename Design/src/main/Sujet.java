package main;

import java.util.ArrayList;
import java.util.List;

public class Sujet implements ISujet {

	private int temp;
	private int hum;
	
	List<IObservateur> liste = new ArrayList<>();
	
	@Override
	public void addObserver(IObservateur obs) {
		// TODO Auto-generated method stub
		liste.add(obs);
	}

	@Override
	public void removeObserver(IObservateur obs) {
		// TODO Auto-generated method stub
		liste.remove(obs);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(IObservateur i:liste) 
          i.actualiser(temp, hum);

	}
	
	public void miseAJour(int temp,int hum) {
		this.temp = temp;
		this.hum = hum;
		notifyObservers();
	}
	
	
	
	

}

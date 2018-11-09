package main;

public interface ISujet {
	
	public void addObserver(IObservateur obs);
	public void removeObserver(IObservateur obs);
	public void notifyObservers();
	
	
}

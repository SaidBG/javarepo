package main;

public class Singleton {
	private static Singleton instance = null;
	private Singleton() {   } ;
	public static Singleton getInstance() {
		if (instance == null) {
			instance  = new Singleton();
			
		}
		return instance;
		
		
	}
	
	private int valeur;
	
	
	
	
	
	public void display() {
		System.out.println("C'est du l'heure du Kiab");
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	
		
		
		
	}



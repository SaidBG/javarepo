package main;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sujet said = new Sujet();
		
		IObservateur o1 = new Observateur1(said);
		IObservateur o2 = new Observateur2(said);
	
		said.miseAJour(52, 32);*/
		
		
		Machin m1 = new Machin();
		Machin m2 = new Machin();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		
		
		m1.setValeur(10);
		m2.setValeur(5);
		System.out.println(m2.getValeur()+ "+" +s1.getValeur() + s2.getValeur() + m1.getValeur() );
		
	}

}

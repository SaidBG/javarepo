package main;

public class JeanCharles {

	Stylo bleu = new Stylo();
	Capuchon bouchon = new Capuchon();
	
	
	public void ecrire () {
		
		System.out.println("|G�rard donne le marqueur � Jean-Charles|");
		bleu.marqueur();		
		bouchon.retirer();
		System.out.println("     |Jean-Charles �cris sur le tableau blanc|");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JeanCharles user = new JeanCharles();
		
		user.ecrire();

	}

}

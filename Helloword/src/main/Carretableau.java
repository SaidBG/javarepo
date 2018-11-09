package main;
import  java.util.Scanner;
public class Carretableau {
	public static int [] calculMoyenne  (int[] tab)  {
		int stock = 0;
		for(int i = 0 ; i < tab.length  ; i++ ) {
				tab[i] = tab[i] * tab[i] ;
				

		}
		return tab ; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Combien de carré avez vous ?");
		int note = scan.nextInt();
		System.out.println("Inscrivez vos notes");

		int [] tableau = new int [note];

		for (int i = 0; i < tableau.length; i ++) {
			tableau[i] = scan.nextInt();


		}
		tableau = calculMoyenne(tableau);
		for (int i = 0; i < tableau.length; i++ ) {
			System.out.println(tableau[i]);
		}
	}



}



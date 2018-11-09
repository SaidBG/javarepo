package main;
import  java.util.Scanner;
public class Moyenne {
	
	public static double  calculMoyenne  (int[] tab)  {
		double stock = 0;
		for(int i = 0 ; i < tab.length  ; i++ ) {
			
			stock = tab[i] + stock;
			
					
		}
		return stock / tab.length; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Combien de notes avez vous ?");
		int note = scan.nextInt();
		System.out.println("Inscrivez vos notes");
				
		int [] tableau = new int [note];
		
		for (int i = 0; i < tableau.length; i ++) {
		tableau[i] = scan.nextInt();
			
					
		}
		System.out.println(calculMoyenne(tableau));
		}
		
	}



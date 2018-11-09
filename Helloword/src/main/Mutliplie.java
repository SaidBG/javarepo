package main;
import  java.util.Scanner;



public class Mutliplie {

	public static int getMultiple (int i, int s) {
		return i*s;
	}
	
	public static int getCarre (int c) throws Exception {
		return c*c;
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Choisis les opérations que tu souhaites faire");
		System.out.println("1 - Multiplacation ");
		System.out.println("2 - Carré");
		int choix = scan.nextInt();
		
		switch (choix) {
		case 1 :
			System.out.println("Inserez le chiffre à multiplier");
			int chiffre = scan.nextInt();
			System.out.println("Inserez le multiplicateur");
			int multi = scan.nextInt();
			int result = getMultiple(chiffre,multi);
			System.out.println(result);
			break;
		case 2 : 
			System.out.println("Inserez le chiffre à Carréifier");
			int chiffre1 = scan.nextInt();
			int result1 = getCarre(chiffre1);
			System.out.println(result1);
			
			
			
			break;
			
		}
			
		

		

	
	}
}

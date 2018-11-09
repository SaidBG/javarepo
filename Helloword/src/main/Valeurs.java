package main;
import java.util.Scanner;


public class Valeurs {
	public static String getInputString() throws Exception {
		byte[] bs = new byte[255];
		System.in.read(bs);

		return new String(bs);
	}
	public static int getInputInt() throws Exception {
		String s = getInputString().trim();
		return Integer.parseInt(s);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Choissisez la version 1 ou 2");
		int c = getInputInt();	



		switch(c) {

		case 1 :

			System.out.println("Ecris un nombre");
			int a = getInputInt();
			char oui = 'O';

			Scanner sc = new Scanner(System.in);

			while (oui != 'n') {


				if (a >= 100 && a <= 1000 ) {
					System.out.println(a);			

				}

				System.out.println("Voulez-vous réessayer ? (O/N)");
				oui = sc.nextLine().charAt(0);
			}


		case 2 : 
			char ou = 'O';

			Scanner scn = new Scanner(System.in);
			
			do {
				System.out.println("Ecris un nombre");
				int b = getInputInt();
				
				if (b == 500) {																							/*if (b == 500) {System.out.println("500 n'est pas accepté ");}*/
					
				}
				
				else if (b >= 100 && b <= 1000 ) {
					System.out.println(b);
				}
				
					
				System.out.println("Voulez-vous réessayer ? (O/N)");
				ou = scn.nextLine().charAt(0);
			}
			
			while (ou != 'n');
			

		}


	
	}
}




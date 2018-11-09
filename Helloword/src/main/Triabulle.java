package main;

public class Triabulle {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		boolean isordre = false;
		int stock = 0;
		int [] tableau = new int [20];	
		for(int i = 0 ; i < 20 ; i++ ){
			tableau[i] = (int)(Math.random() * 100);
			System.out.print(tableau[i]+ "  ");
		}
		System.out.println("");
		while(!isordre) {
			isordre = true;
			for(int i = 0 ; i < 19 ; i++ ){
				if (tableau[i] > tableau[i+1]) {
					stock = tableau[i];
					tableau[i] = tableau[i+1];
					tableau[i+1] = stock; 
					
					
					isordre = false;

				}
				System.out.print(tableau[i]+ "  ");

			}
			System.out.print(tableau[19]+ "  ");
			System.out.println("");
		}
	}
}

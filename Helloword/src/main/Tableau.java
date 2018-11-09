package main;

public class Tableau {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int min = 100;
		int max = 0;
		int [] tableau = new int [20];		 

		for(int i = 0 ; i < 20 ; i++ ){
			tableau[i] = (int)(Math.random() * 100);
			System.out.println(tableau[i]);

			if (tableau[i] > max   ) {
				max = tableau[i];

			}
			if (tableau[i] < min) {
				min = tableau[i];
			}
		}

		System.out.println("Valeur max    " +max);
		System.out.println("Valeur min    " +min);
	}
}

package main;

public class Dame {	

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
		int nb = 10;
		char [][] tableau = new char [nb] [nb]; 




		System.out.println("Ecris une position entre 0-9 pour la ligne et 0-9 pour la colonne");

		for(int i = 0 ; i < tableau.length ; i++ ){

			for(int y = 0 ; y < tableau[i].length ; y++ ){

				if (i == 4 || i == 5) {
					tableau[i] [y] = '▯';

				}

				else if (i %2 == 0 && y %2 == 1   ) {

					tableau [i] [y] = '▮';

				}


				else if (y % 2 == 0 && i % 2 == 1 ) {
					tableau [i] [y] = '▮';

				}

				else  {
					tableau[i] [y] = '▯';

				}

				System.out.print("   "+ tableau [i] [y]);

			}	
			System.out.println(" ");
		}

		int ligne = getInputInt();
		int colone = getInputInt();










		if (tableau[ligne] [colone] == '▮'  ) {
			System.out.println("Il y a bien un pion");
			System.out.println("Tu as 3 mouvement disponible \n 0 - en haut à gauche,\n 1 - en haut à droite,\n 2 - en bas à gauche,\n 3 - en bas à droite");
			
			
			
			
			
			int zero = getInputInt();

			switch (zero) {

			case 0 : 
				tableau [ligne-1] [colone-1] ='▮' ;
				tableau[ligne] [colone] = '▯';
				break;
				
			case 1 : 
				tableau [ligne+1] [colone-1]= '▮';
				tableau [ligne][colone] = '▯';				
				break;
				
			case 2 :
				tableau [ligne-1] [colone + 1] = '▮';
				tableau [ligne][colone] = '▯';
				break;
				
				
			case 3 : 
				tableau [ligne+1][colone+1] = '▮';
				tableau [ligne][colone] = '▯';
				break;
			
			
			
			
			
			
			
			}
				for(int i = 0 ; i < tableau.length ; i++ ){

					for(int y = 0 ; y < tableau[i].length ; y++ ){
						System.out.print("   "+ tableau [i] [y]);
					}
					System.out.println(" ");
				}
			}
		

		else {
			System.out.println("Il n'y a pas de pion");
		}



	}	

}

package main;

public class Tableausix {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		char [][] tableau = new char [10] [10]; 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i = 0 ; i < 10 ; i++ ){
			for(int y = 0 ; y < 10 ; y++ ){
			
				if (i %2 == 0 && y %2 == 1   ) {
					tableau [i] [y] = 'X';
				
				}
				
				
				else if (y % 2 == 0 && i % 2 == 1 ) {
					tableau [i] [y] = 'X';
					
					
					
					
				}
								
				
				
				
				
				else  {
					tableau[i] [y] = 'O';
				}

					System.out.print("   "+ tableau [i] [y]);

			}			
			
			
			
			
			System.out.println(" ");
		}

	}






}




package main;

public class Operations {
	
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
		System.out.println("Choisis l'op�ration que tu veux");
		System.out.println("1 - Addition");
		System.out.println("2 - Soustraction");
		System.out.println("3 - Multiplaction");
		System.out.println("4 - Division");
		int a = getInputInt();
		
		switch (a)
		{
		  case 1:
		    System.out.println("Vous avez choisis l'Addtion !");
		    System.out.println("Rentrez la premi�re valeur");
		    int b = getInputInt();
		    System.out.println("Rentrez la deuxi�me valeur");
		    int c = getInputInt();
		    System.out.println("Voil� le r�sultat");
		    int result = b + c;
		    System.out.println(result);
		    
		    break;
		  case 2:
		    System.out.println("Vous avez juste la moyenne.");
		    break;
		  case 3:
		    System.out.println("Parfait !");
		    break;
		 	    
		  case 4:
			  
		}
	}

}

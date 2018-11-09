package main;

public class Switchif {
	public static String getInputString() throws Exception {
		byte[] bs = new byte[255];
		System.in.read(bs);
		
		return new String(bs);
	}
	public static int getInputInt() throws Exception {
		String s = getInputString().trim();
		return Integer.parseInt(s);
	}
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.out.println("Ecris un chiffre entre  1 et 9 ");
		int x = getInputInt();
	
		switch (x)
		{
		  case 0 : case 1 :
		     x += 4 ;
		    break;
		  case 2 :
		    x += 8;
		    break;
		  case 3 :
		   x += 12;
		    break;
		  default:
		    System.out.println("Il faut davantage travailler.");
		}
	}

}

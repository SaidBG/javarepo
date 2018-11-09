package main;

public class Exercices {
	public static String getInputString() throws Exception {
		byte[] bs = new byte[255];
		System.in.read(bs);
		
		return new String(bs);
	}
	public static int getInputInt() throws Exception {
		String x = null;
		x.length(); 
	
		String s = getInputString().trim();
		return Integer.parseInt(s);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int age = getInputInt();			
		
		if (age >= 18) {
			System.out.println("Vous êtes un nouveau Majeur !");
		}
		else {
			System.out.println("Vous êtes Mineur ! ");
		}
	}

}

package main;

public class Majuscule {
	
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
		System.out.println("Ecrivez votre nom");
		String a = getInputString(); 
		System.out.println(a = a.toUpperCase());
	}

}

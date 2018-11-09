package main;

public class Souschaine {
	public static String getInputString() throws Exception {
		byte[] bs = new byte[255];
		System.in.read(bs);
		
		return new String(bs).trim();
	}
	public static int getInputInt() throws Exception {
		String s = getInputString().trim();
		return Integer.parseInt(s);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ecris une phrase");
		
		String a = getInputString();
		
		System.out.println("ecris un bout de cette phrase");		
		
		String b = getInputString();
		
		
		if (a.contains(b)) {
			System.out.println("C'est dans la phrase");
		}
		
		else {
			System.out.println("Ce n'est pas dans la phrase");
		}
		
		
	}

}

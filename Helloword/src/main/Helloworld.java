package main;

public class Helloworld {
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
		System.out.print("Bonjour inscrivez votre �ge !");
		int a = getInputInt();
		
		if (a > 18 && a <= 25) {
			System.out.println("Vous �tes un 'jeune' majeur !");
		}
		
		else if (a == 18) {
			System.out.println("Vous �tes un nouveau majeur");
			
		}
		
		else if (a < 18 ) {
			System.out.println("Vous n'�tes pas majeur");
			
		}
		else if (a > 18 && a > 25 ) {
			System.out.println("Vous �tes un vieux majeur");
		}
	}

}

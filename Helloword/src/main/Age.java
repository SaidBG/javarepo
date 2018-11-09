package main;

public class Age {
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
		System.out.println("Ecris ton âge");
		int a = getInputInt();
		
		if (a >= 6 && a <= 7) {
			System.out.println("Tu es un Poussin");
		}
		else if ( a >= 8 && a <=9 ) {
			System.out.println("Tu es une Pupille");
		}
		
		else if ( a >= 10 && a <=1 ) {
			System.out.println("Tu es un Minime");
		}
		
		else if ( a > 12 && a <= 65  ) {
			System.out.println("Tu es un Cadet");
		}
		
		else {
			System.out.println("Tu es trop vieux ou vieille ");
		}
		
		
	}

}






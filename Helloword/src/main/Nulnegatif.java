package main;

public class Nulnegatif {
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
		System.out.println("Inserez un chiffre ");
		int a = getInputInt();
		System.out.println("Vous avez mis " + a );
		System.out.println("Inserez un deuxiéme chiffre");
		int b = getInputInt();
		System.out.println("Vous avez mis " + b);
		int result = a + b;
		
		if (result < 0) {
			System.out.println("Votre produit est negatif");
			
		}
		else if (result > 0 ) {
			System.out.println("Votre produit est positif");
		}
		else {
			System.out.println("Vous n'avez pas mis de chiffre");
		}
	}

}

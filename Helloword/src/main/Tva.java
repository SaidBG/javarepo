package main;

public class Tva {
	public static String getInputString() throws Exception {
		byte[] bs = new byte[255];
		System.in.read(bs);

		return new String(bs);
	}
	public static int getInputInt() throws Exception {
		String s = getInputString().trim();
		return Integer.parseInt(s);
	}


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Inserez le prix Hors Taxe de votre Article");
		int a = getInputInt();
		System.out.println("Inserez le nombre d'articles");
		int b = getInputInt();
		System.out.println("Vous avez " + b + " articles et le prix est de " + a );
		System.out.println("Chosissez le pourcentage de la TVA");
		
		System.out.println("1 - 5,5 %");
		System.out.println("2 - 10 %");
		System.out.println("3 - 20 %");
		int c = getInputInt();
		double result = a * 0.2;
		
		switch (c)
		{
		case 1:
			System.out.println("Vous avez choisis 5,5 % votre prix TTC est de "  + result  * 55);
			break;
		case 2:
			System.out.println("Vous avez choisis 10 % votre prix TTC est de  "  + result * 10);
			break;
		case 3:
			System.out.println("Vous avez choisis 20 % votre prix TTC est de   "  + (result + a)  );
			break;

		
		}
	}

}

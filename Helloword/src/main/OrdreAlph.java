package main;

public class OrdreAlph {
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
		System.out.println("Ecris un nom");
		String a = getInputString();
		System.out.println("Ecris-en un deuxiéme");
		String b = getInputString();
		System.out.println("Ecris le dernier");
		String c = getInputString();

		if (a.compareTo(b) <= 0 && a.compareTo(c) <= 0 ) {
			System.out.print(a  + " ");
			if (b.compareTo(c) <= 0){
				System.out.print(b + " "+ c );	
			}
			else {
				System.out.print(c + " " + b);
			}
		}
		else if ( b.compareTo(a) <= 0 && b.compareTo(c) <= 0 ) {
			System.out.print(b);
		}
		else if (c.compareTo(a) <= 0 && c.compareTo(b) <= 0  ) {
			System.out.print(c);
		}


	}

}

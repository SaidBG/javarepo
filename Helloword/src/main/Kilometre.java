package main;

public class Kilometre {
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
		System.out.println("Ecris le nombre de miles que tu veux convertir en KM");
		int a = getInputInt();
		
		System.out.println("Voilà   " + a + "est égale à  "+ a*1.609+" km");
		
		
	}

}

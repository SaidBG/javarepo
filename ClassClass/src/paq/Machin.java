package paq;

public class Machin {
	public Machin () {
		System.out.println("Kiab = méchant");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Class<?> klass = Class.forName("paq.Machin");
		
		Machin p = (Machin)klass.newInstance();
		
		
		
	}

}

package exception;

public class TestEx {

	public static void fonctionTest() {
		String s = null;
		s.length();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			fonctionTest();
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("une erreur");
		}

	}

}

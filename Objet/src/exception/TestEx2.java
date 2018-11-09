package exception;

public class TestEx2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Fichier test = new Fichier();
		
		
	
		
		try {
			test.open();
			
			test.read();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				test.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}	
		
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		
		try {
			test.config();
		}
		
		catch(InitException ie ) {
			ie.ex
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		try {
			test.process();
			test.init();			
		}
		catch(InitException ie) {
			
			ie.printStackTrace();
			System.out.println("Une erreur");
		}
		catch (ProcessEcpetion pe) {
			pe.printStackTrace();
			System.out.println("une Erreuer");
		}
		
		finally {
			System.out.println("Finally");
		}
		
		
	}

}
*/
package exception;

public class ConfigException extends Exception {
	public static void machin() throws Exception {
	String s = null;
	s.length();
		
	}
		
		
		public static void main(String[] args) {
			try {
				machin();
			}
			catch(Exception ex) {
				ex.printStackTrace();
				System.out.println("UNE ERRRRREEEEEUUUURRRR");
			}
			finally {
				System.out.println("Finally");				
			}
			
			
		}
		// TODO Auto-generated method stub

	}


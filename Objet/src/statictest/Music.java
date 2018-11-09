package statictest; ///4069918
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Music {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fichier =null;
		File test = new File("file/muzik.mp3");
		long g = test.length() - 128;

		long nbLus = 0;
		
		String tag = "" ;
		
		
		String title = "";
		
		String artist = "";
		
		String album = "";
		
		String year = "";
		
		String comment = "";
		
		String genre = "";
		
		
		
		
		byte[] ba = new byte[128];
		
		byte [] bb = new byte [3];
		
		
		byte [] bc = new byte [30];
		
		byte [] bd = new byte [30];
		
		byte [] be = new byte [30];
		
		byte [] bf = new byte [4];
		
		byte [] bg = new byte [30];
		
		byte [] bh = new byte [1];
		
		try {
			fichier = new FileInputStream("file/muzik.mp3");

			long id = fichier.skip(g);
			
			
			fichier.read(bb);
			fichier.read(bc);
			
			 fichier.read(bd);
			
			fichier.read(be);
			
			 fichier.read(bf);
			
			 fichier.read(bg);
			
			 fichier.read(bh);
			
			tag = new String( bb , "UTF-8" );

			title = new String( bc , "UTF-8" );
			
			artist = new String( bd , "UTF-8" );
			
			album = new String( be , "UTF-8" );
			
			year = new String( bf , "UTF-8" );
			
			comment =  new String( bg , "UTF-8" );
			
			genre = new String( bh , "UTF-8" );
			
			
			
			
			
			
			
			
			System.out.println(tag+  "\n \r" +title + "\n \r" +artist + "\n \r" + album+ "\n \r" + year+ "\n \r" + comment + "\n \r" + genre);
			
		}











		catch (IOException e) {



		}

		finally {
			try {
				fichier.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
package statictest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
public class FichierLecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		FileReader fichier = null;
		FileWriter ecrire = null;
		try {
			fichier = new FileReader("file/alire");
			ecrire = new FileWriter("file/ecrire");

			char[] bs = new char[1024];

			int d = 0;

			String result = new String( bs );

			String text = "";

			while (d != -1) {


				d = fichier.read(bs);



				if (d != -1) {
					text = new String( bs , 0,d );
					
					String toWrite = text.toUpperCase();
					
					ecrire.write(toWrite);
					
					result =  result + text;

				}
				
				if ( text == "A") {
					String lower = text.toLowerCase();
					ecrire.write(lower);
					
					
					
				}




			}


			System.out.println(result);
		}



		catch (IOException e) {



		}

		finally {
			try {
				fichier.close();
				ecrire.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}


package statictest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class File {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		FileInputStream fichier = null;
		FileOutputStream ecrire = null;
		try {
			fichier = new FileInputStream("file/alire");
			ecrire = new FileOutputStream("file/ecrire");

			byte[] bs = new byte[1024];

			int d = 0;

			String result = new String( bs , "Cp1252" );

			String text = "";

			while (d != -1) {


				d = fichier.read(bs);



				if (d != -1) {
					text = new String( bs , 0,d );
					
					String toWrite = text.toUpperCase();
					
					ecrire.write(toWrite.getBytes());
					
					result =  result + text;

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
	}}
package statictest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader fichier = null;

		try {
			fichier  = new BufferedReader(new FileReader("file/alire"));

			String test = "";
			String result = "";
			while ( test != null) {
				

				test = fichier.readLine();
			
				
				if (test != null) {
					result = result + test + "\n ";
				}

				}
			
			System.out.println(result);
			
			
			
			
			
			
			
			}



		catch (IOException e) {
			e.printStackTrace();
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



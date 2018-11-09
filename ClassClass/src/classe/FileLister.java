package classe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLister implements ILister {

	@Override
	public List<String> list() {
		// TODO Auto-generated method stub
		BufferedReader fichier = null;
		List <String> list = new ArrayList();
	
			try {
				fichier  = new BufferedReader(new FileReader("config/txt.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String test = "";
			String result = "";
			while ( test != null) {
				try {
					test = fichier.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if ( test != null) {
					
					list.add(test);
				}
				
				
			
		
		
		
			}
		
		
		return list;
	}
			

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("kkkkkkkkkkkKKKKKIIIIIIIIIIIIIIIIIIAAAAAAAAAAAAAAAAAAAaaaaaaaabbbbbbbbbb");

	}
	
	
	


}

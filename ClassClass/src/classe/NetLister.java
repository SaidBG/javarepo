package classe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class NetLister implements ILister {




	@Override
	public List<String> list() throws Exception  {




		
		BufferedReader fichier = null;
		InputStream is = null;
		List <String> list = new ArrayList<>();
		try {
						
		URL u = new URL ("http://montpellier.fr");
		URLConnection ux = u.openConnection();
		is = ux.getInputStream();
		fichier = new BufferedReader(new InputStreamReader(is));
				

		String test = "";
	
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
		}
		catch (IOException e) {
			
		}
		

		return list;
		


	}




	@Override
	public void display() {


	}

}

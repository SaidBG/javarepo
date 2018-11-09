package url;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class NetManager {
	private String url;
	private String balise;
	private String result;
	private InputStream is;

	public NetManager(String url) {
		this.url = url; 
	}	



	public void display () {
		String result = "";
		InputStream is = null;	
		try {
			URL u = new URL (url);
			URLConnection ux = u.openConnection();
			is = ux.getInputStream();


			byte[] buf = new byte[1024];
			int n = 0;


			while ( (n = is.read(buf)) >0) {
				String txt = new String(buf,0,n);
				result +=  txt;

			}
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		finally {
			try {
				is.close();				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(result);
	}


	//public  int count (String balise) {
		
		
		//return;


	
	}






























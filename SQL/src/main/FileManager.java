package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	File fichier = new File("file/csv.txt");
	public void save (IObject i) {
		List<String> s = i.stringToFile();
		String t = "";
		for (String h : s) {
			t += h +",";			
		}
		t = t.substring(0,t.length()-1);
		try {
			Writer ecrire = new FileWriter("file/"+i.getId());
			ecrire.write(t);

			ecrire.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void load (IObject i) {
		BufferedReader lecture = null;
		try {
			lecture  = new BufferedReader(new FileReader("file/"+i.getId()));
			String s = lecture.readLine();
			
			List<String> a = s.split(",");
			
			i.processStringFromFile(s);
			
			
			lecture.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}
}

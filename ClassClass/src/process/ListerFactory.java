package process;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import classe.ILister;
import classe.Person;

public class ListerFactory {
	private static String classe;
	
	
	static FileInputStream fichier = null;

	public static ILister newInstance () throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		File test = new File("config/lister.cfg");

		Properties p = new Properties();
		
		fichier = new FileInputStream(test);
		
		p.load(fichier);			
		
		classe = p.getProperty("class");
		
		Class <?> klass = Class.forName(classe);
		
		
		ILister a = (ILister)klass.newInstance();
		
		return a;


	}











}

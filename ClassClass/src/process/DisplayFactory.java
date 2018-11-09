package process;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import classe.IDisplay;


public class DisplayFactory {
	private static String classe;

	static FileInputStream fichier = null;

	public static IDisplay newInstance () throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		File test = new File("config/lister.cfg");

		Properties p = new Properties();
		
		fichier = new FileInputStream(test);
		
		p.load(fichier);			
		
		classe = p.getProperty("class2");
		
		Class <?> klass = Class.forName(classe);
		
		
		IDisplay a = (IDisplay)klass.newInstance();
		
		return a;

}
}

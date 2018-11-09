package morph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PolyTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		TestCfg nathan = new TestCfg("file/said.txt");
		
		 nathan.loadCfg();
			
		System.out.println(nathan.toString());
			
	
		
		

}
}
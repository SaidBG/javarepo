package paq;

import java.util.List;

import classe.ConsoleDisplay;
import classe.FileLister;
import classe.IDisplay;
import classe.ILister;
import classe.MemLister;
import classe.NetLister;
import process.DisplayFactory;
import process.ListerFactory;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, Exception {
		// TODO Auto-generated method stub
		
		ILister t;
		t = (ILister)ListerFactory.newInstance();
		IDisplay s;
		s = (IDisplay) DisplayFactory.newInstance();
		
		
		if (t instanceof MemLister) {
			s.display("Je suis MemLister");
			}
		else if (t instanceof FileLister ) {
			s.display("Je suis FileLister");
		}
			
		else if (t instanceof NetLister) {
			s.display("Je suis NetLister");
		}
	
			List <String> html = t.list();
			
			
			for (String h : html) {
				s.display(h);
				
				
			}
			
		
		
		
 	}

}






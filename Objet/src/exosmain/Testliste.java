package exosmain;

import java.util.ArrayList;
import java.util.List;

public class Testliste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> x = new ArrayList<String>();


		for (int i = 0; i < 10; i++ ) {
			
			String m = i + "--" + Math.random();
			
			x.add(m);
		}

		List<String> supprimer = new ArrayList<String>();
		for (String test  : x ) {
			
			String premier = test.substring(0,1);
			
			int deux = Integer.parseInt(premier);
			
			if (deux % 2 == 0 ) {
			
				supprimer.add(test);
			
			}
		
		}


		
		
		x.removeAll(supprimer);
		
		for (String test  : x ) {
		
			System.out.println(test);
		
		}

	}


}


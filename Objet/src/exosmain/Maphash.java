package exosmain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maphash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> pair = new ArrayList();
		List<Integer> impair = new ArrayList();

		Map <String, List<Integer>> map = new HashMap<String, List<Integer>>();


		for(int i = 0 ; i < 100 ; i++ ){
			int x = (int)(Math.random() * 100);
		

			if (x % 2 == 0) {
				
				pair.add(x);
				map.put("PAIR", pair);
				
			} else {
				
				impair.add(x);
				map.put("IMPAIR", impair);
			}

		}



		for (String s : map.keySet()) {
			
		 	System.out.print(s+" ");
			 List<Integer> cle = map.get(s);
			 for (Integer i : cle) {
				 	System.out.print(i+ " ");
			
			 }
			 	System.out.println();
		
			
		}

		







}
}

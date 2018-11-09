package exosmain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Pays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Personne kiab = new Personne("Kiab", "GENTIL",20, "FR");
		Personne nat = new Personne ("Natalia", "GENTIL", 20, "DE");
		Personne ger = new Personne ("Gerard", "GENTIL", 20, "NL");
		
		List<Personne> country = new ArrayList<Personne>();
		
		
		country.add(kiab);
		country.add(nat);
		country.add(ger);
		
		Map<String,Personne> ranger = new HashMap<String,Personne>();
		for (Personne test   : country ) {
			
			ranger.put(test.getPays(),test);
			
			
		
			}
		
		for (String s : ranger.keySet()) {
			 Personne cle = ranger.get(s);
			 System.out.println("______________________________________________________________");
			System.out.println(s + " ===== " + cle);
			
			
		}
		
		for (Personne t : country) {
			t.setAge(0);
			
		}
		
		System.out.println("#####################################################################");
		for (String s : ranger.keySet()) {
			 Personne cle = ranger.get(s);
			
			 System.out.println(s+"|" + " ===== " + cle);
			  System.out.println("_______________________________________________________________________");
		}
		


	}
}



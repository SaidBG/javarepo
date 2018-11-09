package exosmain;

import java.util.ArrayList;
import java.util.List;

public abstract class Prototype {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne un = new Personne("Nathan","Gentil", 95, "Japon" );
		Personne deux = new Personne("Nathan","Mechant", 95, "Japon" );
		Personne trois = new Personne("Nathan","LaPerse", 95, "Japon" );
		List <Personne> liste = new ArrayList();
		
		
		liste.add(un);
		liste.add(deux);
		liste.add(trois);
		
		System.out.println(liste.toString());
		
		Personne test0 = un.clonePersonne();
		Personne test1 =deux.clonePersonne();
		Personne test2 = trois.clonePersonne();
		test0.setAge(0);
		test1.setAge(0);
		test2.setAge(0);
		
		
		System.out.println(test0.toString());
		
		System.out.println(un.toString());
	}

}

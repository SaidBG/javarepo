package main;

import junit.framework.TestCase;
import testjunit.Exercice1;

public class TestExercice1 extends TestCase{

	Exercice1 test = new Exercice1();
	public void testAppend () {		

		String s = "Nathan bg";	  
		test.append(s);	 
		assertEquals(test.getMyString(), "Nathan bg");	  
	}


	public void testPurge() {
		test.purge();
		assertEquals(test.getMyString(), "");
	}

	public void testDecrement() {
		String s = "Nathanbg";	  
		test.append(s);	 
		int lg = test.getMyString().length();		
		test.decrement();
		
		
		assertEquals(lg - 1, test.getMyString().length()  );

	}


}

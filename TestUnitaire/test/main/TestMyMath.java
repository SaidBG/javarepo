package main;

import junit.framework.TestCase;
import testjunit.MyMath;

public class TestMyMath extends TestCase {

	MyMath test = new MyMath();
	
	public void testAbs () {
		double d = -8;
	double a  = test.abs(d);
		assertEquals(a, 8.0);
		
	}
	
	public void testSqrt () {
		
		try {
		int sqr = -4;
		int t = test.sqrt(sqr);
		
		
		assertEquals(t, 2);
		}
		catch (Exception e) {
			
		}
	}
	
	
	
	
	
	public void testMin() {
		int a = 10;
		int b = 5;
		int c = test.min(a, b);
		
		assertEquals(c, 5);
	}
	
}

package main;

import junit.framework.TestCase;
import testjunit.Mathe;

public class TestMathe extends TestCase{
	public void testSqr() {
		long b = 5;
		long c =  new Mathe().sqr(b);
		assertEquals(c, b*b);
				
	}
}

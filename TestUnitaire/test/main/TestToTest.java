package main;

import junit.framework.TestCase;
import testjunit.ToTest;

public class TestToTest extends TestCase {
	public void testInc() {
		int i = 1;
		int j = new ToTest().inc(i);
		assertEquals(j,i+1);
		}
}

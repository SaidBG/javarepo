package main;
import junit.framework.TestCase;
import testjunit.Concat;

public class TestConcat extends TestCase {
	public void testConcat () {
		String a = "A";
		String b = "B";
		String c =  new Concat().append(a,b);
		assertEquals(c, a+b);
		try {
			c = new Concat().append(null, null);
			assertNotNull(c, a+b);
			assertEquals(c, a+b);
			
		} catch (Exception e) {
			assertNotNull(e);
		}
		
		
	}
	
}

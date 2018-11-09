package main;

import java.util.List;

import junit.framework.TestCase;
import testjunit.ListeCrea;

public class TestListeCrea extends TestCase{

	public void testCreateList () {
		int y = 0;
		List<String> c = new ListeCrea().createList(y);
		assertEquals(y, c.size());
		
		
		
		y = 10;
		c = new ListeCrea().createList(y);		
		assertEquals(y, c.size());

		y = -1;
		c = new ListeCrea().createList(y);
		
		
		y  = 10;
		String a = null;
		List<String> l = new  ListeCrea().createList(y, a);
		
		assertEquals(l.get(1),a + "Said" );
		assertNotNull(l.get(1));
		
	
	}
}

package main;

import junit.framework.TestCase;
import maion.SetSet;

public class TestSetSet extends TestCase {
	SetSet set;
	int initNb = 0;
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		set = new SetSet();
		set.list().add("AAA");
		set.list().add("BBB");
		set.list().add("CCC");
		initNb = 3;
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}



	public void testAdd() {
		String s = "Nathan";
		set.add(s);

		assertEquals(set.list().size(), initNb+1);
		assertTrue(set.list().contains(s));
		set.add(null);



	}

	public void testList () {	

		assertEquals(set.list().size(), initNb);

	}

	public void testRemove () {
		String s;
		
		
		s = null;
		set.remove(s);
		assertEquals(set.list().size(),initNb);
		
		s = "AAA";	
		set.remove(s);

		assertFalse(set.list().contains(s));
		
		
		
		
		
		
	}

	public void testUpdate () {
		String oldVal = "AAA";
		String newVal = "Nathan";
		set.update(oldVal, newVal);		


		assertEquals(set.list().size(), initNb);
		assertTrue(set.list().contains(newVal));
		assertFalse(set.list().contains(oldVal));

		oldVal = null;
		newVal = null;
		set.update(oldVal, newVal);		

		assertEquals(set.list().size(), initNb);



		oldVal = "AAA";
		newVal = null;
		set.update(oldVal, newVal);
		assertEquals(set.list().size(), initNb);

		oldVal = null;
		newVal = "Natalia";
		set.update(oldVal, newVal);
		assertEquals(set.list().size(), initNb);

		assertFalse(set.list().contains(newVal));

		oldVal = "Nathan";
		newVal = "Natalia";
		set.update(oldVal, newVal);

		assertFalse(set.list().contains(oldVal));
		assertEquals(set.list().size(), initNb);


	}


	/*
	oldVal = "EEE";
	newVal = "XXX";
	set.update(oldVal, newVal);

	assertTrue(set.list().contains(newVal));
	assertFalse(set.list().contains(oldVal));
	 */





}

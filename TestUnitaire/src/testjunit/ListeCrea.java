package testjunit;

import java.util.ArrayList;
import java.util.List;



public class ListeCrea {
	public List<String> createList (int nombreDeString) {
		if (nombreDeString < 0) {
			return null;
		}
		List<String> list = new ArrayList();
		
		for (int i = 0; i<nombreDeString;i++) {
			list.add("Said");
		}
		
		return list;
		
		
	}
	public List<String> createList (int nombreDeString,String prefix) {
		if (nombreDeString < 0) {
			return null;
		}
		if (prefix == null) {
			return null;
		}
		List<String> list = new ArrayList();
		
		for (int i = 0; i<nombreDeString;i++) {
			list.add(prefix + "Said");
		}
		
		return list;
		
		
	}
	
	
	
	
	
	
	
	
	
}

package maion;

import java.util.Set;
import java.util.TreeSet;

public class SetSet {
	Set<String> set = new TreeSet();

	public void add(String s) {
		if (s == null) {
			return;	
		}	
		set.add(s);		
	}

	public Set<String> list() {
		return set;
	}

	public void remove(String s) {
		if  (s == null) {
			return;
			}		
		else {
			set.remove(s);
		}
	}





	public void update (String oldVal, String newVal) {
		if (newVal == null || oldVal == null) {
			return;
		}
		else if (!set.contains(oldVal) || set.contains(newVal)) {
			return;
		}
		else {
			set.remove(oldVal);
			set.add(newVal);
		}

	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}


}

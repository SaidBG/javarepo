package main;

import business.entite.Race;
import persistence.dao.RaceDao;

public class Testation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RaceDao test =  new RaceDao ();
		Race create = new Race (4, "Nathan", 10, "Nul");
		Race update = new Race (4, "Nathdeux", 10, "Nul");
		
		try {
			//System.out.println(test.findList());
			//test.create(create);
			//System.out.println(test.findById(1).toString());
			//test.deleteById(3);
			test.updateById(update);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}

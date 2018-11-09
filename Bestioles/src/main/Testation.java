package main;

import business.entite.Specie;
import persistence.dao.SpecieDao;

public class Testation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecieDao test = new SpecieDao ();
		Specie create = new Specie(8, "nathan","nathdeux");
		Specie update = new Specie (38,"natheux" ,"nath" );
		
		try {
			test.create(create);
			//System.out.println(test.findById(38).toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

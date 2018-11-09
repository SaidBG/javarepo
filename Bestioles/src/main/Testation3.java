package main;

import business.entite.Animal;
import business.entite.Specie;
import persistence.dao.AnimalDao;

public class Testation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalDao test = new AnimalDao();
		Specie test1 = new Specie(5, "Phenix", "Oiseau");
		Animal create = new Animal(3, "Nathan", "Canidé", "Blanc", test1);
		Animal update = new Animal (90, "Natheux","Canidé", "Rouge", test1);
		
		try {
			//test.create(create);
			//test.updateById(update);
			System.out.println(test.findList().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

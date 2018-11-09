package main;

import java.util.ArrayList;
import java.util.List;

import business.entite.Animal;
import business.entite.Person;
import persistence.dao.AnimalDao;
import persistence.dao.PersonDao;

public class Testation4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		PersonDao pao = new PersonDao ();
		Person p = pao.findById(2);
		AnimalDao ad = new AnimalDao();
		List<Animal> l = new ArrayList<>();
		p.setAge(99);
		Animal a = ad.findById(91);
		l.add(a);
		p.setAnimaux(l);
		
		pao.deleteById(16);
		
		
		

	}

}

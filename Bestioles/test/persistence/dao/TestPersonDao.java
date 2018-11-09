package persistence.dao;

import java.util.ArrayList;
import java.util.List;

import business.entite.Animal;
import business.entite.Person;
import business.entite.Specie;
import exception.SqlInserterException;
import persistence.exception.DaoException;
import persistence.pere.TU_Pere;

public class TestPersonDao extends TU_Pere {
	PersonDao daoPerson = new PersonDao();
	Person testPerson = null;
	AnimalDao daoAnimal = new AnimalDao();
	Animal testAnimal = null;
	SpecieDao daoSpecie = new SpecieDao();
	Specie testSpecie = null;
	private int realNb = 0;
	private String name = "";

	public void setUp() throws Exception {			
		super.setUp();
		realNb = getInserter().select("select count(id_Person) from person").getDataAsInt();
	}



	public void testList() throws DaoException {
		List<Person> listPerson = daoPerson.findList();		
		assertEquals(realNb,listPerson.size());
	}
	
	
	public void testFindById() throws DaoException, SqlInserterException {
		testPerson = daoPerson.findById(13);
		name = getInserter().select("select person.FirstName from person where id_Person = 13").getDataAsString();
		assertEquals(name,testPerson.getFirstName());	
	}
	
	public void testDeleteById() throws DaoException {
		daoPerson.deleteById(1);
		List<Person> list = daoPerson.findList();
		assertEquals(realNb - 1, list.size());	
	}
	
	
	public void testUpdate() throws DaoException, SqlInserterException {
		List<Animal> listAnimal = daoAnimal.findList();	
		testPerson = new Person  (13, "Nathan", "Nullos", 15, listAnimal);
		testPerson = daoPerson.updateById(testPerson);
		name =  getInserter().select("select person.FirstName from person where id_Person = 13").getDataAsString();
		assertEquals(testPerson.getFirstName(), name);
		Person a = daoPerson.updateById(null);
		assertNull(a);
	}

	public void testCreate () throws DaoException {
		testSpecie = new Specie(42, "Nathan", "Dog");
		List<Animal> listAnimal = new ArrayList<>();
		listAnimal.add(daoAnimal.findById(5));
		listAnimal.add(daoAnimal.findById(6));
		testPerson = new Person (0, "NathGentil", "Nullos",15,listAnimal); 
		daoPerson.create(testPerson);
		List<Person> list  = daoPerson.findList();		
		assertEquals(realNb+1, list.size());
		Person nulos = daoPerson.findById(testPerson.getId());
		assertEquals(nulos.getFirstName(),testPerson.getFirstName());
		nulos = daoPerson.create(null);
		assertNull(nulos);
	}





}

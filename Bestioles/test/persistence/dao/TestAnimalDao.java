package persistence.dao;

import java.util.List;

import business.entite.Animal;
import business.entite.Specie;
import exception.SqlInserterException;
import persistence.exception.DaoException;
import persistence.pere.TU_Pere;

public class TestAnimalDao extends TU_Pere {
	AnimalDao dao = new AnimalDao();
	Animal test = null;
	Specie specie = null;
	SpecieDao da2 = null;
	private int realNb = 0;
	private String name = "";
	
	public void setUp() throws Exception {			
		super.setUp();
		realNb = getInserter().select("select count(id_Animal) from animal").getDataAsInt();
	}
	
	
	public void testList() throws Exception {
		List<Animal> list = dao.findList();
		assertEquals(realNb, list.size());
	}
	
	
	
	public void testCreate () throws DaoException {
		specie = new Specie(42, "Nathan", "Dog");
		test = new Animal(1, "NathQuatre", "Female", "Rouge", specie);
		dao.create(test);
		List<Animal> list  = dao.findList();		
		assertEquals(realNb+1, list.size());
		Animal nulos = dao.findById(test.getId());
		assertEquals(nulos.getName(),test.getName());
		nulos = dao.create(null);
		assertNull(nulos);		
	}
	
	public void testFindById() throws Exception {	
		test = dao.findById(9);
		name = getInserter().select("select animal.Name  from animal where id_Animal = 9").getDataAsString();
		assertEquals(test.getName(), name);
		test = dao.findById(-33);
		assertNull(test);
	}

	public void testDeleteById() throws DaoException {
		dao.deleteById(9);
		List<Animal> list = dao.findList();
		assertEquals(realNb - 1, list.size());		
	}
	
	public void testUpdate () throws DaoException, SqlInserterException {
		specie = new Specie (6,"DRAGONUS", "NATUS");
		test = new Animal(9, "NathQuatre", "Female", "Rouge", specie);		
		test = dao.updateById(test);
		name =  getInserter().select("select animal.Name from animal where id_Animal = 9").getDataAsString();
		assertEquals(test.getName(), name);
		Animal a = dao.updateById(null);
		assertNull(a);
	}
}
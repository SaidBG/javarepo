package persistence.dao;

import java.util.List;

import business.entite.Specie;
import exception.SqlInserterException;
import persistence.exception.DaoException;
import persistence.pere.TU_Pere;

public class TestSpecieDao extends TU_Pere{
	private SpecieDao dao = new SpecieDao();
	private Specie test = null;
	private int realNb = 0;
	private String name = "";
	@Override
	public void setUp() throws Exception {			
		super.setUp();
		realNb = getInserter().select("select count(id_specie) from specie").getDataAsInt();
	}
	public void testList() throws Exception {
		List<Specie> list = dao.findList();
		assertEquals(realNb, list.size());
	}

	public void testCreate() throws Exception {
		test = new Specie(0, "Nathan", "Dog");
		test = dao.create(test);
		List<Specie> list = dao.findList();
		assertEquals(realNb +1, list.size());
		Specie ret = dao.findById(test.getId());
		assertEquals(ret.getCommonName(), test.getCommonName());
		ret = dao.create(null);
		assertNull(ret);
	}


	public void testFindById() throws Exception {	
		test = dao.findById(6);
		name =  getInserter().select("select specie.CommonName  from specie where id_Specie = 6").getDataAsString();
		assertEquals(test.getCommonName(), name);
		test = dao.findById(-337);
		assertNull(test);
	}

	public void testDeleteById() throws DaoException {
		dao.deleteById(6);
		List<Specie> list = dao.findList();
		assertEquals(realNb - 1, list.size());		
	}
	
	public void testUpdate () throws DaoException, SqlInserterException {
		test = new Specie (6,"DRAGONUS", "NATUS");
		dao.updateById(test);
		name =  getInserter().select("select specie.CommonName  from specie where id_Specie = 6").getDataAsString();
		assertEquals(test.getCommonName(), name);
		Specie a = dao.updateById(null);
		assertNull(a);
		
	}
	
	
	
}

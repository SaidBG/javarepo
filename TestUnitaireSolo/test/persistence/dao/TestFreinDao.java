package persistence.dao;

import java.util.ArrayList;
import java.util.List;

import business.entite.Automobile;
import business.entite.Frein;
import business.entite.Moteur;
import exception.SqlInserterException;
import persistence.exception.DaoException;
import persistence.pere.TU_Pere;

public class TestFreinDao  extends TU_Pere {
	
	
	
	int realNb = 0;
	AutomobileDao daoAuto = new AutomobileDao();
	FreinDao daoFrein = new FreinDao();
	MoteurDao daoMoteur = new MoteurDao();
	Automobile testAuto = null;
	Moteur testMoteur = null;
	Frein testFrein = null;
	
	
	
	public void setUp() throws Exception {			
		super.setUp();
		
		realNb = getInserter().select("select count(id) from frein").getDataAsInt();
	}
	
	
	public void testList() throws DaoException {
		List<Frein> listAuto = daoFrein.findList();		
		assertEquals(realNb,listAuto.size());
	}
	
	public void testFindById() throws DaoException, SqlInserterException {
		testFrein = daoFrein.findById(4);
		String name = getInserter().select("select frein.marque from frein where id = 4").getDataAsString();
		assertEquals(name,testFrein.getMarqueFrein());	
	}

	
	public void testDeleteById() throws DaoException {
		testFrein= new Frein  (6, "Gerard", "Version2");
		daoFrein.create(testFrein);	
		daoFrein.deleteById(6);		
		assertNull(daoFrein.findById(6));	
	}
	
	

	public void testCreate () throws DaoException {
		List<Frein> listFrein = new ArrayList<>();
		
		testFrein= new Frein  (9, "Gerard", "Version2");
		daoFrein.create(testFrein);		
		listFrein.add(testFrein);		
		List<Frein> list  = daoFrein.findList();		
		assertEquals(realNb+1, list.size());
		Frein nulos = daoFrein.findById(testFrein.getIdFrein());
		assertEquals(nulos.getMarqueFrein(),testFrein.getMarqueFrein());
		nulos = daoFrein.create(null);
		assertNull(nulos);
	}
	
	public void testUpdate() throws DaoException, SqlInserterException {
		List<Frein> listFrein = daoFrein.findList();	
		testFrein = daoFrein.findById(1);
		
		testAuto = new Automobile  (1, "Honda", "CRX", testFrein, testMoteur);
		testAuto = daoAuto.updateById(testAuto);
		String name =  getInserter().select("select automobile.marque from automobile where id = 1").getDataAsString();
		assertEquals(testAuto.getMarqueAuto(), name);
		Automobile a = daoAuto.updateById(null);
		assertNull(a);
	}
	
	
	

}

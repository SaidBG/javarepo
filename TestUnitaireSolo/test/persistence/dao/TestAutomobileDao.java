package persistence.dao;

import java.util.ArrayList;
import java.util.List;


import business.entite.Automobile;
import business.entite.Frein;
import business.entite.Moteur;

import exception.SqlInserterException;
import persistence.exception.DaoException;
import persistence.pere.TU_Pere;

public class TestAutomobileDao extends TU_Pere {
	int realNb = 0;
	AutomobileDao daoAuto = new AutomobileDao();
	FreinDao daoFrein = new FreinDao();
	MoteurDao daoMoteur = new MoteurDao();
	Automobile testAuto = null;
	Moteur testMoteur = null;
	Frein testFrein = null;
	
	
	
	public void setUp() throws Exception {			
		super.setUp();
		
		realNb = getInserter().select("select count(id) from automobile").getDataAsInt();
	}
	
	public void testList() throws DaoException {
		List<Automobile> listAuto = daoAuto.findList();		
		assertEquals(realNb,listAuto.size());
	}
	
	
	
	public void testFindById() throws DaoException, SqlInserterException {
		testAuto = daoAuto.findById(4);
		String name = getInserter().select("select automobile.marque from automobile where id = 4").getDataAsString();
		assertEquals(name,testAuto.getMarqueAuto());	
	}
	
	
	public void testDeleteById() throws DaoException {
		daoAuto.deleteById(1);
		List<Automobile> list = daoAuto.findList();
		assertEquals(realNb - 1, list.size());	
	}
	
	
	public void testUpdate() throws DaoException, SqlInserterException {
		List<Automobile> listAuto = daoAuto.findList();	
		testFrein = daoFrein.findById(1);
		testMoteur = daoMoteur.findById(1);
		testAuto = new Automobile  (1, "Honda", "CRX", testFrein, testMoteur);
		testAuto = daoAuto.updateById(testAuto);
		String name =  getInserter().select("select automobile.marque from automobile where id = 1").getDataAsString();
		assertEquals(testAuto.getMarqueAuto(), name);
		Automobile a = daoAuto.updateById(null);
		assertNull(a);
	}
	
	
	public void testCreate () throws DaoException {
		List<Automobile> listAuto = new ArrayList<>();
		testFrein = daoFrein.findById(1);
		testMoteur = daoMoteur.findById(2);
		testAuto = new Automobile  (1, "Trueno", "AE-86", testFrein, testMoteur);
		daoAuto.create(testAuto);		
		listAuto.add(testAuto);		
		List<Automobile> list  = daoAuto.findList();		
		assertEquals(realNb+1, list.size());
		Automobile nulos = daoAuto.findById(testAuto.getIdAuto());
		assertEquals(nulos.getMarqueAuto(),testAuto.getMarqueAuto());
		nulos = daoAuto.create(null);
		assertNull(nulos);
	}
	


	
	
	
	

}

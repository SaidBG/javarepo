package persistence.dao;

import java.util.ArrayList;
import java.util.List;

import business.entite.Automobile;
import business.entite.Frein;
import business.entite.Moteur;
import exception.SqlInserterException;
import persistence.exception.DaoException;
import persistence.pere.TU_Pere;

public class TestMoteurDao extends TU_Pere {
	
	
	
	int realNb = 0;
	AutomobileDao daoAuto = new AutomobileDao();
	FreinDao daoFrein = new FreinDao();
	MoteurDao daoMoteur = new MoteurDao();
	Automobile testAuto = null;
	Moteur testMoteur = null;
	Frein testFrein = null;
	
	
	
	public void setUp() throws Exception {			
		super.setUp();
		
		realNb = getInserter().select("select count(id) from moteur").getDataAsInt();
	}
	
	
	public void testList() throws DaoException {
		List<Moteur> listAuto = daoMoteur.findList();		
		assertEquals(realNb,listAuto.size());
	}
	
	public void testFindById() throws DaoException, SqlInserterException {
		testMoteur = daoMoteur.findById(4);
		assertNotNull(testMoteur);
		String name = getInserter().select("select moteur.marque from moteur where id = 4").getDataAsString();
		assertEquals(name,testMoteur.getMarqueMoteur());	
	}

	
	public void testDeleteById() throws DaoException {
		testMoteur = new Moteur  (6, "Gerard", "Version5", 98);
		daoMoteur.create(testMoteur);	
		daoMoteur.deleteById(6);		
		assertNull(daoMoteur.findById(6));	
	}
	
	

	public void testCreate () throws DaoException {		
		testMoteur = new Moteur  (0, "Gerard", "Version2", 7);
		daoMoteur.create(testMoteur);		
		List<Moteur> list  = daoMoteur.findList();		
		assertEquals(realNb+1, list.size());
		Moteur nulos = daoMoteur.findById(testMoteur.getIdMoteur());
		assertEquals(nulos.getMarqueMoteur(),testMoteur.getMarqueMoteur());
		nulos = daoMoteur.create(null);
		assertNull(nulos);
	}
	
	
	
	
	

}

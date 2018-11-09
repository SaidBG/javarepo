package persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.entite.Animal;
import business.entite.Person;
import business.entite.Specie;
import persistence.exception.DaoException;
import persistence.manager.JDBCManager;

public class PersonDao implements IDAO<Person> {

	public final static String Select_byId = "select * from person where id_Person=?";
	public final static String First_Select = "select * from person";
	public final static String SECOND_Select = "select animal.*,specie.* from animal__person as pa \r\n" + 
			"inner join animal on animal.id_Animal = pa.id_Animal\r\n" + 
			"inner join specie on animal.id_Specie = specie.id_Specie where pa.id_person=?";

	public final static String _SelectId = "select * from animal where id_Animal = ?";
	public final static String _Insert = "insert into person (FirstName,LastName,Age) values (?,?,?) ";
	public final static String AnimalPerson_Insert = "insert into animal__person (id_Person,id_Animal) values (?,?)";

	public final static String _Update = "update person set FirstName = ?, LastName = ?, Age = ?  where id_Person = ?";
	public final static String _DeleteFromAnimalPerson = "delete from animal__person where id_Person = ?"; 	
	public final static String _Delete = "delete from person where id_Person = ?";



	@Override
	public Person create(Person pT) throws DaoException {
		// TODO Auto-generated method stub
		if (pT == null) {
			return null;
		}
		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_Insert,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,pT.getFirstName());
			ps.setString(2,pT.getLastName());
			ps.setInt(3, pT.getAge());		
			ps.execute();

			ResultSet rs = ps.getGeneratedKeys();
			long newId = 0L;
			while(rs.next()) {
				newId = rs.getLong("GENERATED_KEY");

			}
			rs.close();
			ps.close();
			pT.setId(newId);

			for (Animal a : pT.getAnimaux()) {
				PreparedStatement ps2 = cnx.prepareStatement(AnimalPerson_Insert);
				ps2.setLong(1, newId);
				ps2.setLong(2, a.getId());
				ps2.execute();
				ps2.close();
			} } catch (Exception e) {
				throw new DaoException(e);	
			}

		return pT;		
	}	
	@Override
	public Person findById(long pId) throws DaoException {
		List <Person> listPerson = new ArrayList();
		List<Animal> listAnimal = new ArrayList();	
		Person nathan = null;
		Animal animaru = null;	
		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement pst = cnx.prepareStatement(Select_byId);
			pst.setLong(1, pId); 
			ResultSet rs = pst.executeQuery();			
			Integer agePerson ;
			String namePerson;
			String lastPerson;		
			Long idPerson = 0L;

			while (rs.next()) {
				idPerson = rs.getLong("id_Person");
				namePerson = rs.getString("FirstName");
				lastPerson = rs.getString("LastName");
				agePerson = rs.getInt("Age");	
				nathan = new Person(idPerson,namePerson,lastPerson,agePerson,null);
				listPerson.add(nathan);		

				PreparedStatement pstun= cnx.prepareStatement(SECOND_Select);
				pstun.setLong(1, pId);
				ResultSet rsun = pstun.executeQuery();		 
				listAnimal = new ArrayList();
				Long idAnimal = 0L;
				String nameAnimal;
				String sexAnimal;
				String coatAnimal = null;
				Long idSpecie = 0L;
				Specie test = null;			
				while (rsun.next()) {
					idAnimal = rsun.getLong("animal.id_Animal");
					nameAnimal = rsun.getString("animal.Name");
					sexAnimal = rsun.getString("animal.Sex");
					coatAnimal = rsun.getString("animal.CoatColor");			
					idSpecie = rsun.getLong("specie.id_specie");
					String common = rsun.getString("specie.commonName");
					String latin = rsun.getString("specie.latinName");
					test = new Specie(idSpecie,common,latin); 
					animaru = new Animal(idAnimal,nameAnimal,sexAnimal, coatAnimal,test );
					listAnimal.add(animaru);
				}
			} } catch (Exception e) {
				throw new DaoException(e);
			}
		nathan.setAnimaux(listAnimal);
		try {
			JDBCManager.getInstance().closeConnection();
		} catch (Exception e) {
			throw new DaoException(e);
		}
		return nathan;		

	}



	@Override
	public List<Person> findList() throws DaoException {	
		List <Person> listPerson = new ArrayList();
		List<Animal> listAnimal = new ArrayList();
		Person nathan = null;

		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement pst = cnx.prepareStatement(First_Select);
			ResultSet rs = pst.executeQuery();		
			Integer agePerson ;
			String namePerson;
			String lastPerson;		
			Long idPerson = 0L;

			while (rs.next()) {
				idPerson = rs.getLong("id_Person");
				namePerson = rs.getString("FirstName");
				lastPerson = rs.getString("LastName");
				agePerson = rs.getInt("Age");	
				nathan = new Person(idPerson,namePerson,lastPerson,agePerson,null);
				listPerson.add(nathan);					
				PreparedStatement pstun= cnx.prepareStatement(SECOND_Select);
				pstun.setLong(1, nathan.getId());
				ResultSet rsun = pstun.executeQuery();

				listAnimal = new ArrayList();
				Long idAnimal = 0L;
				String nameAnimal;
				String sexAnimal;
				String coatAnimal = null;
				Long idSpecie = 0L;
				Specie test = null;
				Animal animaru = null;


				while (rsun.next()) {
					idAnimal = rsun.getLong("animal.id_Animal");
					nameAnimal = rsun.getString("animal.Name");
					sexAnimal = rsun.getString("animal.Sex");
					coatAnimal = rsun.getString("animal.CoatColor");			
					idSpecie = rsun.getLong("specie.id_specie");
					String common = rsun.getString("specie.commonName");
					String latin = rsun.getString("specie.latinName");
					test = new Specie(idSpecie,common,latin); 
					animaru = new Animal(idAnimal,nameAnimal,sexAnimal, coatAnimal,test );
					listAnimal.add(animaru);
				} }	} catch (Exception e) {
					throw new DaoException(e);
				}

		nathan.setAnimaux(listAnimal);
		try {
			JDBCManager.getInstance().closeConnection();
		} catch (Exception e) {
			throw new DaoException(e);
		}
		return listPerson;		
	}





	@Override
	public Person updateById(Person pT) throws DaoException {


		if (pT == null ) {
			return null;
		}

		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_DeleteFromAnimalPerson);
			ps.setLong(1, pT.getId());
			ps.execute();

			Connection cnx1 = JDBCManager.getInstance().openConection();
			PreparedStatement ps1 = cnx1.prepareStatement(_Update);
			ps1.setString(1,pT.getFirstName());
			ps1.setString(2, pT.getLastName());
			ps1.setInt(3, pT.getAge());
			ps1.setLong(4, pT.getId());

			ps1.execute();

			Connection cnx2 = JDBCManager.getInstance().openConection();

			for (Animal a : pT.getAnimaux()) {
				PreparedStatement ps2 = cnx2.prepareStatement(AnimalPerson_Insert);
				ps2.setLong(1, pT.getId());
				ps2.setLong(2, a.getId());
				ps2.execute();
				ps2.close();
			}
		} catch (Exception e) {
			throw new DaoException(e);
		}
		return pT;
	}

	@Override
	public void deleteById(long pId) throws DaoException {
		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_DeleteFromAnimalPerson);
			ps.setLong(1, pId);
			ps.execute();

			PreparedStatement ps1 = cnx.prepareStatement(_Delete);
			ps1.setLong(1, pId);
			ps1.execute();
		} catch (Exception e) {
			throw new DaoException(e);
		}

	}

}

package persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.entite.Animal;
import business.entite.Specie;
import persistence.exception.DaoException;
import persistence.manager.JDBCManager;

public class AnimalDao  implements IDAO<Animal>  {

	public final static String _Select = "select * from animal inner join specie on animal.id_specie = specie.id_specie";
	public final static String _SelectId = "select * from animal  inner join specie on animal.id_specie = specie.id_specie where id_Animal = ?";
	public final static String _Insert = "insert into animal (Name,Sex,CoatColor,id_Specie) values (?,?,?,?) ";
	public final static String _Update = "update animal set Name = ? where id_Animal = ?";
	public final static String _Delete = "delete from animal where id_Animal = ?";

	@Override
	public Animal create(Animal pT) throws DaoException {
		if (pT == null) {
			return null;
		}		
		try {

			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_Insert,Statement.RETURN_GENERATED_KEYS);

			ps.setString(1,pT.getName());
			ps.setString(2,pT.getSex());
			ps.setString(3, pT.getCoatColor());
			ps.setLong(4, pT.getId());
			ps.execute();	

			ResultSet rs =ps.getGeneratedKeys();			

			long newId = 0L;
			while (rs.next()) {
				newId = rs.getLong("GENERATED_KEY");
			}
			pT.setId(newId);		

			ps.close();
		} catch (Exception e) {
			throw new DaoException(e);
		}
		try {
			JDBCManager.getInstance().closeConnection();
		} catch (Exception e) {
			throw new DaoException(e);
		}

		return pT;
	}

	@Override
	public Animal findById(long pId) throws DaoException {

		Animal animaru = null;
		Specie test = null;

		try {		
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_SelectId);
			ps.setLong(1, pId);
			ResultSet st = ps.executeQuery();		
			Long id = 0L;
			String name;
			String sexe;
			String coat = null;
			Long idSpecie = 0L;


			while (st.next()) {
				id = st.getLong("animal.id_Animal");
				name = st.getString("animal.Name");
				sexe = st.getString("animal.Sex");
				coat = st.getString("animal.CoatColor");
				idSpecie = st.getLong("specie.id_specie");
				String common = st.getString("specie.commonName");
				String latin = st.getString("specie.latinName");
				test = new Specie(idSpecie,common,latin); 
				animaru = new Animal(id,name,sexe, coat,test );
			}	} catch (Exception e) {
				throw new DaoException(e);
			}	

		return animaru ;
	}

	@Override
	public List<Animal> findList() throws DaoException {
		List<Animal> list = new ArrayList<>();	
		try {


			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement preparedStatement = cnx.prepareStatement(_Select);
			ResultSet st = preparedStatement.executeQuery();

			Long id = 0L;
			String name;
			String sexe;
			String coat = null;
			Long idSpecie = 0L;
			Specie test = null;
			Animal animaru = null;
			while (st.next()) {
				id = st.getLong("id_Animal");
				name = st.getString("Name");
				sexe = st.getString("Sex");
				coat = st.getString("CoatColor");			
				idSpecie = st.getLong("specie.id_specie");
				String common = st.getString("specie.commonName");
				String latin = st.getString("specie.latinName");
				test = new Specie(idSpecie,common,latin); 
				animaru = new Animal(id,name,sexe, coat,test );
				list.add(animaru);
			} } catch (Exception e) {
				throw new DaoException(e);
			}
		try {
			JDBCManager.getInstance().closeConnection();
		} catch (Exception e) {
			throw new DaoException(e);
		}
		return list;
	}

	@Override
	public Animal updateById(Animal pT) throws DaoException {
		if (pT == null) {
			return null;
		}
		
		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_Update);
			ps.setString(1, pT.getName());
			ps.setLong(2, pT.getId());
			ps.execute();
			ps.close();
			JDBCManager.getInstance().closeConnection();
		} catch (Exception e) {
			throw new DaoException(e);
		}
		return pT;
	}

	@Override
	public void deleteById(long pId) throws DaoException {
		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_Delete);
			ps.setLong(1, pId);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

}

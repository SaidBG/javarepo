package persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.entite.Specie;
import persistence.exception.DaoException;
import persistence.manager.JDBCManager;

public class SpecieDao implements IDAO<Specie> {																	
	public final static String _Select = "select * from specie";
	public final static String _SelectId = "select * from specie where id_Specie = ?";
	public final static String _Insert = "insert into specie (CommonName,LatinName) values (?,?) ";
	public final static String _Update = "update specie set commonName = ? where id_Specie = ?";
	public final static String _Delete = "delete from specie where id_Specie = ?";

	@Override
	public Specie create(Specie pT) throws DaoException {
		// TODO Auto-generated method stub
		if (pT == null) {
			return null;
		}
		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_Insert,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,pT.getCommonName());
			ps.setString(2,pT.getLatinName());
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
		return pT;
	}

	@Override
	public Specie findById(long pId) throws DaoException {
		Specie species = null;
		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_SelectId);
			ps.setLong(1, pId);
			ResultSet st = ps.executeQuery();		
			String commonName;
			String latinName;		
			Long id = 0L;
			while (st.next()) {
				id = st.getLong("id_Specie");
				commonName = st.getString("CommonName");
				latinName = st.getString("LatinName");
				species = new Specie(id,commonName,latinName);
			}	} catch (Exception e) {
				throw new DaoException(e);
			}	

		return species ;
	}

	@Override
	public List<Specie> findList() throws DaoException {
		List<Specie> list = new ArrayList<>();
		Specie species = null;
		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement preparedStatement = cnx.prepareStatement(_Select);
			ResultSet st = preparedStatement.executeQuery();

			Long id = 0L;
			String commonName;
			String latinName;

			while (st.next()) {
				id = st.getLong("id_Specie");
				commonName = st.getString("CommonName");
				latinName = st.getString("LatinName");
				species = new Specie(id,commonName,latinName);
				list.add(species);
			}
		} catch (Exception e) {
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
	public Specie updateById(Specie pT) throws DaoException {
		// TODO Auto-generated method stub
		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_Update);
			if (pT == null) {
				return null;
			}
			else {
				ps.setString(1, pT.getCommonName());
				ps.setLong(2, pT.getId());
				ps.execute();
				ps.close();
			}



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
	public void deleteById(long pId) throws DaoException {
		// TODO Auto-generated method stub
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

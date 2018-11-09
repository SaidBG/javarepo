package persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.entite.Race;
import business.entite.Specie;
import persistence.exception.DaoException;
import persistence.manager.JDBCManager;

public class RaceDao implements IDAO<Race> {
	public final static String _Select = "select * from race";
	public final static String _SelectId = "select * from race where id = ?";
	public final static String _Insert = "insert into race(name,price,comments,id_specie) values (?,?,?,?) ";
	public final static String _Update = "update race set name = ? where id = ?";
	public final static String _Delete = "delete from race where id = ?";


	@Override
	public Race create(Race pT) throws DaoException {
		// TODO Auto-generated method stub

		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_Insert);
			ps.setString(1,pT.getName());
			ps.setLong(2, pT.getPrice());
			ps.setString(3, pT.getComments());
			ps.execute();
			ps.close();
			JDBCManager.getInstance().closeConnection();
		} catch (Exception e) {
			throw new DaoException(e);
		}
		return pT;
	}

	@Override
	public Race findById(long pId) throws DaoException {
		
		Race ra = null;
		try {
			Connection cnx = JDBCManager.getInstance().openConection();
			PreparedStatement st  = cnx.prepareStatement(_SelectId);
			st.setLong(1, pId);
			ResultSet result = st.executeQuery();
			Long id = 0L;
			String name;
			Long price = 0L;
			String comments;
			
			while(result.next()) {
				id = result.getLong("id");
				name = result.getString("name");
				price = result.getLong("price");
				comments = result.getString("comments");
				ra = new Race (id, name,price,comments);
				JDBCManager.getInstance().closeConnection();
			}
			}  catch (Exception e) {
				throw new DaoException(e);
			}

			return ra;
		}
	
		@Override
		public List<Race> findList() throws DaoException {
			// TODO Auto-generated method stub
			List<Race> list = new ArrayList<>();
			try {
				Connection cnx = JDBCManager.getInstance().openConection();
				PreparedStatement st = cnx.prepareStatement(_Select);
				ResultSet result = st.executeQuery();
				
				Long id = 0L;
				String name;
				Long price = 0L;
				String comments;
				Race ra = null;

				while (result.next()) {
					id = result.getLong("id");
					name = result.getString("name");
					price = result.getLong("price");
					comments = result.getString("comments");
					ra = new Race (id, name, price, comments);
					list.add(ra);

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
		public Race updateById(Race pT) throws DaoException {
			// TODO Auto-generated method stub
			try {
				Connection cnx = JDBCManager.getInstance().openConection();
				PreparedStatement ps = cnx.prepareStatement(_Update);
				ps.setString(1, pT.getName());
				ps.setLong(2,pT.getId());
				ps.execute();

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
			} catch (Exception e) {
				throw new DaoException(e);
			}



		}
	}

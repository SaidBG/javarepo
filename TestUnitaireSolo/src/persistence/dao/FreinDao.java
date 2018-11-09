package persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.entite.Automobile;
import business.entite.Frein;
import persistence.exception.DaoException;
import persistence.manager.JDBCManagerSolo;

public class FreinDao  implements IDAO<Frein> {

	public final static String _Select = "select * from frein ";
	public final static String _SelectId = "select * from frein where id = ?";
	public final static String _Insert = "insert into frein (marque,modele) values (?,?)";
	public final static String _Update = "update frein set marque = ?, modele = ? where id = ?";
	public final static String _Delete = "delete from frein where id = ?";



	@Override
	public Frein create(Frein pT) throws DaoException {
		if (pT == null) {
			return null;
		}
		try {
			Connection cnx = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_Insert,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,pT.getMarqueFrein());
			ps.setString(2,pT.getModeleFrein());
			ps.execute();

			ResultSet rs = ps.getGeneratedKeys();
			long newId = 0L;
			while(rs.next()) {
				newId = rs.getLong("GENERATED_KEY");

			}
			rs.close();
			ps.close();
			pT.setIdFrein(newId);


		} catch (Exception e) {
			throw new DaoException(e);	
		}

		return pT;		

	}

	@Override
	public Frein findById(long pId) throws DaoException {

		Frein brake = null;
		Connection cnx;
		try {
			cnx = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement pst2 = cnx.prepareStatement(_SelectId);
			pst2.setLong(1,pId);
			ResultSet rs2 = pst2.executeQuery();

			long idFrein;
			String marqueFrein;
			String modeleFrein;

			while (rs2.next()) {
				idFrein = rs2.getLong("frein.id");
				marqueFrein = rs2.getString("frein.marque");
				modeleFrein = rs2.getString("frein.modele");
				brake = new Frein(idFrein,marqueFrein,modeleFrein);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return brake;
	}

	@Override
	public List<Frein> findList() throws DaoException {
		List<Frein> listFrein = new ArrayList();
		Frein brake = null;
		Connection cnx;
		try {
			cnx = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement pst2 = cnx.prepareStatement(_Select);		
			ResultSet rs2 = pst2.executeQuery();

			long idFrein;
			String marqueFrein;
			String modeleFrein;

			while (rs2.next()) {
				idFrein = rs2.getLong("frein.id");
				marqueFrein = rs2.getString("frein.marque");
				modeleFrein = rs2.getString("frein.modele");
				brake = new Frein(idFrein,marqueFrein,modeleFrein);
				listFrein.add(brake);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listFrein;
	}

	@Override
	public Frein updateById(Frein pT) throws DaoException {
		if (pT == null ) {
			return null;
		}

		try {		

			Connection cnx1 = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement ps1 = cnx1.prepareStatement(_Update);
			ps1.setString(1,pT.getMarqueFrein());
			ps1.setString(2, pT.getModeleFrein());
			ps1.setLong(3,pT.getIdFrein());
			ps1.execute();


		} catch (Exception e) {
			try {
				JDBCManagerSolo.getInstance().closeConnection();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			throw new DaoException(e);
		}


		return pT;
	}

	@Override
	public void deleteById(long pId) throws DaoException {
		try {
			Connection cnx = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_Delete);
			ps.setLong(1, pId);
			ps.execute();

		} catch (Exception e) {
			throw new DaoException(e);
		}

	}

}

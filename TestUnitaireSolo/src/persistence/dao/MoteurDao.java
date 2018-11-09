package persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.entite.Frein;
import business.entite.Moteur;
import persistence.exception.DaoException;
import persistence.manager.JDBCManagerSolo;

public class MoteurDao implements IDAO<Moteur> {
	public final static String _Select = "select * from moteur ";
	public final static String _SelectId = "select * from moteur where id = ?";
	public final static String _Insert = "insert into moteur (marque,modele,cylindree) values (?,?,?)";
	public final static String _Update = "update moteur set marque = ?, modele = ?, cylindree = ? where id = ?";
	public final static String _Delete = "delete from moteur where id = ?";

	@Override
	public Moteur create(Moteur pT) throws DaoException {
		if (pT == null) {
			return null;
		}
		try {
			Connection cnx = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_Insert,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,pT.getMarqueMoteur());
			ps.setString(2,pT.getModeleMoteur());
			ps.setInt(3, pT.getCylindreMoteur());
			ps.execute();

			ResultSet rs = ps.getGeneratedKeys();
			long newId = 0L;
			while(rs.next()) {
				newId = rs.getLong("GENERATED_KEY");

			}
			rs.close();
			ps.close();
			pT.setIdMoteur(newId);


		} catch (Exception e) {
			throw new DaoException(e);	
		}

		return pT;		
	}

	@Override
	public Moteur findById(long pId) throws DaoException {

		Moteur engine = null;
		Connection cnx;
		try {
			cnx = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement pst2 = cnx.prepareStatement(_SelectId);
			pst2.setLong(1,pId);
			ResultSet rs2 = pst2.executeQuery();

			long idMoteur;
			String marqueMoteur;
			String modeleMoteur;
			int cylindreMoteur;
			while (rs2.next()) {
				idMoteur = rs2.getLong("id");
				marqueMoteur = rs2.getString("marque");
				modeleMoteur = rs2.getString("modele");
				cylindreMoteur = rs2.getInt("cylindree");
				engine = new Moteur(idMoteur,marqueMoteur,modeleMoteur,cylindreMoteur);		
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return engine;
	}

	@Override
	public List<Moteur> findList() throws DaoException {
		List<Moteur> listMoteur = new ArrayList();
		Moteur engine = null;
		Connection cnx;
		try {
			cnx = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement pst2 = cnx.prepareStatement(_Select);		
			ResultSet rs2 = pst2.executeQuery();

			long idMoteur;
			String marqueMoteur;
			String modeleMoteur;
			int cylindreMoteur;

			while (rs2.next()) {
				idMoteur = rs2.getLong("id");
				marqueMoteur = rs2.getString("marque");
				modeleMoteur = rs2.getString("modele");
				cylindreMoteur = rs2.getInt("cylindree");
				engine = new Moteur(idMoteur,marqueMoteur,modeleMoteur,cylindreMoteur);	
				listMoteur.add(engine);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listMoteur;
	}

	@Override
	public Moteur updateById(Moteur pT) throws DaoException {
		if (pT == null ) {
			return null;
		}

		try {		

			Connection cnx1 = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement ps1 = cnx1.prepareStatement(_Update);
			ps1.setString(1,pT.getMarqueMoteur());
			ps1.setString(2, pT.getModeleMoteur());
			ps1.setInt(3, pT.getCylindreMoteur());
			ps1.setLong(4,pT.getIdMoteur());
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

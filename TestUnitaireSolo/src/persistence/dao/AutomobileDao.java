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
import business.entite.Moteur;
import persistence.exception.DaoException;
import persistence.manager.JDBCManagerSolo;


public class AutomobileDao implements IDAO<Automobile> {

	public final static String _Select = "select * from automobile"
			+ " inner join moteur on moteur.id = automobile.moteur_id"
			+ " inner join frein on frein.id = automobile.frein_id";
	public final static String _SelectId = "select * from automobile  "
			+ "inner join moteur on moteur.id = automobile.moteur_id "
			+ "inner join frein on frein.id = automobile.frein_id where automobile.id = ?";
	public final static String _Insert = "insert into automobile (marque, modele,moteur_id,frein_id) values (?,?,?,?)";
	public final static String _Update = "update automobile set marque = ?, modele = ?, moteur_id = ?, frein_id = ? where id = ?";
	public final static String _Delete = "delete from automobile where id = ?";




	@Override
	public Automobile create(Automobile pT) throws DaoException {
		if (pT == null) {
			return null;
		}
		try {
			Connection cnx = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement ps = cnx.prepareStatement(_Insert,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,pT.getMarqueAuto());
			ps.setString(2,pT.getModeleAuto());
			ps.setLong(3, pT.getMoteur().getIdMoteur());
			ps.setLong(4,pT.getFrein().getIdFrein());
			ps.execute();

			ResultSet rs = ps.getGeneratedKeys();
			long newId = 0L;
			while(rs.next()) {
				newId = rs.getLong("GENERATED_KEY");

			}
			rs.close();
			ps.close();
			pT.setIdAuto(newId);


		} catch (Exception e) {
			throw new DaoException(e);	
		}

		return pT;		

	}

	@Override
	public Automobile findById(long pId) throws DaoException {
		List <Automobile> listAuto = new ArrayList();
		List<Frein> listFrein = new ArrayList();
		List<Moteur> listMoteur = new ArrayList();
		Automobile car = null;
		Frein brake = null;
		Moteur engine = null;
		try {
			Connection cnx = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement pst = cnx.prepareStatement(_SelectId);
			pst.setLong(1, pId); 
			ResultSet rs = pst.executeQuery();			
			long idAuto;
			String marqueAuto;
			String modeleAuto;		
			Frein frein;
			Moteur moteur;

			while (rs.next()) {
				idAuto = rs.getLong("id");
				marqueAuto = rs.getString("marque");
				modeleAuto = rs.getString("modele");
				car = new Automobile(idAuto,marqueAuto,modeleAuto,null,null);
				listAuto.add(car);		

				PreparedStatement pst1= cnx.prepareStatement(_SelectId);
				pst1.setLong(1, pId);
				ResultSet rsun = pst1.executeQuery();		 
				listMoteur = new ArrayList();
				long idMoteur;
				String marqueMoteur;
				String modeleMoteur;
				int cylindreMoteur;	
				while (rsun.next()) {
					idMoteur = rsun.getLong("moteur.id");
					marqueMoteur = rsun.getString("moteur.marque");
					modeleMoteur = rsun.getString("moteur.modele");
					cylindreMoteur = rsun.getInt("moteur.cylindree");
					engine = new Moteur (idMoteur,marqueMoteur,modeleMoteur,cylindreMoteur);
					listMoteur.add(engine);

					PreparedStatement pst2 = cnx.prepareStatement(_SelectId);
					pst2.setLong(1,pId);
					ResultSet rs2 = pst2.executeQuery();
					listFrein = new ArrayList();					
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
					car = new Automobile(idAuto, marqueAuto, modeleAuto, brake, engine);			
				}				


			} } catch (Exception e) {
				throw new DaoException(e);
			}

		try {
			JDBCManagerSolo.getInstance().closeConnection();
		} catch (Exception e) {
			throw new DaoException(e);
		}
		return car;		

	}

	@Override
	public List<Automobile> findList() throws DaoException {
		List <Automobile> listAuto = new ArrayList();
		List<Frein> listFrein = new ArrayList();
		List<Moteur> listMoteur = new ArrayList();
		Automobile car = null;
		Moteur engine = null;
		try {
			Connection cnx = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement pst = cnx.prepareStatement(_Select);
			ResultSet rs = pst.executeQuery();		
			long idAuto;
			String marqueAuto;
			String modeleAuto;		
			Frein brake = null;
			Moteur moteur= null;


			while (rs.next()) {
				idAuto = rs.getLong("id");
				marqueAuto = rs.getString("marque");
				modeleAuto = rs.getString("modele");
				car = new Automobile(idAuto,marqueAuto,modeleAuto,null,null);
						

				PreparedStatement pstun= cnx.prepareStatement(_Select);
				ResultSet rsun = pstun.executeQuery();

				listMoteur = new ArrayList();
				long idMoteur;
				String marqueMoteur;
				String modeleMoteur;
				int cylindreMoteur;	


				while (rsun.next()) {
					idMoteur = rsun.getLong("moteur.id");
					marqueMoteur = rsun.getString("moteur.marque");
					modeleMoteur = rsun.getString("moteur.modele");
					cylindreMoteur = rsun.getInt("moteur.cylindree");
					engine = new Moteur (idMoteur,marqueMoteur,modeleMoteur,cylindreMoteur);
					listMoteur.add(engine);

				}		

				PreparedStatement pst2 = cnx.prepareStatement(_Select);
				ResultSet rs2 = pst2.executeQuery();
				listFrein = new ArrayList();					
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
				car = new Automobile(idAuto, marqueAuto, modeleAuto, brake, engine);		
				listAuto.add(car);
			}	} catch (Exception e) {
				throw new DaoException(e);
			}

		
		try {
			JDBCManagerSolo.getInstance().closeConnection();
		} catch (Exception e) {
			throw new DaoException(e);
		}
		return listAuto;	
	}

	@Override
	public Automobile updateById(Automobile pT) throws DaoException {
		if (pT == null ) {
			return null;
		}

		try {		

			Connection cnx1 = JDBCManagerSolo.getInstance().openConection();
			PreparedStatement ps1 = cnx1.prepareStatement(_Update);
			ps1.setString(1,pT.getMarqueAuto());
			ps1.setString(2, pT.getModeleAuto());
			ps1.setLong(3, pT.getFrein().getIdFrein());
			ps1.setLong(4, pT.getMoteur().getIdMoteur());
			ps1.setLong(5, pT.getIdAuto());

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

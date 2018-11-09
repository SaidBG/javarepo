package premier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProtoCoureur {

	
	public final static String _Select = "select * from coureur";
	public final static String _Insert = "insert into coureur (nomcoureur,codequipe,codepays) values (?,?,?) ";
	public final static String _Update = "update coureur set nomcoureur = '?' where numerocoureur = ?";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		Connection cnx = null;
		Long id = 0L;
		ResultSet result = null;
		
		try {
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/tourdefrance","root","root");
			ps = cnx.prepareStatement(_Select);
			result = ps.executeQuery();
			ps = cnx.prepareStatement(_Insert,PreparedStatement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, "DIO");
			ps.setLong(2, 1);
			ps.setLong(3, 3);
			ps.execute();
			result = ps.getGeneratedKeys();
			while (result.next()) {
				id = result.getLong("GENERATED_KEY");
				System.out.println("Nouvelle ID créé " +id);				
			}
			
			
			
			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				throw e;
			
			}
		}
		
		finally {
			
		}
		
		
	}

}

package premier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProtoAnimal {
	public final static String _Insert = "insert into animal (Name,Sex,CoatColor, id_Specie) values (?,?,?,?) ";
	public final static String _Select = "select * from animal where id_Animal = ?";
	public final static String _Update = "update animal set nom = ? where id = ?";
	public final static String _Delete = "delete from animal where id_Animal = ?";

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
		Connection cnx = null;
		PreparedStatement ps = null;
		
		try {
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestioles","root","root");
			ps = cnx.prepareStatement(_Select);
			ps.setLong(1, 1);
			ResultSet result = ps.executeQuery();
			
			ps = cnx.prepareStatement(_Insert,PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, "Nathan le CHIEN");
			ps.setString(2, "idiot ");
			ps.setString(3, "Gris");
			ps.setLong(4, 2);
			ps.execute();
			result = ps.getGeneratedKeys();
			long newId = 0L;
			while(result.next()) {
				newId = result.getLong("GENERATED_KEY");
				System.out.println(newId);
			}
			ps = cnx.prepareStatement(_Delete);
			ps.setLong(1, newId);
			ps.execute();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}

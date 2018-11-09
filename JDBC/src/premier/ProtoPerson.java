package premier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProtoPerson {
	public final static String _Select = "select * from person where id_Person = ? ";
	public final static String _Insert = "insert into person (FirstName,LastName,Age) values (?,?,?)";
	public final static String _Update = "update person set FirstName = ? where id_Person = ? " ;
	public final static String _Delete = "delete from person where id_Person = ?";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection cnx  = null;
		PreparedStatement ps =  null;
		Long id = 0L;
		
		try {
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestioles","root","root");
			
			ps = cnx.prepareStatement(_Select);
			ps.setLong(1, 1);
			ResultSet result = ps.executeQuery();
			ps = cnx.prepareStatement(_Insert,PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, "LeGrand");
			ps.setString(2, "Jojo");
			ps.setInt(3, 22);
			ps.execute();
			result = ps.getGeneratedKeys();
			while (result.next()) {
				id = result.getLong("GENERATED_KEY");
				System.out.println(id);
				
			}
			 ps = cnx.prepareStatement(_Delete);
			 ps.setLong(1,9);
			 ps.setLong(1,10);
			 ps.setLong(1,11);
			 ps.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}

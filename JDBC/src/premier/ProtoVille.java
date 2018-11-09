package premier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProtoVille {
public final static String _Select = "select * from cinema";
public final static String _Insert = "insert into cinema (numcinema, nomcinema,ruecinema,codepostal) values (?,?,?,?)";
public final static String _Update = "update cinema set nomcinema = ? where numcinema = ?" ;
public final static String _Delete = "delete from cinema where numcinema = ?";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection cnx = null;
		PreparedStatement ps = null;
		ResultSet result = null;
		Long id = 0L;
		
		try {
			cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas","root","root");
			
			ps = cnx.prepareStatement(_Select);
			
			result = ps.executeQuery();
			ps = cnx.prepareStatement(_Insert,PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setLong(1, 10);
			ps.setString(2,"CineSix" );
			ps.setString(3,"666 rue du Styx" );
			ps.setLong(4, 75000);
			ps.execute();
			result = ps.getGeneratedKeys();
			while(result.next()) {
				id = result.getLong("GENERATED_KEY");
				System.out.println(id);
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		
		
		
	}

}

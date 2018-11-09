package premier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//st.execute("UPDATE specie SET 'Dragon' = 'Serpent'WHERE id_Specie = 6");
//st.execute("DELETE FROM specie WHERE id_Specie = 6");



public class PrototypeUn {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection cnx = null;
		Long id1 = 0L;



		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnx =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Bestioles","root","root");
			Statement st = cnx.createStatement();

			ResultSet rs = st.executeQuery("SELECT * from specie");
				

			while (rs.next()) {
				String common  = rs.getString("CommonName");
				String latin = rs.getString("LatinName");
				Long id = rs.getLong("id_Specie");
				System.out.println(common + " "+ latin+" "+id);
			
			}
			st.execute("insert into specie (commonName,LatinName) values ('Dragon','reptilus')", Statement.RETURN_GENERATED_KEYS);
			rs = st.getGeneratedKeys();
			while(rs.next()) {
				id1  = rs.getLong("GENERATED_KEY");
			}
			
			st.execute("UPDATE specie SET CommonName = 'Serpent' WHERE id_Specie = " + id1 );




		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				cnx.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	private static Statement getLong(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

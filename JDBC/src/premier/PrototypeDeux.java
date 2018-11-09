package premier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//st.execute("UPDATE specie SET 'Dragon' = 'Serpent'WHERE id_Specie = 6");
//st.execute("DELETE FROM specie WHERE id_Specie = 6");



public class PrototypeDeux {
	public static final String _SelectStatement = "select * from specie where id_Specie = ?" ;
	public static final String _InsertStatement = "insert into specie(CommonName,LatinName) values (?,?)";
	public static final String _UpdateStatement = "UPDATE specie SET CommonName = 'Nathanus' WHERE id_Specie = ?";
	public static final String _DeleteStatement = "DELETE FROM specie WHERE id_Specie = ?";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection cnx = null;
		Long id1 = 0L;



		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnx =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Bestioles","root","root");
			PreparedStatement st = cnx.prepareStatement(_SelectStatement);
			st.setLong(1, 2);		  
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				String common  = rs.getString("CommonName");
				String latin = rs.getString("LatinName");
				Long id = rs.getLong("id_Specie");
				System.out.println(common + " "+ latin+" "+id);

			}
			st = cnx.prepareStatement(_InsertStatement, Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "Nathus");
			st.setString(2, "Legus");
			st.execute();
			rs = st.getGeneratedKeys();
			while(rs.next()) {
				id1  = rs.getLong("GENERATED_KEY");
				System.out.println(id1);
			}
			
			st = cnx.prepareStatement(_DeleteStatement);
			st.setLong(1, id1);
			st.execute();




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

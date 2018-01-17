package model.mappers;

public class MapperLogin {
	private Connection con;

	public MapperLogin(Connection con) {
		this.con = con;
	}

	private void insertNewLogin(Login login) throws SQLException {
		PreparedStatement stmt = con.prepareStatement("INSERT INTO LOGIN (NAME, PASSWORD) "+
		"VALUES (?,?)");
		try{	
			stmt.setString(1,login.getName());	
			stmt.setString(2,login.getPassword());	
			stmt.execute();
		}
		finally {	
			stmt.close();
		}
	}
	
	public Login get(String name) throws SQLException{
		Login login;
		PreparedStatement stmt = con.prepareStatement("SELECT NAME, PASSWORD FROM LOGIN WHERE NAME=?");
		stmt.setString(1, name);	
		ResultSet rs = stmt.executeQuery();
		try{
			if (rs.next()){
				String name = rs.getString("Name");
				if ( rs.getString("Password") != null) {
					String password = rs.getString("Password");
					login = new Login (name, password);
			else
				return null;
		}
		finally {
			rs.close();
			stmt.close();		
		}
	}

}

package model.mappers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Guest;

public class MapperGuest {
	
	private Connection con;

	public MapperGuest(Connection con) {
		this.con = con;
	}

	private void insertNewGuest(Guest guest) throws SQLException {
		PreparedStatement stmt = con.prepareStatement("INSERT INTO ROOM (CPF, NAME, PHONE) "+
		"VALUES (?,?)");
		try{	
			stmt.setString(1,guest.getCPF());	
			stmt.setString(2,guest.getName());	
			stmt.setString(3,guest.getPhone());
			stmt.execute();
		}
		finally {	
			stmt.close();
		}
	}
	
	public Guest get(String CPF) throws SQLException{
		Guest guest;
		PreparedStatement stmt = con.prepareStatement("SELECT CPF, NAME, PHONE FROM ROOM WHERE CPF=?");
		stmt.setString(1, CPF);	
		ResultSet rs = stmt.executeQuery();
		try{
			if (rs.next()){
				String name = rs.getString("Name");
				if ( rs.getString("Phone") != null) {
					String phone = rs.getString("Phone");
					guest = new Guest (CPF, name, phone);
				} else {
					guest = new Guest (CPF, name, "");
				}
				return guest;
			}
			else
				return null;
		}
		finally {
			rs.close();
			stmt.close();		
		}
	}

}

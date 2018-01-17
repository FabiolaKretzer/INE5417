package model.mappers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Booking;

public class MapperBooking {
	
	private Connection con;
	MapperGuest guest;
	MapperRoom room; 
	
	public MapperBooking(Connection con, MapperGuest guest, MapperRoom room) {
		this.con = con;
		this.guest = guest;
		this.room = room;
	}
	
	public void insertNewBooking(Booking booking) throws SQLException {
		PreparedStatement stmt = con.prepareStatement("INSERT INTO BOOKING (GUEST, ROOM, STARTDATE, ENDDATE) " +
				  "VALUES(?,?,?,?)");
		try {
			stmt.setString (1, guest.getCPF());
			stmt.setInt (2, room.getNumber());
			stmt.execute();
		} finally {
			stmt.close();
		}
	}
	
	public Booking get(String CPF, int number) {
		Booking booking;
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

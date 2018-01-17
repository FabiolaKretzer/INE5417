package model.mappers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Room;

public class MapperRoom {
	
	private Connection con;

	public MapperRoom(Connection con) {
		this.con = con;
	}

	private void insertNewRoom(Room room) throws SQLException {
		PreparedStatement stmt = con.prepareStatement("INSERT INTO ROOM (NUMBER, PRICE) "+
		"VALUES (?,?)");
		try{	
			stmt.setInt(1,room.getNumber());	
			stmt.setDouble(2,room.getPrice());	
			stmt.execute();
		}
		finally {	
			stmt.close();
		}
	}
	
	public Room get(int number) throws SQLException{
		Room room;
		PreparedStatement stmt = con.prepareStatement("SELECT NUMBER, PRICE FROM ROOM WHERE NUMBER=?");
		stmt.setInt(1, number);	
		ResultSet rs = stmt.executeQuery();
		try{
			if (rs.next()){
				int price = rs.getInt("Price");
				room = new Room (number, price);
				return room;
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


inserir na classe Fachada do sistema

private Connection con;
private MapeadorBooking mapperBooking;
private MapperGuest mapperGuest;
private MapperRoom mapperRoom;
private MapperLogin mapperLogin;

public Fachada() {
		try {
    		// BD Postgres
	    	Class.forName("org.postgresql.Driver");
	    	this.con = DriverManager.getConnection("jdbc:postgresql://localhost/sistema_alugueis","postgres", "postgres");
	    	this.mapperBooking = new MapperBooking(this.con);
	    	this.mapperGuest = new MapperGuest(this.con);
	    	this.mapperRoom = new MapperRoom(this.con);
	    	this.mapperLogin = new MapperLogin(this.con);
    	} catch (Exception e) {
    		e.printStackTrace();
    		throw new java.lang.RuntimeException("erro ao conectar");
    	}
	}
	
	public void apagaTodosDadosDoBD () {
		Statement stmt = null;
		try{	
			stmt = con.createStatement();
			stmt.executeUpdate("DELETE FROM BOOKING");
			stmt.executeUpdate("DELETE FROM GUEST");
			stmt.executeUpdate("DELETE FROM ROOM");
			stmt.executeUpdate("DELETE FROM LOGIN");
			stmt.executeUpdate("ALTER SEQUENCE ---- RESTART WITH 1;");
    		} 
		catch (SQLException e) {
    		e.printStackTrace();
    		throw new java.lang.RuntimeException("erro ao apagar todos os dados do BD");
		}
		finally{
			try { stmt.close(); } catch (Exception ignore) {}
		}	
	}
	
	public void addGuest(Guest guest) {
		try {
			mapperGuest.insertNewGuest(guest);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public Guest returnGuest(String name) {
		try {
			return mapperGuest.get(cpf);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void addRoom(Room room) {
		try {
			mapperRoom.insertNewRoom(room);
		} catch (SQLException  e) {
			e.printStackTrace();
		}
	}
	
	public Room returnRoom(int number) {
		try {
			return mapperRoom.get(number);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void addTrip(Trip trip) {
		try {
			mapperTrip.insertNewTrip(local);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Trip returnTrip(String local) {
		try {
			return mapperTrip.get(idPropriedade);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void addBooking(Booking booking) {
		try {
			mapperBooking.insertNewBooking(booking);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Booking returnBooking(String CPF, int number) {
		try {
			return mapperBooking.get(CPF, number);
		} catch (SQLException e) {
			e.printStackTrace();
		}
}

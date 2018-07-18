package fr.poec.gestion_rh.table;

public class Login {

	private int id;
	private int idEmployee;
	private String role;
	private static String user;
	private String password;
//	private String[] column = new String[] {"id_employee","role","login","MdP"};	
//
//	public String[] getColumn() {
//		return column;
//	}
//
//	public void setColumn(String[] column) {
//		this.column = column;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public static String getUser() {
		return user;
	}

	public void setUser(String user) {
		Login.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

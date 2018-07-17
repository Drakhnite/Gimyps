package fr.poec.gestion_rh.bdd;

public class Role {

	private String[] listRole = new String[] {"Admin","Manager","HRManager","Accountant"};

	public String[] getListRole() {
		return listRole;
	}

	public void setListRole(String[] listRole) {
		this.listRole = listRole;
	}
	
	
}

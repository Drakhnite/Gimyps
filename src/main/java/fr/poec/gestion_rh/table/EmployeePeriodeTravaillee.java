package fr.poec.gestion_rh.table;

public class EmployeePeriodeTravaillee {

	private int id;
	private int idEmployee;
	private int idPeriodeTravaillee;
	private float nbHeures;

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

	public int getIdPeriodeTravaillee() {
		return idPeriodeTravaillee;
	}

	public void setIdPeriodeTravaillee(int idPeriodeTravaillee) {
		this.idPeriodeTravaillee = idPeriodeTravaillee;
	}

	public float getNbHeures() {
		return nbHeures;
	}

	public void setNbHeures(float nbHeures) {
		this.nbHeures = nbHeures;
	}
}

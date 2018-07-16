package fr.poec.gestion_rh.table;

import java.util.Date;

public class PeriodeTravaillee {

	private int id;
	private Date date;
	private float nbHeures;
	private boolean absence;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getNbHeures() {
		return nbHeures;
	}

	public void setNbHeures(float nbHeures) {
		this.nbHeures = nbHeures;
	}

	public boolean isAbsence() {
		return absence;
	}

	public void setAbsence(boolean absence) {
		this.absence = absence;
	}
}

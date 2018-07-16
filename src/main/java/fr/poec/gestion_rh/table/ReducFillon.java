package fr.poec.gestion_rh.table;

import java.util.Date;

public class ReducFillon {

	private int id;
	private float tFnal;
	private float coeff;
	private float limiteSmic;
	private Date dateDebut;
	private Date dateFin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float gettFnal() {
		return tFnal;
	}

	public void settFnal(float tFnal) {
		this.tFnal = tFnal;
	}

	public float getCoeff() {
		return coeff;
	}

	public void setCoeff(float coeff) {
		this.coeff = coeff;
	}

	public float getLimiteSmic() {
		return limiteSmic;
	}

	public void setLimiteSmic(float limiteSmic) {
		this.limiteSmic = limiteSmic;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
}

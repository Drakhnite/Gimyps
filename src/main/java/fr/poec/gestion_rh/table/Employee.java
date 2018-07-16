package fr.poec.gestion_rh.table;

import java.util.Date;

public class Employee {

	private int id;
	private String nom;
	private String prenom;
	private Date dateEntree;
	private Date dateSortie;
	private String typeContrat;
	private float salaireHoraire;
	private float dureeHebdomadaire;
	private boolean bulletinEmail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	public float getSalaireHoraire() {
		return salaireHoraire;
	}

	public void setSalaireHoraire(float salaireHoraire) {
		this.salaireHoraire = salaireHoraire;
	}

	public float getDureeHebdomadaire() {
		return dureeHebdomadaire;
	}

	public void setDureeHebdomadaire(float dureeHebdomadaire) {
		this.dureeHebdomadaire = dureeHebdomadaire;
	}

	public boolean isBulletinEmail() {
		return bulletinEmail;
	}

	public void setBulletinEmail(boolean bulletinEmail) {
		this.bulletinEmail = bulletinEmail;
	}
}

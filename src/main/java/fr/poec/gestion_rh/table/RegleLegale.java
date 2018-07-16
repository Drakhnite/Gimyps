package fr.poec.gestion_rh.table;

import java.util.Date;

public class RegleLegale {

	private int id;
	private Date dateDebut;
	private Date dateFin;
	private float tauxHeureSup1;
	private float tauxHeureSup2;
	private float baseHebdo;
	private float plafondSecu;
	private float baseMensuelle;
	private float salaireMensuel;
	private float tauxHoraire;
	private float smicHoraire;
	private float tauxTransport;
	private float tauxCotisAccTravail;
	private float partFormation;
	private float taxeApprentissage;
	private int effectif;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public float getTauxHeureSup1() {
		return tauxHeureSup1;
	}

	public void setTauxHeureSup1(float tauxHeureSup1) {
		this.tauxHeureSup1 = tauxHeureSup1;
	}

	public float getTauxHeureSup2() {
		return tauxHeureSup2;
	}

	public void setTauxHeureSup2(float tauxHeureSup2) {
		this.tauxHeureSup2 = tauxHeureSup2;
	}

	public float getBaseHebdo() {
		return baseHebdo;
	}

	public void setBaseHebdo(float baseHebdo) {
		this.baseHebdo = baseHebdo;
	}

	public float getPlafondSecu() {
		return plafondSecu;
	}

	public void setPlafondSecu(float plafondSecu) {
		this.plafondSecu = plafondSecu;
	}

	public float getBaseMensuelle() {
		return baseMensuelle;
	}

	public void setBaseMensuelle(float baseMensuelle) {
		this.baseMensuelle = baseMensuelle;
	}

	public float getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(float salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	public float getTauxHoraire() {
		return tauxHoraire;
	}

	public void setTauxHoraire(float tauxHoraire) {
		this.tauxHoraire = tauxHoraire;
	}

	public float getSmicHoraire() {
		return smicHoraire;
	}

	public void setSmicHoraire(float smicHoraire) {
		this.smicHoraire = smicHoraire;
	}

	public float getTauxTransport() {
		return tauxTransport;
	}

	public void setTauxTransport(float tauxTransport) {
		this.tauxTransport = tauxTransport;
	}

	public float getTauxCotisAccTravail() {
		return tauxCotisAccTravail;
	}

	public void setTauxCotisAccTravail(float tauxCotisAccTravail) {
		this.tauxCotisAccTravail = tauxCotisAccTravail;
	}

	public float getPartFormation() {
		return partFormation;
	}

	public void setPartFormation(float partFormation) {
		this.partFormation = partFormation;
	}

	public float getTaxeApprentissage() {
		return taxeApprentissage;
	}

	public void setTaxeApprentissage(float taxeApprentissage) {
		this.taxeApprentissage = taxeApprentissage;
	}

	public int getEffectif() {
		return effectif;
	}

	public void setEffectif(int effectif) {
		this.effectif = effectif;
	}
}

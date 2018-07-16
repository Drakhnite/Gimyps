package fr.poec.gestion_rh.table;

public class Employeur {

	private int id;
	private String nom;
	private String adresse;
	private String convention;
	private String siren;

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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getConvention() {
		return convention;
	}

	public void setConvention(String convention) {
		this.convention = convention;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}
}

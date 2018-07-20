package fr.poec.gestion_rh.bdd;

import java.util.Date;

public class FixtureEmployee {
	
	String [] [] datas = new String [] [] {
		 
				{"jean","ducoin","2018-05-23","2019-08-25","CDI"}, 
				{"robert","dufoin","2018-05-23","2019-08-25","CDD"}, 
				{"françois","dupoint","2018-05-23","2019-08-25","INT"} 
		
		
	};
	
	public void generateDatas (int loop) {
		
		for (int i =0; i < loop; i++) {
			
		}
	}
	
}
// private int id;
// private String nom;
// private String prenom;
// private Date dateEntree;
// private Date dateSortie;
// private String typeContrat;
// private float salaireHoraire;
// private float dureeHebdomadaire;
// private boolean bulletinEmail;
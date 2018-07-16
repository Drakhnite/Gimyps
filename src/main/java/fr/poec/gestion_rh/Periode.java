package fr.poec.gestion_rh;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Periode {
	
		  // Définition de la propriété mounth.
		  private final StringProperty mounth = new SimpleStringProperty(this, "mounth", null);

		  // Getter.
		  public final String getMounth() {
		    return mounth.get();
		  }

		  // Setter.
		  public final void setMounth(final String value) {
		    mounth.set(value);
		  }

		  // Accès à la propriété.
		  public final StringProperty mounthProperty() {
		    return mounth;
		  }
		  
		  // Définition de la propriété year.
		  private final StringProperty year = new SimpleStringProperty(this, "year", null);

		  // Getter.
		  public final String getYear() {
		    return year.get();
		  }

		  // Setter.
		  public final void setYear(final String value) {
		    year.set(value);
		  }

		  // Accès à la propriété.
		  public final StringProperty yearProperty() {
		    return year;
		  }
	}

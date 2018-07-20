package fr.poec.gestion_rh.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ConventionController {

	public void Bulletin (ActionEvent event) throws Exception {
		Stage primarystage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("fxml/proto_projet_bulletin.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primarystage.setScene(scene);
		primarystage.show();
	}

public void Personnel (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("fxml/proto_projet_gestion_personnel.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

public void Conventions (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("fxml/proto_projet_conventions.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

public void Heures (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("fxml/proto_projet_heures.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

public void Parametres (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("fxml/proto_projet_param�tres.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

public void Accueil (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("fxml/proto_projet_page_accueil.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

public void CotisationsPatro (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("fxml/proto_projet_cotisationsPatro.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

public void CotisationsSal (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("fxml/proto_projet_cotisationsSal.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

// Fonction de d�connexion � modifier
public void Deconnexion (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("fxml/proto_projet_connexion.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

//Fonction de cr�ation de convention � modifier
public void Cr�er (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = null;
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

//Fonction de modification de convention � modifier
public void Modifier (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = null;
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

//Fonction de suppression de convention � modifier
public void Supprimer (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = null;
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

}
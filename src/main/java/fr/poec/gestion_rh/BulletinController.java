package fr.poec.gestion_rh;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BulletinController {

	
	public void Bulletin (ActionEvent event) throws Exception {
		Stage primarystage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/gestion_rh/proto_projet_bulletin.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primarystage.setScene(scene);
		primarystage.show();
	}

public void Personnel (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/gestion_rh/proto_projet_gestion_personnel.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

public void Conventions (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/gestion_rh/proto_projet_conventions.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

public void Heures (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/gestion_rh/proto_projet_heures.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

public void Parametres (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/gestion_rh/proto_projet_paramètres.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

public void Accueil (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/gestion_rh/proto_projet_page_accueil.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

// Fonction de déconnexion à modifier
public void Deconnexion (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/gestion_rh/proto_projet_connexion.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

// Fonction de création de bulletin à modifier
public void Créer (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = null;
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}

//Fonction de recherche à modifier
public void Rechercher (ActionEvent event) throws Exception {
	Stage primarystage = new Stage();
	Parent root = null;
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primarystage.setScene(scene);
	primarystage.show();
}


}
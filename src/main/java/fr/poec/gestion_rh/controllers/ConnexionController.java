package fr.poec.gestion_rh.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConnexionController {

	@FXML
	private Text txtConnexion;
	
	@FXML
	private TextField txtUserName;
	
	@FXML
	private PasswordField txtPassword;
	
	public void SeConnecter(ActionEvent event) throws Exception {
		if(txtUserName.getText().equals("user") && txtPassword.getText().equals("password")) {
			txtConnexion.setText("Connexion réussie");
			Stage primarystage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/gestion_rh/proto_projet_connexion.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primarystage.setScene(scene);
			primarystage.show();
		} else { 
			txtConnexion.setText("Connexion échouée. Réessayez");
		}
	}
}
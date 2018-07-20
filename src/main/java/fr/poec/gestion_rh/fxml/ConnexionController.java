package fr.poec.gestion_rh.fxml;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

	@FXML
	private Button connect;

	@FXML
	void connect(ActionEvent event) {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("\\fxml\\proto_projet_page_accueil.fxml"));
			Stage stage = (Stage) connect.getScene().getWindow();
			Scene scene = new Scene(loader.load());
			stage.setScene(scene);
		} catch (IOException io) {
			io.printStackTrace();
		}
	}


	// public void SeConnecter(ActionEvent event) throws Exception {
	// if(txtUserName.getText().equals("user") &&
	// txtPassword.getText().equals("password")) {
	// txtConnexion.setText("Connexion réussie");
	// Stage primarystage = new Stage();
	// Parent root =
	// FXMLLoader.load(getClass().getResource("fxml/proto_projet_connexion.fxml"));
	// Scene scene = new Scene(root,400,400);
	// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	// primarystage.setScene(scene);
	// primarystage.show();
	// } else {
	// txtConnexion.setText("Connexion échouée. Réessayez");
	// }
	// }
}
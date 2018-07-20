package fr.poec.gestion_rh;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane root;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("GIMYPS");

		initRootLayout();

		showConnexion();
	}

	/**
	 * Initializes the root layout.
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("\\fxml\\root.fxml"));
			root = (BorderPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Shows the person overview inside the root layout.
	 */
	public void showConnexion() {
		try {
			// Localisation du fichier FXML.
			final URL url = getClass().getResource("\\fxml\\proto_projet_connexion.fxml");
			// Création du loader.
			final FXMLLoader fxmlLoader = new FXMLLoader(url);
			// Chargement du FXML.
			final AnchorPane root = (AnchorPane) fxmlLoader.load();
			// Création de la scène.
			final Scene scene = new Scene(root);
			primaryStage.setScene(scene);
		} catch (IOException ex) {
			System.err.println("Erreur au chargement: " + ex);
		}
		primaryStage.setTitle("GIMYPS");
		primaryStage.show();
	}
	// try {
	// // Load person overview.
	// FXMLLoader loader = new FXMLLoader();
	// loader.setLocation(MainApp.class.getResource("\\fxml\\proto_projet_connexion.fxml"));
	// AnchorPane connexion = (AnchorPane) loader.load();
	//
	// // Set connexion into the center of root layout.
	// root.setCenter(connexion);
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }

	/**
	 * Returns the main stage.
	 * 
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
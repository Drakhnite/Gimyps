//package fr.poec.gestion_rh;
//
//import java.io.IOException;
//
//import fr.poec.gestion_rh.table.Login;
//import fr.poec.gestion_rh.table.controler.Controler_Login;
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.stage.Stage;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//
//public class Main extends Application {
//	@Override
//	public void start(Stage primaryStage) {
//		
//		this.primaryStage = primaryStage;
//        this.primaryStage.setTitle("AddressApp");
//
//        init();
//
//        showPersonOverview();
//    }
//		try {
//			Parent root = FXMLLoader.load(getClass().getResource("Root.fxml"));
//			Scene scene = new Scene(root, 400, 400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void main(String[] args) throws IOException {
//
//		Controler_Login loginC = new Controler_Login();
//
//		System.out.println("coucou");
//		for (Login login : loginC.getDataFromTable()) {
//			System.out.println(Login.getUser());
//
//		}
//		launch(args);
//	}
//}
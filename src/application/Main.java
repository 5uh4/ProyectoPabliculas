package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
//	Argumentos para el inicio del programa
//	
//	--module-path C:\javafx\javafx-sdk-19\lib
//
//	--add-modules javafx.controls,javafx.fxml

	@Override
	public void start(Stage primaryStage) {

		AnchorPane ap;

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/views/Login.fxml"));
			ap = loader.load();

			Scene scene = new Scene(ap);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
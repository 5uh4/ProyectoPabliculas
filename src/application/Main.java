package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Usuario;
import utils.Listas;
import views.LoginController;

public class Main extends Application {

//	Argumentos para el inicio del programa
//	
//	--module-path C:\javafx\javafx-sdk-19\lib
//
//	--add-modules javafx.controls,javafx.fxml

	@Override
	public void start(Stage primaryStage) {

		Usuario u1 = new Usuario("a", "a", "a");
		Usuario u2 = new Usuario("b", "b", "b");
		Usuario u3 = new Usuario("c", "c", "c");
		Listas.listaUsuarios.add(u1);
		Listas.listaUsuarios.add(u2);
		Listas.listaUsuarios.add(u3);

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
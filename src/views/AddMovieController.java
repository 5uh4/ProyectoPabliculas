package views;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddMovieController {

    @FXML
    private Button BtnBusqueda;

    @FXML
    private Label Back;

    @FXML
    void AddManual(MouseEvent event) {

    }

    @FXML
    void BuscarPeli(ActionEvent event) {

    }

    @FXML
    void Return(MouseEvent event) {
    	// TODO MUY IMPORTANTE - Cambiar el fxml al que accede, este lleva al login
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
		Parent root;
		try {
			root = loader.load();
			Stage nuevaStage = new Stage();
			nuevaStage.setScene(new Scene(root));
			nuevaStage.show();
			Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
			stage.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}

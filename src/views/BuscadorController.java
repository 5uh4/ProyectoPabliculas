package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BuscadorController {

	@FXML
	private Label Back;

	@FXML
	private Button BtnBusqueda;

	@FXML
	private TextField BuscadorTxtF;

	@FXML
	private ChoiceBox<String> ChoiceBoxType;

	/*
	 * Asi se añaden elementos 
	 * choiceBox.getItems().add("Choice 1");
	 * choiceBox.getItems().add("Choice 2"); 
	 * choiceBox.getItems().add("Choice 3");
	 * 
	 * Y asi se sabe que se ha elegido
	 * String value = (String) choiceBox.getValue();
	 */

	@FXML
	void BuscarPeli(ActionEvent event) {

	}

	@FXML
	void Return(MouseEvent event) {

	}

}

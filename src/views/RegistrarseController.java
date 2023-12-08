package views;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Usuario;
import utils.Listas;

public class RegistrarseController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button btnCrearUsuario;

	@FXML
	private ImageView ivAvatar;

	@FXML
	private ImageView ivLogo;

	@FXML
	private Label lblAtras;

	@FXML
	private AnchorPane panelCentral;

	@FXML
	private AnchorPane panelFondo;

	@FXML
	private TextField tfEmail;

	@FXML
	private TextField tfPassword;

	@FXML
	private TextField tfRepetirPassword;

	@FXML
	private TextField tfUsuario;

	@FXML
	void initialize() {

	}

	@FXML
	void registrar(ActionEvent event) {
		if (tfUsuario.getText().isEmpty() || tfPassword.getText().isEmpty() || tfRepetirPassword.getText().isEmpty()
				|| tfEmail.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Rellene todas las celdas.");
		} else {
			if (tfPassword.getText().equals(tfRepetirPassword.getText())) {
				Listas.listaUsuarios.add(new Usuario(tfUsuario.getText(), tfPassword.getText(), tfEmail.getText()));
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
					Parent root = loader.load();
					Stage nuevaStage = new Stage();
					nuevaStage.setScene(new Scene(root));
					nuevaStage.show();
					Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
					stage.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Contraseñas distintas.");
			}
		}
	}

	@FXML
	void atras(MouseEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
			Parent root = loader.load();
			Stage nuevaStage = new Stage();
			nuevaStage.setScene(new Scene(root));
			nuevaStage.show();
			Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
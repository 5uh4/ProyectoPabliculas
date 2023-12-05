package views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class RegistrarseController {

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

}

package views;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnLogin;

    @FXML
    private ImageView ivLogo;

    @FXML
    private Label lblRegistrar;

    @FXML
    private AnchorPane panelCentral;

    @FXML
    private AnchorPane panelFondo;

    @FXML
    private TextField tfPassword;

    @FXML
    private TextField tfUsuario;

    @FXML
    void initialize() {

    }
    
    @FXML
	void logear(ActionEvent event) {
    	
	}
    
    @FXML
	void registrarse(ActionEvent event) {
    	
	}

}
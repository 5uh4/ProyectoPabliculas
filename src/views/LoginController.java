package views;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import application.Main;
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

	private Main mainApp;
    
    @FXML
    void initialize() {

    }
    
    public Main getMainApp() {
		return mainApp;
	}

	public void setMainApp(Main mainApp) {
		this.mainApp = mainApp;
	}
    
    @FXML
	void logear(ActionEvent event) {
    	
    	boolean coincide = false;
    	for (Usuario u :Listas.listaUsuarios) {
    		if (u.getUsuario().equals(tfUsuario.getText()) && u.getPassword().equals(tfPassword.getText())) {
    			coincide = true;
    		}
    	}
    	
    	if (coincide) {
    		JOptionPane.showMessageDialog(null, "Usuario correcto.");
    	} else {
    		JOptionPane.showMessageDialog(null, "Usuario incorrecto.");
    	}
	}
    

    @FXML
    void registrarse(MouseEvent event) {
    	try {
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("Registrarse.fxml"));
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
package application.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class StatusBarController implements Initializable{
	
	@FXML
	private VBox statusBar;
	
	@FXML
	private Text statusText;

	public void initialize(URL location, ResourceBundle resources) {
		statusBar.setStyle("-fx-background-color: gainsboro");
		statusBar.setPadding(new Insets(10, 10, 10, 10));
		statusBar.setAlignment(Pos.CENTER_RIGHT);
		statusText.setText("Welcome to DeskTube.");
	}

}

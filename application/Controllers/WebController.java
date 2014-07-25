package application.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebController implements Initializable {
	
	@FXML
	private Pane webPane;
	
	@FXML
	private WebView webView;
	
	private WebEngine webEngine;

	public void initialize(URL arg0, ResourceBundle arg1) {

		webEngine = webView.getEngine();
		webEngine.load("http://youtube.com");
		
	}



}

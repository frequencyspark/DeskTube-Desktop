package application.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;

public class ChannelController implements Initializable {

	@FXML
	private StackPane channelListView;
	
	@FXML 
	private ListView<String> channelList;
	
	final ObservableList<String> listItems = FXCollections.observableArrayList("Add Channels");
	
	public void initialize(URL url, ResourceBundle rb) {
		
		channelList.setItems(listItems);
		
	}

}

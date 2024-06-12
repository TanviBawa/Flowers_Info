package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

public class SampleController {
	 @FXML
	    private AnchorPane ancor1;
	 
	  @FXML
	    private Text appName;

	    @FXML
	    private ImageView bluebell;

	    @FXML
	    private Button bluebell_btn;

	    @FXML
	    private ImageView camellia;

	    @FXML
	    private Button camellia_btn;

	    @FXML
	    private ImageView lily;

	    @FXML
	    private Button lily_btn;

	    @FXML
	    private ImageView pancy;

	    @FXML
	    private Button pancy_btn;

	    @FXML
	    private ImageView rose;

	    @FXML
	    private Button rose_btn;

	    @FXML
	    private ImageView tulip;

	    @FXML
	    private Button tulip_btn;

	    public void goToMain(ActionEvent event) throws IOException {
	    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	Scene scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();
	    	} 
	    
	    public void goToTulip(ActionEvent event) throws IOException {
	    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Tulip.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	Scene scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();
	    	} 
	    
	    public void goToLily(ActionEvent event) throws IOException {
	    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("lily.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	Scene scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();
	    	} 
	    
	    public void goToRose(ActionEvent event) throws IOException {
	    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("rose.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	Scene scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();
	    	} 
	    
	    public void goToBlueBell(ActionEvent event) throws IOException {
	    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("bluebell.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	Scene scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();
	    	} 
	    
	    public void goToCamellia(ActionEvent event) throws IOException {
	    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("camellia.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	Scene scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();
	    	} 

	    public void goToPancy(ActionEvent event) throws IOException {
	    	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("pancy.fxml"));
	    	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	Scene scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();
	    	} 

}

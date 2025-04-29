/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Utente
 */
public class ServerStartFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button yesBtn;
    
    @FXML
    private Button noBtn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void chatServer(ActionEvent event) throws IOException
    {
     Parent root = FXMLLoader.load(getClass().getResource("chatFXML.fxml"));
        
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("myChatFXServer");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
    @FXML
    public void chatClient(ActionEvent event) throws IOException
    {
     Parent root = FXMLLoader.load(getClass().getResource("chatFXML.fxml"));
        
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("myChatFXClient");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}

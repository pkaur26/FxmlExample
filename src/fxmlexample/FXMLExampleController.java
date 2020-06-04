/*
 * Parneet Kaur
 * Student ID = 991544633
 * SYST10199-WEB PROGRAMMING
 */
package fxmlexample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
/**
 *
 * @author parne
 */
public class FXMLExampleController {
    
    @FXML private Text actiontarget;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }
    }
    
     
    


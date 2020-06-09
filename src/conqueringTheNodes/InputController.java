/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringTheNodes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Admin
 */
public class InputController implements Initializable {
    
    @FXML
    private TextField n;
    
    @FXML
    private TextField t;
    
    @FXML
    private TextField m;
    
    @FXML
    private void changeScene(ActionEvent event) {
        System.out.println("You clicked me!");
        int n = Integer.parseInt(this.n.getText());
        int t = Integer.parseInt(this.t.getText());
        int m = Integer.parseInt(this.m.getText());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

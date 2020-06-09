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
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
        System.out.println("n: " + n +" t: " +t + " m: " +m);
        
    Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    //50 hardcoded, should be 'n' input
    Nodes nodes = new Nodes(n);
    Points[] vertices = nodes.getPoints();
    
    //3 is t, 5 is m inputs hardcoded
    Edges edges = new Edges(nodes, t, m);
    int[][] connectors = edges.getEdges();

    Graph<Points> graph = new UnweightedGraph<>(vertices, connectors);
    // Create a scene and place it in the stage
    Scene scene = new Scene(new GraphView(graph), 1000, 1000); //should be 1000x1000 kan? (fariz)
    stage.setTitle("ConqueringTheNodes"); // Set the stage title
    stage.setScene(scene); // Place the scene in the stage
    stage.show(); // Display the stage
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

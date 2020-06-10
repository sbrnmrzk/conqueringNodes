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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
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
    private Text errorMessage;

    int points, thread, time;

    @FXML
    private void buttonClick(ActionEvent event) {
        try {
            points = Integer.parseInt(this.n.getText());
            thread = Integer.parseInt(this.t.getText());
            time = Integer.parseInt(this.m.getText());
            System.out.println("n: " + n + " t: " + t + " m: " + m);
            this.changeScene(event);
        } catch (Exception e) {
            if (points < thread) {
                errorMessage.setText("Number of points should be more than thread");
            } else {
                errorMessage.setText("Please enter valid input");
            }
        }
    }

    private void changeScene(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Nodes nodes = new Nodes(this.points);
        Points[] vertices = nodes.getPoints();
        Edges edges = new Edges(nodes, this.thread, this.time);
        int[][] connectors = edges.getEdges();

        Graph<Points> graph = new UnweightedGraph<>(vertices, connectors);
        // Create a scene and place it in the stage
        Scene scene = new Scene(new GraphView(graph), 1000, 1000); //should be 1000x1000 kan? (fariz)
        stage.setTitle("Graph of nodes"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

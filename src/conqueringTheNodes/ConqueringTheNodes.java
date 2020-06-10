/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringTheNodes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class ConqueringTheNodes extends Application {
    
    Stage window;
    Scene input, graph;
    
    @Override
    public void start(Stage stage) throws Exception {
//        window = stage;
//        Parent root = FXMLLoader.load(getClass().getResource("InputFXML.fxml"));
//        this.input = new Scene(root);
////       //        
//       stage.setScene(this.input);
//       stage.show();
////        
//               
    //50 hardcoded, should be 'n' input
    Nodes nodes = new Nodes(50);
    Points[] vertices = nodes.getPoints();
    
    //3 is t, 5 is m inputs hardcoded
    Edges edges = new Edges(nodes, 3, 5);
    int[][] connectors = edges.getEdges();

    Graph<Points> graph = new UnweightedGraph<>(vertices, connectors);

    // Create a scene and place it in the stage
    Scene scene = new Scene(new GraphView(graph), 1000, 1000); //should be 1000x1000 kan? (fariz)
    stage.setTitle("ConqueringTheNodes"); // Set the stage title
    stage.setScene(scene); // Place the scene in the stage
    stage.show(); // Display the stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

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
    
     //timer 
    
    
    System.out.println("Task scheduled.");
    EdgeTimer edgetimer = new EdgeTimer(3);
    
 
    long elapsedTime = System.currentTimeMillis(); 
    long elapsedSeconds = elapsedTime / 1000;
    long secondsDisplay = elapsedSeconds % 60;
    long elapsedMinutes = elapsedSeconds / 60;


    //time elapsed broken down into hours, minutes and seconds
    int hours = (elapsedMinutes>59) ? (int) elapsedMinutes/60 : 0;
    int minutes = (elapsedMinutes>59) ? (int) elapsedMinutes%60 : (int)elapsedMinutes;
    int seconds = (elapsedSeconds>59) ? (int) elapsedSeconds%60 : (int) elapsedSeconds;

    //display elapsed time in readable format to user
    System.out.println("Time elapsed: "+ hours + " hours, " + minutes + " minutes and " + seconds + " seconds");              			
			

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

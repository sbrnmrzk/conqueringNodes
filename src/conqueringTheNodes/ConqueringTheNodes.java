package conqueringTheNodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ConqueringTheNodes extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
      
    //5 hardcoded, should be 'n' input
    Nodes nodes = new Nodes(5);
    Points[] vertices = nodes.getPoints();
    
    //3 is t, 5 is m inputs hardcoded
    Edges edges = new Edges(nodes,3, 5);
    int[][] connectors = edges.getEdges();

    Graph<Points> graph = new UnweightedGraph<>(vertices, connectors);

    // Create a scene and place it in the stage
    Scene scene = new Scene(new GraphView(graph), 750, 450);
    primaryStage.setTitle("ConqueringTheNodes"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

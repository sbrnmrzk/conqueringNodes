/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringTheNodes;

/**
 *
 * @author Admin
 */
public class Edges{

    private Nodes nodes;
    private int t;
    private int[][]edges;
    
    Edges(){
    }
    
    Edges(Nodes nodes, int t, int m){
        this.nodes = nodes;
        this.t = t;
                
        EdgeTimer timer = new EdgeTimer(m);
        //timer start
        //for(int i=0; i<t; i++) and if not exceed timer
        //EdgeThread e[i]= new EdgeThread();
        //e[i].start;
        
        //below is hard coded example
        int [][] edges = {
      {0, 8}, {0, 3}, {0, 5}, {1, 0}, {1, 2}, {1, 3},
      {2, 1}, {2, 3}, {2, 4}, {2, 10},
      {3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
      {4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
      {5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
      {6, 5}, {6, 7}, {7, 4}, {7, 5}, {7, 6}, {7, 8},
      {8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
      {9, 8}, {9, 11}, {10, 2}, {10, 4}, {10, 8}, {10, 11},
      {11, 8}, {11, 9}, {11, 10}  
    };

        this.edges = edges;
    }

    public int[][] getEdges() {
      return this.edges; 
    }    


}

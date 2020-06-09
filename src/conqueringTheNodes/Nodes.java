/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringTheNodes;

import java.util.*;

/**
 *
 * @author Admin
 */
public class Nodes {
    private int noOfNodes;
    private Points[] points;
    private static final float max = 1000, min = 1;
    
    Nodes(){
        
    }
    
    Nodes(int noOfNodes){
        this.noOfNodes = noOfNodes;
        
        this.points = new Points[noOfNodes];

        for (int i = 0; i < noOfNodes; i ++) {
          points[i] = new Points(
//                  Character.toString((char) (i + 'A')), 
                  Integer.toString(i+1), 
                  (float) (Math.random() * max) - min, 
                  (float) (Math.random() * max) - min);
        }
        this.points=points;
    }
    
    public Points [] getPoints(){
        return this.points;
    }
    
    
    
}

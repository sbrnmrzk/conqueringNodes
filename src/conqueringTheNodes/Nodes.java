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
    
    Nodes(){
        
    }
    
    Nodes(int noOfNodes){
        this.noOfNodes = noOfNodes;
        
        //hardcoded example
        Points[] points = {
        new Points("Seattle", 75, 50),
        new Points("San Francisco", 50, 210),
        new Points("Los Angeles", 75, 275), 
        new Points("Denver", 275, 175),
        new Points("Kansas City", 400, 245),
        new Points("Chicago", 450, 100), 
        new Points("Boston", 700, 80),
        new Points("New York", 675, 120), 
        new Points("Atlanta", 575, 295),
        new Points("Miami", 600, 400), 
        new Points("Dallas", 408, 325),
        new Points("Houston", 450, 360) 
        };
        
        //bawah ni format example to generate
        //        Points [] points = new Points[this.noOfNodes];
        //        for(int i=0; i<noOfNodes; i++){
        //            //randomly generate x and y
        //
        //        }
        this.points=points;
    }
    
    public Points [] getPoints(){
        return this.points;
    }
    
    
    
}

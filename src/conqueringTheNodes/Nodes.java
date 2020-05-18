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
        
        //hardcoded example, edited abit -F
        Points[] points = {
            new Points("A", 100, 200),
            new Points("B", 200, 300),
            new Points("C", 300, 400),
            new Points("D", 650, 650),
            new Points("E", 500 , 600),
            new Points("F", 75, 50),
            new Points("G", 50, 210),
            new Points("H", 75, 275), 
            new Points("I", 275, 175),
            new Points("J", 400, 245),
            new Points("K", 450, 100), 
            new Points("L", 700, 80),
            new Points("M", 675, 120), 
            new Points("N", 575, 295),
            new Points("O", 600, 400), 
            new Points("P", 408, 325),
            new Points("Q", 450, 360) 
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringTheNodes;

import java.util.*;
import java.util.stream.*;

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
    
    Nodes(int noOfNodes) {
            Random random = new Random();

            List<Integer> positions = IntStream.rangeClosed(0, 1000)
                    .boxed()
                    .collect(Collectors.toList());

            this.noOfNodes = noOfNodes;

            this.points = new Points[noOfNodes];

            for (int i = 0; i < noOfNodes; i ++) {
                if (positions.size() < 2) {
                    throw new IllegalStateException("No more positions available.");
                }
                float first = positions.remove(random.nextInt(positions.size()));
                
                float second = positions.remove(random.nextInt(positions.size()));

                points[i] = new Points(Integer.toString(i+1), first, second);
            }
            this.points = points;
        }
    
    public Points [] getPoints(){
        return this.points;
    }
    
    
    
}

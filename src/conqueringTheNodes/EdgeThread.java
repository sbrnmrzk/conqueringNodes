/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringTheNodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Callable;

/**
 *
 * @author Admin
 */
public class EdgeThread implements Callable<String> {
    
    private Nodes nodes;
    private int[][] edges;
    private int id;
    private int count = 0;
    
    public EdgeThread (int id, Nodes nodes) {
        this.id = id;
        this.nodes = nodes;
    }
    
    @Override
    public String call() {
        System.out.println("Starting Process ID: " + id);
        String finalString = "";
        int finalCount = 0;
        
        while (count != 20 && count < 20) {
            finalString = EdgeManage.generateEdge(nodes, id);
            count = EdgeManage.getCount(id);
//            System.out.println("Thread " + id + " is adding, hence becoming " + finalString );
        }
        
        finalCount = EdgeManage.finalCount(id);
        System.out.println("Thread: " + id + ". Count: " + count + ". Final added: " + finalCount + ". Thread shutting down.");
        
        return finalString;
    }
}
    
    



//REFERENCES, ETC, DO NOT REMOVE FOR RESEARCH PURPOSE (except for when submiting W14) -F

//    public EdgeThread(Nodes nodes) {
//        this.nodes = nodes;
//    }
//    
//    public synchronized void addEdge(Nodes nodes) {
//        int rnd1 = new Random().nextInt(nodes.getPoints().length);
//        int rnd2 = new Random().nextInt(nodes.getPoints().length);
//        
//        s = s + "{" + rnd1 + ", " + rnd2 + "}, ";
//    }
//    
//    public String getString() {
//        return s;
//    }
//    public boolean check(int[][] edges, int toCheckValue1, int toCheckValue2) {
//        boolean result = false;
//        
//        result = Arrays.asList(edges).contains(toCheckValue1);
//        if (result == true) {
//            return result;
//        } else {
//            result = Arrays.asList(edges).contains(toCheckValue2);
//            return result;
//        }
//        
        
//    }
//    @Override
//    public void run() {
//        
//        for (int j = 0; j<20; j++) {
//            int rnd1 = new Random().nextInt(nodes.getPoints().length);
//            int rnd2 = new Random().nextInt(nodes.getPoints().length);
//            
//////            if (check(edges, rnd1, rnd2)) {
//////                System.out.println("Node already connected to another node, cancelling operation");
//////            } else {
////                System.out.print("Thread "+ ID + "= ");
//                s = s + "{" + rnd1 + ", " + rnd2 + "}, ";
////                System.out.println(s);
//////                j = 0;
//////            }
//////             if (success) {
//////                 j = 0;
//////             }
//        }
////        
////        System.out.println("Test from " + ID);
//        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//}

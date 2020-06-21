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

    public EdgeThread(int id, Nodes nodes) {
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

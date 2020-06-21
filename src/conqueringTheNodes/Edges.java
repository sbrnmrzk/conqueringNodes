/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringTheNodes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author Admin
 */
public class Edges {

    private Nodes nodes;
    private int t;
    private int[][] edges;
    private int m;

    Edges() {
    }

    Edges(Nodes nodes, int t, int m) throws InterruptedException, ExecutionException {
        this.nodes = nodes;
        this.t = t;
        this.m = m;
        String string = "";

        List<Future<String>> resultList = new ArrayList<>();

        ExecutorService executor = Executors.newFixedThreadPool(t);

        // GET AMOUNT OF THREADS (t), LOOP TO CREATE A NEW THREAD -F
        for (int i = 1; i <= t; i++) {
            Future<String> finalString = executor.submit(new EdgeThread(i, nodes));
            try {
                System.out.println("Started..");
                finalString.get(m, TimeUnit.SECONDS);
                System.out.println("Finished!");
            } catch (TimeoutException e) {
                finalString.cancel(true);
                System.out.println("Terminated!");
            }
            resultList.add(finalString); // basically add the final string using Future. -F

        }

        // conversion of the result received from future to string -F
        for (int i = 0; i < resultList.size(); i++) {
            Future<String> result = resultList.get(i);
            try {
                string = result.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

        // remove the last ", {" because it was looped, so the final one shouldn't have that -F
        String finalString = string.substring(0, string.length() - 2);

        System.out.println("Final String is = " + finalString);
        try {
            executor.awaitTermination(m, TimeUnit.SECONDS); // not sure about this, maybe timer? -F
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        String test = "";

        finalString = finalString.replace("{", ""); //replacing all { to "" -F
        finalString = finalString.substring(0, finalString.length() - 1); //ignoring last } -F
        String edge[] = finalString.split("},"); //separating all by "}," -F

        int final_edge[][] = new int[edge.length][edge.length];

        for (int i = 0; i < edge.length; i++) {
            edge[i] = edge[i].trim();
            String single_int[] = edge[i].split(", ");
            for (int j = 0; j < single_int.length; j++) {
                final_edge[i][j] = Integer.parseInt(single_int[j]);
            }
        }

        int[][] edges = final_edge;

        this.edges = edges;
    }

    public int[][] getEdges() {
        return this.edges;
    }

}

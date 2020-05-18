/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringTheNodes;

import java.util.Random;

/**
 *
 * @author TRIOLOGY-PC
 */
public class EdgeManage {
        private static volatile String s = "";
        private static ThreadLocal<Integer> counter = new ThreadLocal<Integer>();
        private static ThreadLocal<Integer> finalCount = new ThreadLocal<Integer>();

        
        public synchronized static String generateEdge(Nodes nodes, int id) {
                
                if(counter.get() == null) {
                    counter.set(0);
                }
                if (finalCount.get() == null) {
                    finalCount.set(0);
                }
                
                if (counter.get() == 20) {
                    System.out.println("Thread " + id + " has ended process due to 20 failed attempts");
                    return s;
                } else {
                    int rnd1 = new Random().nextInt(nodes.getPoints().length);
                    int rnd2 = new Random().nextInt(nodes.getPoints().length);

                    boolean check = true;
        //          System.out.println("Thread " + id + " accessing, current count = " + counter.get() + ", current string is = " + s );

                        if (s.contains("{" + Integer.toString(rnd1) + ",") == true) {
        //                    System.out.println("Detected duplicate rnd1 on left, cancelling operation!");
                            check = false;
                        } else if (s.contains(", " + Integer.toString(rnd1) + "}") == true) {
        //                    System.out.println("Detected duplicate rnd1 right, cancelling operation!");
                            check = false;
                        } else if (s.contains("{" + Integer.toString(rnd2) + ",") == true) {
        //                    System.out.println("Detected duplicate rnd2 left, cancelling operation!");
                            check = false;
                        } else if (s.contains(", " + Integer.toString(rnd2) + "}") == true) {
        //                    System.out.println("Detected duplicate rnd2 right, cancelling operation!");
                            check = false;
                        } else if (rnd1 == rnd2) {
        //                    System.out.println("Points are duplicated, rnd1 = rnd2, cancelling operation!");
                            check = false;
                        }

                        if (check == true) {
                            s = s + "{" + rnd1 + ", " + rnd2 + "}, ";
                            counter.set(0);
                            finalCount.set(finalCount.get().intValue() + 1);
                        } else {
                            counter.set(counter.get().intValue() + 1);
                        }



                    return s;
                }
                
                
        }
        public static Integer getCount(int id) {
            return counter.get().intValue();
        }
        
        public static Integer finalCount(int id) {
            return finalCount.get().intValue();
        }
}
        
    

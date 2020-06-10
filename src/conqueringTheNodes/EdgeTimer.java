/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringTheNodes;


import java.awt.Toolkit;
import java.util.TimerTask;
import java.util.Timer;
/**
 *
 * @author Admin
 */

public class EdgeTimer {
    //reference https://www.iitk.ac.in/esc101/05Aug/tutorial/essential/threads/timer.html

    Timer timer;
    Toolkit toolkit;
    private int id;
    private int count = 0;

    
    public EdgeTimer(int seconds) {
        
        
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(),
                       0,        //initial delay
                       1*1000);  //subsequent rate
       
    }
   
    class RemindTask extends TimerTask {
        
        int numWarningBeeps = 3;
        //int finalCount = EdgeManage.finalCount(id);

        @Override
        public void run() {
            
                
	    if (numWarningBeeps > 0) {
	        toolkit.beep();
		System.out.println("Beep!");
		numWarningBeeps--;
	    } else {
	        toolkit.beep();
                System.out.println("Time's up!");
	        //timer.cancel(); //Not necessary because we call System.exit
	        System.exit(0);   //Stops the AWT thread (and everything else)
        
            }
    }
}
    
 //   @Override
    /*public String call(){
            
        while (count != 20 && count < 20) {
            
            count = EdgeManage.getCount(id);
            System.out.println("");    
        }						


		String x="";

		//calculate final elapsed time
		long elapsedTime = System.currentTimeMillis();
		long elapsedSeconds = elapsedTime / 1000;
		long secondsDisplay = elapsedSeconds % 60;
		long elapsedMinutes = elapsedSeconds / 60;

		//calculate final elapsed time in hours and minutes (seconds are discarded)
		int hours = (elapsedMinutes>59) ? (int) elapsedMinutes/60 : 0;
		int minutes = (elapsedMinutes>59) ? (int) elapsedMinutes%60 : (int)elapsedMinutes;

		//display to user
		System.out.println(hours + " hours and " + minutes + " minutes");

		//exit the application
		System.exit(0);
                return x;

	}
*/
       
   
}  


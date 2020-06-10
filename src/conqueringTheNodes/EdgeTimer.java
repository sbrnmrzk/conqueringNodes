/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conqueringTheNodes;

import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author Admin
 */
public class EdgeTimer {
    //reference https://www.iitk.ac.in/esc101/05Aug/tutorial/essential/threads/timer.html

    Timer timer;

    public EdgeTimer(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {
        public void run() {

        }
    }
}

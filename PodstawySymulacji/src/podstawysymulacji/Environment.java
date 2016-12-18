/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package podstawysymulacji;

import java.util.Random;
import java.util.Timer;

/**
 *
 * @author ADMIN
 */
public class Environment implements Runnable {
    private Timer timer = new Timer();
    Random r;
    Queue queue;
    public Environment(Queue q1){
        q1 = null;
        
    }

    public Notification GenerateNotification(){
        return new Notification();
    }
    @Override
    public void run() {
        while(true){
            System.out.println("HO HO HO BITCH");
            try{
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
}

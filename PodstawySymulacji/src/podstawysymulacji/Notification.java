/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package podstawysymulacji;

import java.util.Random;

public class Notification{
    Random r = new Random();
    private int notificationNumber;
    private static int number = 0;
    private int priority;
    private int executionNumber;
    private int impetience;
    
    public Notification(){
        number++;
        notificationNumber = number;
        priority = r.nextInt(10);
        executionNumber = r.nextInt(10);
        impetience = r.nextInt(10);
    }
    
    public Notification(int a, int b){
        number++;
        notificationNumber = number;
        executionNumber =a;
        priority = b;
    }
    public Random getR() {
        return r;
    }

    public int getNotificationNumber() {
        return notificationNumber;
    }
    
    public int getExecutionNumber(){
        return executionNumber;
    }

    public int getPriority() {
        return priority;
    }
    
    

    
}

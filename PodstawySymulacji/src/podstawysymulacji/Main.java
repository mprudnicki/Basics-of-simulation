/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package podstawysymulacji;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        
         
        Scanner reader = new Scanner(System.in);
        System.out.println("STWORZENIE KOLEJKI:");
        System.out.println("1) FIFO ");
        System.out.println("2) LIFO ");
        int variant = reader.nextInt();
        String helper = ((variant == 1)? "FIFO" : "LIFO");
        Queue queue = new Queue(helper);
        
        
        System.out.println("Ograniczenie miejsc:");
        System.out.println("1) nieograniczone");
        System.out.println("2) ograniczone");
        int miejsca = reader.nextInt();
        if(miejsca == 1){
            System.out.println("LICZBA MIEJSC NIEOGRANICZONA");
            queue.isInfinite = true;
        }
        else if(miejsca == 2){
            System.out.println("Podaj liczbe miejsc");
            queue.isInfinite = false;
            queue.miejsca = reader.nextInt();
        }
               
        System.out.println("Priorytet");
        System.out.println("1) Tak");
        System.out.println("2) Nie");
        int isPrioritized = reader.nextInt();
        
        queue.isProritized = ((isPrioritized == 1)? true : false);
        
        for(int i = 0; i < 10; i++)
            queue.AddToQueue(new Notification());
        for(Notification n : queue){
            System.out.print(String.format("%2d  ", n.getNotificationNumber()));
            System.out.print(String.format("%2d  ", n.getExecutionNumber()));
            System.out.print(String.format("%2d", n.getPriority()));
            System.out.println();
        }
        
        Thread t = new Thread(new Environment(queue));
        t.start();
        
        
        
        
        
    }
    
}

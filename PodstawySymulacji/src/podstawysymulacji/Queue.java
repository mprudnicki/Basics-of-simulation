/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package podstawysymulacji;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Queue extends ArrayList<Notification>{

    boolean isInfinite;
    int miejsca;
    boolean isProritized;
    PriorityComparator pComparator;
    
    public Queue(String variant){
        if(variant == "FIFO")pComparator = new PriorityComparatorLIFO();
        else if(variant == "LIFO")pComparator = new PriorityComparatorLIFO();
    }

    private int i;
    Notification helper, helper2;
    
    public void AddToQueue(Notification z){
        i = 0;
        helper = null;
        if(!isInfinite){
            if(this.size() == miejsca)
                System.out.println("NIE MOZNA DODAC ELEMENTU, KOLEJKA PELNA");
            else
            {
                this.add(z);
                if(this.isProritized)Collections.sort(this, pComparator);
            }
        }
        else
        {
            this.add(z);
            if(this.isProritized)Collections.sort(this, pComparator);
        }
    }
    
    
    public Notification getHead(){
        return this.get(0);
    }

    public void RemoveElement(int index){
        this.remove(i);
    }
   
    
}

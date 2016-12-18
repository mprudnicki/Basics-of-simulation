/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package podstawysymulacji;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class PriorityComparatorFIFO extends PriorityComparator {

    PriorityComparatorFIFO() {}

    @Override
    public int compare(Object o1, Object o2) {
        Notification n1 = (Notification) o1;
        Notification n2 = (Notification) o2;
        if(n1.getExecutionNumber() == n2.getExecutionNumber())
            if(n1.getPriority() == n2.getPriority())
                return 1;
            else return n1.getPriority() - n2.getPriority();
        else return n1.getExecutionNumber() - n2.getExecutionNumber();
    }
    
}

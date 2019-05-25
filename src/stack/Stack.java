/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.LinkedList;

/**
 *
 * @author dps
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static LinkedList li=new LinkedList();   
    public static void push(Object ele){
        li.addFirst(ele);
    }
     public static Object pop(){
         return li.removeFirst();
     }
     public static Object peek(){
         return li.get(0);
     }
     public static int size(){
         return li.size();
     }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author dps
 */
public class CallingClass {
    public static void main(String args[]){
        Stack s=new Stack();
        s.push("asdf");
        s.push("qwert");
        try{
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        
        }
        catch(EmptyError e){
            System.out.println(e);
        }
        System.out.println(s.inEmpty());
    }
}

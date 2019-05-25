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
public class EmptyError extends Throwable{
    @Override
    public String getMessage(){
        return "Stack is empty";
    }
    
    @Override
    public String toString(){
        return "Error: Stack empty exception";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.*;
/**
 *
 * @author dps
 */
public class Palindrome {
    public static void main(String args[]){
        System.out.println(new Palindrome().isPalindrome("asd,dsa?"));
        
    }
    public boolean isPalindrome(String inp){
        LinkedList<Character> charList=new LinkedList<>();
        inp=inp.toLowerCase();
        StringBuilder bob=new StringBuilder(inp.length());
        for(int i=0;i<inp.length();i++){
            if(inp.charAt(i)>='a' && inp.charAt(i)<='z'){
                bob.append(inp.charAt(i));
                charList.push(inp.charAt(i));
            }
        }
        StringBuilder bob2=new StringBuilder(inp.length());
        charList.forEach(gg->bob2.append(gg));
        return bob.toString().equals(bob2.toString());
    }
}

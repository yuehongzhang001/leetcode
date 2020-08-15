/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class Offer09 {
    Stack<Integer> stackin;
    Stack<Integer> stackout;
     public CQueue() {
         stackin = new Stack();
         stackout = new Stack();
    }
    
    public void appendTail(int value) {
        stackin.push(value);
    }
    
    public int deleteHead() {
        if(stackout.isEmpty()){
            while(!stackin.isEmpty()){
                stackout.push(stackin.pop());
            }
        }
        return stackout.isEmpty()?-1:stackout.pop();
    }
}

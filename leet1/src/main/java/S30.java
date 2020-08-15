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
public class S30 {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack=new Stack();
        minStack=new Stack();
    }
    
    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty() || minStack.peek()>x)
            minStack.push(x);
        else
            minStack.push(minStack.peek());
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.ArrayList;
import java.util.Stack;
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> miniStack;
    public MinStack() {
        stack=new Stack();
        miniStack=new Stack();
        miniStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        stack.push(x);
        if(x<miniStack.peek())
            miniStack.push(x);
        else
            miniStack.push(miniStack.peek());
    }
    
    public void pop() {
        stack.pop();
        miniStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return miniStack.peek();
    }
}

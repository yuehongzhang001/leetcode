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
public class No682 {
    public int calPoints(String[] ops) {
        int sum=0;
        Stack<Integer> stack = new Stack();
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("C")){
                if(!stack.isEmpty())
                    stack.pop();
            }else if(ops[i].equals("D")){
                if(!stack.isEmpty())
                    stack.push(stack.peek()*2);
            }else if(ops[i].equals("+")){
                if(!stack.isEmpty()){
                    stack.push(stack.get(stack.size()-2)+stack.peek());
                }
            }else{
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        for(Integer n:stack){
            sum+=n;
        }
        return sum;
    }
}

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
public class No1544 {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack();
        for(char c:s.toCharArray()){
            
            if(!stack.isEmpty() && stack.peek()!=c && Character.toLowerCase(c)==Character.toLowerCase(stack.peek())){
                stack.pop();
            }else
                stack.push(c);
        }
       StringBuilder sb = new StringBuilder();
       for(Character c:stack)
           sb.append(c);
        return sb.toString();
    }
}

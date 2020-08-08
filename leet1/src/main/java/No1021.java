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
public class No1021 {
    public String removeOuterParentheses(String S) {
        Stack<Integer> stack=new Stack();
        StringBuilder sb=new StringBuilder(S);
        Stack<Integer> ss = new Stack();
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(c=='('){
                if(stack.isEmpty())
                    ss.push(i);
                stack.push(i);
            }
            else{
                if(stack.size()==1)
                    ss.push(i);
                stack.pop();
            }  
        }
        while(!ss.isEmpty()){
            sb.deleteCharAt(ss.pop());
        }
        return sb.toString();
    }
    
    public String removeOuterParentheses1(String S) {
        Stack<Character> stack=new Stack();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(c=='('){
                if(!stack.isEmpty()){
                    sb.append('(');
                }
                stack.push('(');
            }else{
                if(stack.size()!=1){
                    sb.append(')');
                }
                stack.pop();
            }
        }
        return sb.toString();
    }
    
     public String removeOuterParentheses2(String S){
         StringBuilder sb=new StringBuilder();
         int level=0;
         for(char c:S.toCharArray()){
             if(c==')') level--;
             if(level>0) sb.append(c);
             if(c=='(') level++;
         }
         return sb.toString();
     }
}

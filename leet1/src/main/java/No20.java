/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.Stack;
import java.util.HashMap;
public class No20 {
     public static boolean isValid(String s) {
         Stack<Character> stack = new Stack();
         for(int i=0;i<s.length();i++){
             char c = s.charAt(i);
             if(c=='{'||c=='('||c=='['){
                 stack.push(c);
             }else{
                 if(stack.empty()||!match(stack.pop(),c))
                     return false;
             }
         }
         return stack.empty();
    }
     
    public static boolean match(char c1,char c2){
        if(c1=='(') 
            return c2==')';
        else if(c1=='{') 
            return c2=='}';
        else
            return c2==']';
    }
    
    public static boolean isValid1(String s) {
        HashMap<Character,Character> map=new HashMap();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                char topc=stack.empty()?'#':stack.pop();
                if(topc==map.get(c))
                    return false;
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
    
    public static boolean isValid2(String s) {
        if(s.contains("()")||s.contains("[]")||s.contains("{}")){
            return  isValid2(s.replace("()", "").replace("[]", "").replace("{}", ""));
        }else{
            return s.isEmpty();
        }
    }
    
}

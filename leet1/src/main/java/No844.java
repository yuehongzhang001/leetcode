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
public class No844 {
    public boolean backspaceCompare(String S, String T) {
        int i=0;
        int j=0;
        char[] ss=S.toCharArray();
        char[] tt=T.toCharArray();
        for(char c:ss){
            if(c=='#'){
                i=i==0?0:i-1;
            }else{
                ss[i]=c;
                i++;
            }
        }
        for(char c:tt){
            if(c=='#'){
                j=j==0?0:j-1;
            }else{
                tt[j]=c;
                j++;
            }
        }
        if(i!=j)
            return false;
        for(int k=0;k<j;k++){
            if(ss[k]!=tt[k])
                return false;
        }
        return true;
    }
    public boolean backspaceCompare1(String S, String T){
        return build(S).equals(build(T));
    }
    public String build(String s){
        Stack<Character> stack =new Stack();
        for(char c:s.toCharArray()){
            if(c!='#')
                stack.push(c);
            else if(!stack.isEmpty())
                stack.pop();
        }
        return String.valueOf(stack);
    }
}

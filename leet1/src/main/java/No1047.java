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
public class No1047 {
    public String removeDuplicates(String S) {
        StringBuilder sb =new StringBuilder();
        boolean flag=false;
        int i=0;
        for(;i<S.length()-1;i++){
            if(S.charAt(i)!=S.charAt(i+1))
                sb.append(S.charAt(i));
            else{
                i++;
                flag=true;
            }    
        }
        if(i<S.length()) sb.append(S.charAt(i));
        //test(sb.toString());
        if(!flag) return S;
        else return removeDuplicates(sb.toString());
    }
    public void test(String S){
        System.out.println(S);
    }
    public String removeDuplicates1(String S){
        StringBuilder sb = new StringBuilder();
        for(char c: S.toCharArray()){
            int len =sb.length();
            if(len!=0 && sb.charAt(len-1)==c){
                sb.deleteCharAt(len-1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

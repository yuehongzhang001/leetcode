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
public class No784 {
    List<String> list=new ArrayList();
    public List<String> letterCasePermutation(String S) {
        go(S,0);
        return list;
    }
    public void go(String s,int i){
        while(i<s.length() && !Character.isAlphabetic(s.charAt(i))){
            i++;
        }
        if(i==s.length())
            list.add(s);
        else{
            char c= s.charAt(i);
            go(s.substring(0, i)+Character.toLowerCase(c)+s.substring(i+1),i+1);
            go(s.substring(0, i)+Character.toUpperCase(c)+s.substring(i+1),i+1);
        }
    }
    
    public List<String> letterCasePermutation1(String S){
         List<StringBuilder> list=new ArrayList();
         list.add(new StringBuilder());
         for(int i=0;i<S.length();i++){
             char c=S.charAt(i);
             int size=list.size();//因为后面加入新的元素会让list逐渐变大，所以要提前知道原来的大小。
             if(Character.isAlphabetic(c)){
                 for(int j=0;j<size;j++){
                     StringBuilder sb1=list.get(j);
                     StringBuilder sb2=new StringBuilder(sb1);
                     sb1.append(Character.toLowerCase(c));
                     sb2.append(Character.toUpperCase(c));
                     list.add(sb2);
                 }
             }else{
                 for(int j=0;j<size;j++){
                     StringBuilder sb1=list.get(j);
                     sb1.append(c);
                 }
             }
         }
         List<String> res=new ArrayList();
         for(StringBuilder sb: list)
             res.add(sb.toString());
         return res;
         
    }
    
    
}

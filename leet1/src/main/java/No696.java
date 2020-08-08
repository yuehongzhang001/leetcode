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
public class No696 {
    public int countBinarySubstrings(String s) {
        int count=0;
        String s1="01";
        String s2="10";
        while(s1.length()<=s.length()){
            int i=0;
            while(s.indexOf(s1, i)!=-1){
                count++;
                i=s.indexOf(s1,i)+1;
            }
            int j=0;
            while(s.indexOf(s2, j)!=-1){
                count++;
                j=s.indexOf(s2,j)+1;
            }
            s1="0"+s1+"1";
            s2="1"+s2+"0";
        }
        return count;
    }
     public int countBinarySubstrings1(String s){
         ArrayList<Integer> list =new ArrayList();
         int start=0;
         for(int i=1;i<s.length();i++){
             if(s.charAt(i)!=s.charAt(i-1)){
                 list.add(i-start);
                 start=i;
             }   
         }
         list.add(s.length()-start);
         int res=0;
         for(int i=1;i<list.size();i++){
             res+=Math.min(list.get(i), list.get(i-1));
         }
         return res;
         
     }
     public int countBinarySubstrings2(String s){
         int start=0;
         int prev=0;
         int res=0;
         for(int i=1;i<s.length();i++){
             if(s.charAt(i)!=s.charAt(i-1)){
                 res+=Math.min(prev, i-start);
                 prev=i-start;
                 start=i;
             }   
         }
         res+=Math.min(prev, s.length()-start);
         return res;
         
     }
    
}

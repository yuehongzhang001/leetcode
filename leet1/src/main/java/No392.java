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
public class No392 {
    
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        for(;i<s.length()&&j<t.length();){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else
                j++;
        }
        return i==s.length();
    }
    
    public static boolean isSubsequence1(String s, String t){
        ArrayList<Integer>[] map = new ArrayList[26];
        for(int i=0;i<t.length();i++){
            int c = t.charAt(i)-'a';
            if(map[c]==null){
                map[c]=new ArrayList();
                map[c].add(i);
            } 
            else
                map[c].add(i);
        }
        System.out.println("Map:");
        for(int i=0;i<map.length;i++){
            System.out.print((char)(i+'a')+": ");
            if(map[i]!=null){
                for(int k:map[i])
                    System.out.print(k+",");
            }
            System.out.println();
        }
        int lastIndex=-1;
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i)-'a';
            if(map[c]==null)
                return false;
            else{
                int left=0;
                int right = map[c].size()-1;
                ArrayList<Integer> list = map[c];
                if(list.get(right)<=lastIndex)
                    return false;
                while(left<right){
                    int mid = left+(right-left)/2;
                    if(list.get(mid)<=lastIndex)
                        left = mid+1;
                    else
                        right = mid;  
                }
                lastIndex = list.get(left);
            }
        }
        return true;
    }
}

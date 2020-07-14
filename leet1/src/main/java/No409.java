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
import java.util.Map.Entry;
public class No409 {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int count = map.getOrDefault(c, 0);
            map.put(c, count+1);
        }
        int len=0;
        for(Integer n:map.values()){
            len += n%2==0?n:n-1;
        }
        return len<s.length()?len+1:len;
    }
    public int longestPalindrome1(String s) {
        int[] counts = new int[52];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int index = (c>='a'?c-'a':c-'A'+26);
            counts[index]+=1;
        }
        int len=0;
        for(int i=0;i<52;i++){
            len+=counts[i]/2*2;
        }
        return len<s.length()?len+1:len;
    }
    
}

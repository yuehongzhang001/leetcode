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
public class No953 {
    public boolean isAlienSorted(String[] words, String order) {
        int[] map=new int[26];
        for(int i=0;i<26;i++){
            map[order.charAt(i)-'a']=i;
        }
        
        for(int i=0;i<words.length-1;i++){
            String current = words[i];
            String next = words[i+1];
            for(int j=0;j<current.length();j++){
                if(j==next.length())
                    return false;
                if(map[current.charAt(j)-'a']==map[next.charAt(j)-'a'])
                    continue;
                if(map[current.charAt(j)-'a']<map[next.charAt(j)-'a'])
                   break;
                if(map[current.charAt(j)-'a']>map[next.charAt(j)-'a'])
                    return false;
            }
        }
        return true;
    }
}

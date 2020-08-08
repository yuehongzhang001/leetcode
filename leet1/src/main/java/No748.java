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
public class No748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate=licensePlate.toLowerCase();
        HashMap<Character,Integer> map= new HashMap();
        for(int i=0;i<licensePlate.length();i++){
            char c=licensePlate.charAt(i);
            if(Character.isAlphabetic(c))
               map.put(c, map.getOrDefault(c, 0)+1);
        }
        int minLen=Integer.MAX_VALUE;
        String res="";
        for(int i=0;i<words.length;i++){
            String w=words[i];
            HashMap<Character,Integer> map2= new HashMap();
            for(int j=0;j<w.length();j++){
                char c=w.charAt(j);
                map2.put(c, map2.getOrDefault(c, 0)+1);
            }
            boolean fit=true;
            for(Character c:map.keySet()){
                if(map.get(c)>map2.getOrDefault(c, 0)){
                    fit=false;
                    break;
                }
            }
            if(fit && w.length()<minLen){
                minLen=w.length();
                res=w;
            }  
        }
        return res;
    }
}

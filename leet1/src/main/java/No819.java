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
public class No819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map =new HashMap();
        HashSet<String> set = new HashSet();
        for(String s:banned)
            set.add(s);
        for(String ss:paragraph.split("\\s+")){
            for(String s:ss.split(",")){
                if(!Character.isAlphabetic(s.charAt(s.length()-1)))
                s=s.substring(0,s.length()-1);
            s=s.toLowerCase();
            if(!set.contains(s))
                map.put(s, map.getOrDefault(s, 0)+1);
            }
        }
        int maxCount=0;
        String res="";
        for(String s:map.keySet()){
            if(map.get(s)>maxCount){
                res=s;
                maxCount=map.get(s);
            }
                
        }
        return res;
    }
    
    public String mostCommonWord1(String paragraph, String[] banned){
        HashMap<String,Integer> map =new HashMap();
        HashSet<String> set = new HashSet();
        for(String s:banned) set.add(s);
        paragraph+=".";
        StringBuilder sb =new StringBuilder();
        String res="";
        int frq = 0;
        for(char c:paragraph.toCharArray()){
            if(Character.isAlphabetic(c)){
                sb.append(c);
            }else if(sb.length()>0){
                String word = sb.toString().toLowerCase();
                int count=map.getOrDefault(word,0)+1;
                if(!set.contains(word)){
                    map.put(word, count);
                    if(count>frq){
                        res=word;
                        frq=count;
                    }
                }
                sb=new StringBuilder(); 
            }
        }
        return res;
    }
}

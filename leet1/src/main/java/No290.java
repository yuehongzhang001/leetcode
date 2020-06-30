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
public class No290 {
    
    
    public boolean wordPattern(String pattern, String str){
        HashMap<Character,String> map = new HashMap();
        String[] words = str.split(" ");
        if(pattern.length()!=words.length) return false;
        for(int i=0;i<words.length;i++){
            char c = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(word))
                    return false;
            }else{
                if(map.containsValue(word))
                    return false;
                else
                    map.put(c, word);
            }
        }
        return true;
    }
    

}

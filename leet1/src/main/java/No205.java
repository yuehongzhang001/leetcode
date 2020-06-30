/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.HashMap;
public class No205 {
     public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap();
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!map.containsKey(c1)&&!map.containsValue(c2))
                map.put(c1, c2);
            else{
                if(!map.containsKey(c1)||map.get(c1)!=c2)
                    return false;
            }
        }
        return true;
    }
     
    public boolean isIsomorphic1(String s, String t){
        int[] map1 = new int[128];
        int[] map2 = new int[128];
        int count=0;
        for(int i=0; i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(map1[c1]!=map2[c2])
                return false;
            else{
                if(map1[c1]==0){
                    map1[c1]=i+1;
                    map2[c2]=i+1;
                }   
            }
        }
        return true;
    }
}

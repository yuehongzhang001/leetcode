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
public class No884 {
    public String[] uncommonFromSentences(String A, String B) {
        ArrayList<String> list = new ArrayList();
        HashMap<String,Integer> map = new HashMap();
        for(String s:A.split("\\s+")){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s:B.split("\\s+")){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s:map.keySet()){
            if(map.get(s)==1)
                list.add(s);
        }
        return list.toArray(new String[list.size()]);
    }
}

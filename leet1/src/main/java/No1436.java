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
public class No1436 {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet();
        for(List<String> list:paths){
            set.add(list.get(0));
        }
        for(List<String> list:paths){
            String s=list.get(1);
            if(!set.contains(s))
                return s;
        }
        return null;
    }
}

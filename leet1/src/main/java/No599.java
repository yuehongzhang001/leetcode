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
public class No599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap();
        HashMap<String,Integer> m2 = new HashMap();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i], i);
        }
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i]))
                m2.put(list2[i], map.get(list2[i])+i);
        }
        int min=list1.length-1+list2.length-1;
        for(Integer n:m2.values()){
            min = Math.min(min, n);
        }
        ArrayList<String> list = new ArrayList();
        for(String s:m2.keySet()){
            if(m2.get(s)==min)
                list.add(s);
        }
        String[] res = new String[list.size()];
        list.toArray(res);
        return res;
    }
    
    public String[] findRestaurant1(String[] list1, String[] list2){
        HashMap<String,Integer> map = new HashMap();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i], i);
        }
        ArrayList<String> res = new ArrayList();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int sum = map.get(list2[i])+i;
                if(sum<min){
                    res.clear();
                    min=sum;
                    res.add(list2[i]);
                }else if(sum==min){
                    res.add(list2[i]);
                }
            }    
        }
        return res.toArray(new String[res.size()]);
    }
}

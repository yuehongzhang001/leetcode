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
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.LinkedHashSet;
public class No136 {
    public int singleNumber(int[] nums) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.remove(nums[i]);
            else
                map.put(nums[i], i);
        }
        int result=0;
        for(Entry<Integer, Integer> e: map.entrySet()){
            result = e.getKey();
        }
        return result;
    
    }
    
    public int singleNumber1(int[] nums){
        LinkedHashSet<Integer> set = new LinkedHashSet();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                set.remove(nums[i]);
            else
                set.add(nums[i]);
        }

        return (int)(set.toArray()[0]);
    }   
}

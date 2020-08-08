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
public class No594 {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count+1);
        }
        int max = 0;
        for(Integer i: map.keySet()){
            if(map.get(i+1)!=null){
                max = Math.max(max, map.get(i)+map.get(i+1));
            }
        }
        return max;
    }
    
    public int findLHS1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        int res = 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.containsKey(nums[i]+1))
                res= Math.max(res, map.get(nums[i])+map.get(nums[i]+1));
            if(map.containsKey(nums[i]-1))
                res = Math.max(res, map.get(nums[i])+map.get(nums[i]-1));
        }
        return res;
    }
}

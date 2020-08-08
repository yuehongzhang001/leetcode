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
public class No697 {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        ArrayList<Integer> list = new ArrayList();
        int max=0;
        for(int i=0;i<nums.length;i++){
            int count = map.getOrDefault(nums[i], 0);
            if(max<count+1){
                list.clear();
                list.add(nums[i]);
                max=count+1;
            }else if(max==count+1){
                list.add(nums[i]);
            }
            map.put(nums[i], count+1);
        }
        int min=nums.length;
        for(int n:list){
            int low=0;
            int high=nums.length-1;
            while(nums[low]!=n) low++;
            while(nums[high]!=n) high--;
            if(min>high-low+1)
                min=high-low+1;
        }
        return min;
    }
    
    public int findShortestSubArray1(int[] nums){
        HashMap<Integer, Integer> left = new HashMap(),
                right=new HashMap(), count = new HashMap();
        for(int i=0;i<nums.length;i++){
            int x =nums[i];
            if(!left.containsKey(x)) left.put(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0)+1);
        }
        int max=Collections.max(count.values());
        int min=nums.length;
        for(int n:count.keySet()){
            if(max==count.get(n)){
                min=Math.min(min, right.get(n)-left.get(n)+1);
            }
        }
        return min;
    }
}


import java.util.Arrays;

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
import java.util.Map.Entry;
public class No532 {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                while(j<nums.length-1 && nums[j]!=nums[j+1])
                    j++;
                if(nums[j]-nums[i]==k){
                    count++;
                    break;
                }
            }
            while(i<nums.length-1 && nums[i]==nums[i+1])
                i++;
        }
        return count;
    }
    
    public int findPairs1(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) //if same as the previous num
                continue;                   //jump to next num
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]>k)
                    break;
                if(nums[j]-nums[i]==k){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public int findPairs2(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) //if same as the previous num
                continue;                   //jump to next num
            int low = i+1;
            int high = nums.length-1;
            while(low<=high){
                int mid = (low+high)/2;
                if(nums[mid]-nums[i]==k){
                    count++;
                    break;
                }else if(nums[mid]-nums[i]>k){
                    high = mid-1;
                }else
                    low = mid+1;
            }
        }
        return count;
    }
    
     public int findPairs3(int[] nums, int k){
         if(k!=0){
             HashSet<Integer> set = new HashSet();
             for(int i=0;i<nums.length;i++){
                 set.add(nums[i]);
             }
             HashSet<Integer> res = new HashSet();
             for(int i=0;i<nums.length;i++){
                 if(set.contains(nums[i]+k))
                     res.add(nums[i]);
             }
             return res.size();
         }else{
             int res=0;
             HashMap<Integer,Integer> map = new HashMap();
             for(int i=0;i<nums.length;i++){
                 int count = map.getOrDefault(nums[i], 0);
                 map.put(nums[i], count+1);
             }
             for(Integer count:map.values()){
                 if(count>1)
                     res++;
             }
             return res;
         }
         
     }
     
     
     public int findPairs4(int[] nums, int k){
         if(k<0) return 0;
         HashSet<Integer> set = new HashSet();
         HashMap<Integer,Integer> map = new HashMap();
         for(int i=0;i<nums.length;i++){
             if(set.contains(nums[i]+k))
                 map.put(nums[i],nums[i]+k);
             if(set.contains(nums[i]-k))
                 map.put(nums[i]-k, nums[i]);
             set.add(nums[i]);
         }
         return map.size();
     }
}

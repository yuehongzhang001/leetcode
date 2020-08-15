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
public class Sword03 {
    public int findRepeatNumber(int[] nums) {
        int[] map=new int[100001];
        for(int n:nums){
            if(map[n]==0)
                map[n]++;
            else
                return n;
        }
        return -1;
    }
     public int findRepeatNumber1(int[] nums){
         HashSet<Integer> set = new HashSet();
         for(int n:nums){
             if(set.contains(n))
                 return n;
             else
                 set.add(n);
         }
         return -1;
     }
     
     public int findRepeatNumber2(int[] nums){
         int[] map = new int[nums.length];
         for(int num:nums){
             if(map[num]==0)
                map[num]++;
             else
                 return num;
         }
         return -1;
     }
     
     public int findRepeatNumber3(int[] nums){
         for(int i=0;i<nums.length;i++){

             int index=nums[i];
             if(nums[index]==nums[i])
                 return nums[i];
             else{
                 int tmp=nums[index];
                 
             }
             
             
                 
             else
                 nums[index]*=-1;
         }
         return -1;
     }
}

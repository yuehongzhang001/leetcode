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
public class No645 {
    public int[] findErrorNums(int[] nums) {
        int[] map = new int[nums.length];
        for(int n:nums){
            map[n-1]+=1;
        }
        int dup=-1;
        int miss=-1;
        for(int i=0;i<map.length;i++){
            if(map[i]==0)
                miss=i+1;
            else if(map[i]==2)
                dup=i+1;
        }
        return new int[]{dup,miss};
    }
    public int[] findErrorNums1(int[] nums){
        Arrays.sort(nums);
        int dup=-1;
        int miss=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                dup=nums[i];
            else if(nums[i]>nums[i-1]+1)
                miss=nums[i-1]+1;
        }
        return new int[]{dup,miss};
    }
    
    public int[] findErrorNums2(int[] nums){
        int dup=-1;
        int miss=-1;
        for(int i=0;i<nums.length;i++){
            int j=nums[i]-1;
            if(nums[j]<0)
                dup=nums[i];
            else
                nums[j]*=-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                miss=i+1;
            }  
        }
        return new int[]{dup,miss};
    }
}

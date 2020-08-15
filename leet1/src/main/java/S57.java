/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S57 {
    public int[] twoSum(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int sum=nums[low]+nums[high];
            if(sum==target) return new int[]{nums[low],nums[high]};
            else if(sum>target)
                high--;
            else
                low++;   
        }
        return new int[]{};
    }
}

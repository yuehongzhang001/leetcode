/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S42 {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i])
                ans=nums[i];
            
        }
    }
}

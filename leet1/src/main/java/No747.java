/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No747 {
    public int dominantIndex(int[] nums) {
        if(nums.length==1) return 0;
        int max1=nums[0];
        int max2=0;
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(max1<nums[i]){
                max2=max1;
                max1=nums[i];
                index=i;
            }else if(max1>nums[i] && max2<nums[i])
                max2=nums[i];
        }
        return max2*2<=max1?index:-1;
    }
}

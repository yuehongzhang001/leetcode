/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No674 {
    public int findLengthOfLCIS(int[] nums) {
        int start=0;
        int max=0;
        for(int i=1;i<=nums.length;i++){
            if(i==nums.length || nums[i]<nums[i-1]){
                max=Math.max(max, i-start);
                start=i;
            }    
        }
        return max;
    }
}

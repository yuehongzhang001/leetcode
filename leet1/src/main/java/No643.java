/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No643 {
    public double findMaxAverage(int[] nums, int k) {
        int pre=0;
        for(int i=0;i<k;i++){
            pre+=nums[i];
        }
        int max=pre;
        for(int i=0;i+k<nums.length;i++){
            pre = pre-nums[i]+nums[i+k];
            max = Math.max(max, pre);
        }
        return ((double)max)/k;
    }
}

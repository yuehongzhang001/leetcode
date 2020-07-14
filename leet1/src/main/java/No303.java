/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No303 {
    private int[] sums;
    public NumArray(int[] nums) {
        sums = new int[nums.length+1];
        sums[0]=0;
        for(int i=0;i<nums.length;i++){
            sums[i+1]=sums[i]+nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        return sums[j+1]-sums[i];
    }
    
    
    
}

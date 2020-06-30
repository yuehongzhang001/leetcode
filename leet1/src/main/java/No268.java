/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n+1)*n/2;
        for(int i=0;i<n;i++){
            sum-=nums[i];
        }
        return sum;
    }
}

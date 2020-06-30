/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No283 {
    public void moveZeroes(int[] nums) {
        int zeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zeros++;
            else{
                if(zeros>0){
                    nums[i-zeros]=nums[i];
                    nums[i]=0;
                }
            }
        }
    }
}

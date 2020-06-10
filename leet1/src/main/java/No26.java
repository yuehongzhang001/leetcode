/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int prevVal = nums[0];
        int i=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=prevVal){
                prevVal=nums[j];
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No724 {
    public int pivotIndex(int[] nums) {
        if(nums.length==0) return -1;
        int sum = 0;
        for(int n:nums) sum+=n;
        int left=0;
        int right=sum;
        for(int i=0;i<nums.length;i++){
            right=right-nums[i];
            if(left==right)
                return i;
            left+=nums[i];
        }
        return -1;
    }
}

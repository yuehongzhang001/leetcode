/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S21 {
    public int[] exchange(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            while(l<r && nums[l]%2==1)
                l++;
            while(l<r && nums[r]%2==0)
                r--;
            if(l>=r) break;
            int tmp=nums[l];
            nums[l]=nums[r];
            nums[r]=tmp;
        }
        return nums;
    }
}

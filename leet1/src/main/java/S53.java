/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S53 {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        int r=high;
        low=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        int l=low;
        return r-l;
    }
}

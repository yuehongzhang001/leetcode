/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No35 {
    public static int searchInsert(int[] nums, int target) {
        int len=nums.length;
        for(int i=0;i<len+1;i++){
            if(i==len || nums[i]>target){
                return i;

            }else if(nums[i]==target){
                return i;
            }
        }
        return 0;
    }
    public static int searchInsert1(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int middle=(low+high)/2;
            int mvalue=nums[middle];
            if(mvalue==target)
                return middle;
            else if(target<mvalue){
                high=middle-1;
            }else{
                low=middle+1;
            }
        }
        return low;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class No16 {
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int len = nums.length;
        int ans=33000;
        int diff=33000;
        for(int i=0;i<len-2;i++){
            int l=i+1;
            int r=len-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==target){
                    return sum;
                }else if(sum>target){
                    r--;
                    if(Math.abs(sum-target)<=diff){
                        ans=sum;
                        diff=Math.abs(sum-target);
                    }
                }else{
                    l++;
                    if(Math.abs(sum-target)<=diff){
                        ans=sum;
                        diff=Math.abs(sum-target);
                    }
                }
            }
        }
        return ans;
        
    }
    
    //错误解法，但是解决的是每个值到target的距离之和的最小值。
    public int threeSumClosest1(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int l = 0;
        int r = len - 1;
        if (nums[l] >= target) {
            return nums[l] + nums[l + 1] + nums[l + 2];
        } else if (nums[r] <= target) {
            return nums[r] + nums[r - 1] + nums[r - 2];
        } else {
            while (nums[l] < target) {
                l++;
            }
            int start = l - 3;
            int end = l + 2;
            while (start < 0) {
                start++;
            }
            while (end > len - 1) {
                end--;
            }
            int min = 33000;
            int ans = 0;
            for (int i = start; i + 2 <= end; i++) {
                int distance = Math.abs(nums[i] - target) + Math.abs(nums[i + 1] - target) + Math.abs(nums[i + 2] - target);
                if (distance <= min) {
                    ans = nums[i] + nums[i + 1] + nums[i + 2];
                    min = distance;
                }
            }
            return ans;
        }
    }
}
